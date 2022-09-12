package com.example.reincarnatedasadog.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.reincarnatedasadog.data.entity.*
import com.example.reincarnatedasadog.data.entity.relationship.BreedAndCholeric
import com.example.reincarnatedasadog.data.entity.relationship.BreedAndMelancholic
import com.example.reincarnatedasadog.data.entity.relationship.BreedAndPhlegmatic
import com.example.reincarnatedasadog.data.entity.relationship.BreedAndSanguine

@Dao
interface BreedDao {
    @Insert
    fun insert(vararg breed: Breed)

    @Transaction
    @Query(
        """SELECT breed.id FROM breed
            LEFT JOIN sanguine ON sanguine.id = breed.id
            LEFT JOIN choleric ON choleric.id = breed.id
            LEFT JOIN phlegmatic ON phlegmatic.id = breed.id
            LEFT JOIN melancholic ON melancholic.id = breed.id
                WHERE is_carefree = :isCarefree
                OR is_leader = :isLeader
                OR is_easygoing = :isEasygoing
                OR is_lively = :isLively
                OR is_outgoing = :isOutgoing
                OR is_responsive = :isResponsive
                OR is_sociable = :isSociable
                OR is_talkative = :isTalkative
                OR is_active = :isActive
                OR is_aggressive = :isAggressive
                OR is_changeable = :isChangeable
                OR is_excitable = :isExcitable
                OR is_impulsive = :isImpulsive
                OR is_optimistic = :isOptimistic
                OR is_restless = :isRestless
                OR is_touchy = :isTouchy
                OR is_calm = :isCalm
                OR is_careful = :isCareful
                OR is_controlled = :isControlled
                OR is_even_tempered = :isEvenTempered
                OR is_passive = :isPassive
                OR is_peaceful = :isPeaceful
                OR is_reliable = :isReliable
                OR is_thoughtful = :isThoughtful
                OR is_anxious = :isAnxious
                OR is_moody = :isMoody
                OR is_pessimistic = :isPessimistic
                OR is_quiet = :isQuiet
                OR is_reserved = :isReserved
                OR is_rigid = :isRigid
                OR is_sober = :isSober
                OR is_unsociable = :isUnsociable
    """)
    fun getIds(
        isCarefree: Boolean,
        isLeader: Boolean,
        isEasygoing: Boolean,
        isLively: Boolean,
        isOutgoing: Boolean,
        isResponsive: Boolean,
        isSociable: Boolean,
        isTalkative: Boolean,
        isActive: Boolean,
        isAggressive: Boolean,
        isChangeable: Boolean,
        isExcitable: Boolean,
        isImpulsive: Boolean,
        isOptimistic: Boolean,
        isRestless: Boolean,
        isTouchy: Boolean,
        isCalm: Boolean,
        isCareful: Boolean,
        isControlled: Boolean,
        isEvenTempered: Boolean,
        isPassive: Boolean,
        isPeaceful: Boolean,
        isReliable: Boolean,
        isThoughtful: Boolean,
        isAnxious: Boolean,
        isMoody: Boolean,
        isPessimistic: Boolean,
        isQuiet: Boolean,
        isReserved: Boolean,
        isRigid: Boolean,
        isSober: Boolean,
        isUnsociable: Boolean
    ): List<Int>

    @Transaction
    @Query(
        """SELECT * FROM sanguine
            LEFT JOIN breed ON sanguine.id = breed.id
                WHERE sanguine.id IN (:ids)
    """
    )
    fun queryBreedsAndSanguine(ids: List<Int>): List<BreedAndSanguine>

    @Transaction
    @Query(
        """SELECT * FROM choleric
            LEFT JOIN breed ON choleric.id = breed.id
                WHERE choleric.id IN (:ids)
    """)
    fun queryBreedsAndCholeric(ids: List<Int>): List<BreedAndCholeric>

    @Transaction
    @Query(
        """SELECT * FROM phlegmatic
            LEFT JOIN breed ON phlegmatic.id = breed.id
                WHERE phlegmatic.id IN (:ids)
    """)
    fun queryBreedsAndPhlegmatic(ids: List<Int>): List<BreedAndPhlegmatic>

    @Transaction
    @Query(
        """SELECT * FROM melancholic
            LEFT JOIN breed ON melancholic.id = breed.id
                WHERE melancholic.id IN (:ids)
    """)
    fun queryBreedsAndMelancholic(ids: List<Int>): List<BreedAndMelancholic>
}