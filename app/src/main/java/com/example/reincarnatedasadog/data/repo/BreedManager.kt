package com.example.reincarnatedasadog.data.repo

import android.content.Context
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import com.example.reincarnatedasadog.data.worker.PrePopulateDbWorker
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class BreedManager @Inject constructor(
    breedRepo: BreedRepo,
    sanguineRepo: SanguineRepo,
    cholericRepo: CholericRepo,
    phlegmaticRepo: PhlegmaticRepo,
    melancholicRepo: MelancholicRepo,
    @ApplicationContext private val context: Context
) {
    /**
     * To be used for pre-populatitng the db only.
     */
    fun prepopulateDb() {
        val uploadWorkRequest: WorkRequest =
            OneTimeWorkRequestBuilder<PrePopulateDbWorker>()
                .build()

        WorkManager
            .getInstance(context)
            .enqueue(uploadWorkRequest)
    }
}