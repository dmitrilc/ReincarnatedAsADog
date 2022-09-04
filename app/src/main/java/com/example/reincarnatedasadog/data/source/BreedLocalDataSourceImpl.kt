package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.dao.BreedDao
import com.example.reincarnatedasadog.data.entity.*
import javax.inject.Inject

private const val TAG = "BREED_LOCAL_DS"

class BreedLocalDataSourceImpl @Inject constructor(private val breedDao: BreedDao)
    : BreedLocalDataSource {

    //TODO Do in one query
    override fun getBreedsAndMatchingPersonalities(
        sanguine: Sanguine,
        choleric: Choleric,
        phlegmatic: Phlegmatic,
        melancholic: Melancholic)
    : NTuple4 {
        val ids = breedDao.getIds(
            isCarefree = sanguine.isCarefree,
            isLeader = sanguine.isLeader,
            isEasygoing = sanguine.isEasygoing,
            isLively = sanguine.isLively,
            isOutgoing = sanguine.isOutgoing,
            isResponsive = sanguine.isResponsive,
            isSociable = sanguine.isSociable,
            isTalkative = sanguine.isTalkative,
            isActive = choleric.isActive,
            isAggressive = choleric.isAggressive,
            isChangeable = choleric.isChangeable,
            isExcitable = choleric.isExcitable,
            isImpulsive = choleric.isImpulsive,
            isOptimistic = choleric.isOptimistic,
            isRestless = choleric.isRestless,
            isTouchy = choleric.isTouchy,
            isCalm = phlegmatic.isCalm,
            isCareful = phlegmatic.isCareful,
            isControlled = phlegmatic.isControlled,
            isEvenTempered = phlegmatic.isEvenTempered,
            isPassive = phlegmatic.isPassive,
            isPeaceful = phlegmatic.isPeaceful,
            isReliable = phlegmatic.isReliable,
            isThoughtful = phlegmatic.isThoughtful,
            isAnxious = melancholic.isAnxious,
            isMoody = melancholic.isMoody,
            isPessimistic = melancholic.isPessimistic,
            isQuiet = melancholic.isQuiet,
            isReserved = melancholic.isReserved,
            isRigid = melancholic.isRigid,
            isSober = melancholic.isSober,
            isUnsociable = melancholic.isUnsociable
        )

        val breedsAndSanguine = breedDao.queryBreedsAndSanguine(ids)
        val breedsAndCholeric = breedDao.queryBreedsAndCholeric(ids)
        val breedsAndPhlegmatic = breedDao.queryBreedsAndPhlegmatic(ids)
        val breedsAndMelancholic = breedDao.queryBreedsAndMelancholic(ids)

        return NTuple4(
            breedsAndSanguine,
            breedsAndCholeric,
            breedsAndPhlegmatic,
            breedsAndMelancholic
        )
    }
}

data class NTuple4(
    val breedsAndSanguine: List<BreedAndSanguine>,
    val breedsAndCholeric: List<BreedAndCholeric>,
    val breedsAndPhlegmatic: List<BreedAndPhlegmatic>,
    val breedsAndMelancholic: List<BreedAndMelancholic>
)