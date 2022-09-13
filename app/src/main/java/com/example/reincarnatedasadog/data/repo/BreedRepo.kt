package com.example.reincarnatedasadog.data.repo

import com.example.reincarnatedasadog.R
import com.example.reincarnatedasadog.data.entity.*
import com.example.reincarnatedasadog.data.entity.relationship.BreedAndAllPersonalities
import com.example.reincarnatedasadog.data.source.BreedLocalDataSource
import com.example.reincarnatedasadog.data.source.ImageUriRemoteDataSource
import com.example.reincarnatedasadog.service.HttpService
import javax.inject.Inject

private const val TAG = "BREED_REPO"

interface BreedRepo {
    suspend fun submit(ids: List<Int>): Set<BreedAndAllPersonalities>
    suspend fun prepopulateBreedsTable()
    suspend fun getImageUri(breed: Breed): String?
}

class BreedRepoImpl @Inject constructor(
    private val breedLocalSource: BreedLocalDataSource,
    private val imageUriRemoteSource: ImageUriRemoteDataSource,
    private val httpService: HttpService
): BreedRepo {

    override suspend fun submit(ids: List<Int>): Set<BreedAndAllPersonalities> {
        val sanguine = Sanguine(
            isCarefree = R.id.carefree in ids,
            isLeader = R.id.leadership in ids,
            isEasygoing = R.id.easygoing in ids,
            isLively = R.id.lively in ids,
            isOutgoing = R.id.outgoing in ids,
            isResponsive = R.id.responsive in ids,
            isSociable = R.id.sociable in ids,
            isTalkative = R.id.talkative in ids,
        )

        val choleric = Choleric(
            isActive = R.id.active in ids,
            isAggressive = R.id.aggressive in ids,
            isChangeable = R.id.changeable in ids,
            isExcitable = R.id.excitable in ids,
            isImpulsive = R.id.impulsive in ids,
            isOptimistic = R.id.optimistic in ids,
            isRestless = R.id.restless in ids,
            isTouchy = R.id.touchy in ids
        )

        val phlegmatic = Phlegmatic(
            isCalm = R.id.calm in ids,
            isCareful = R.id.careful in ids,
            isControlled = R.id.controlled in ids,
            isEvenTempered = R.id.even_tempered in ids,
            isPassive = R.id.passive in ids,
            isPeaceful = R.id.peaceful in ids,
            isReliable = R.id.reliable in ids,
            isThoughtful = R.id.thoughtful in ids
        )

        val melancholic = Melancholic(
            isAnxious = R.id.anxious in ids,
            isMoody = R.id.moody in ids,
            isPessimistic = R.id.pessimistic in ids,
            isQuiet = R.id.quiet in ids,
            isReserved = R.id.reserved in ids,
            isRigid = R.id.rigid in ids,
            isSober = R.id.sober in ids,
            isUnsociable = R.id.unsociable in ids
        )

        return getBreedsAndMatchingPersonalities(
            sanguine,
            choleric,
            phlegmatic,
            melancholic
        )
    }

    private suspend fun getBreedsAndMatchingPersonalities(
        sanguine: Sanguine,
        choleric: Choleric,
        phlegmatic: Phlegmatic,
        melancholic: Melancholic
    ): Set<BreedAndAllPersonalities> {
        val nTuple4 = breedLocalSource.getBreedsAndMatchingPersonalities(
            sanguine,
            choleric,
            phlegmatic,
            melancholic
        )

        val set = mutableSetOf<BreedAndAllPersonalities>()

        //Add sanguines if exist
        nTuple4.breedsAndSanguine.forEach {
            set.add(BreedAndAllPersonalities(breed = it.breed, sanguine = it.sanguine))
        }

        //Add Choleric if exist
        nTuple4.breedsAndCholeric.forEach {
            val existingItem = set.find { item -> item.breed.id == it.breed.id }

            if (existingItem == null){
                set.add(BreedAndAllPersonalities(breed = it.breed, choleric = it.choleric))
            } else {
                set.remove(existingItem)
                set.add(existingItem.copy(choleric = it.choleric))
            }
        }

        //Add Phlegmatic if exist
        nTuple4.breedsAndPhlegmatic.forEach {
            val existingItem = set.find { item -> item.breed.id == it.breed.id }

            if (existingItem == null){
                set.add(BreedAndAllPersonalities(breed = it.breed, phlegmatic = it.phlegmatic))
            } else {
                set.remove(existingItem)
                set.add(existingItem.copy(phlegmatic = it.phlegmatic))
            }
        }

        //Add Melancholic if exist
        nTuple4.breedsAndMelancholic.forEach {
            val existingItem = set.find { item -> item.breed.id == it.breed.id }

            if (existingItem == null){
                set.add(BreedAndAllPersonalities(breed = it.breed, melancholic = it.melancholic))
            } else {
                set.remove(existingItem)
                set.add(existingItem.copy(melancholic = it.melancholic))
            }
        }

        return set
    }

    override suspend fun getImageUri(breed: Breed): String? {
        return if (breed.sub.isNullOrEmpty()){
            imageUriRemoteSource.getImageUri(breed.parent)?.message
        } else {
            imageUriRemoteSource.getImageUri("${breed.parent}/${breed.sub}")?.message
        }
    }

    // Used for generating initial breed table only
    override suspend fun prepopulateBreedsTable(){
        val res = httpService.getAllBreeds()
        val allBreeds = mutableListOf<Breed>()

        res?.allBreedsMessage?.let { allBreedsMessage ->
            allBreedsMessage.fields.forEach { member ->
                val subBreeds = (member.call(allBreedsMessage) as List<*>?)

                if (subBreeds.isNullOrEmpty()){
                    allBreeds.add(
                        Breed(parent = member.name)
                    )
                } else {
                    subBreeds.forEach { subBreed ->
                        if (subBreed is String){
                            allBreeds.add(
                                Breed(parent = member.name, sub = subBreed)
                            )
                        }
                    }
                }
            }
        }

        breedLocalSource.insert(allBreeds)
    }
}