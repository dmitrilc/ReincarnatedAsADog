package com.example.reincarnatedasadog.data.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.reincarnatedasadog.data.AppDatabase
import com.example.reincarnatedasadog.data.source.CholericLocalDataSource
import com.example.reincarnatedasadog.data.source.MelancholicLocalDataSource
import com.example.reincarnatedasadog.data.source.PhlegmaticLocalDataSource
import com.example.reincarnatedasadog.data.source.SanguineLocalDataSource
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class PrePopulateDbWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParams: WorkerParameters,
    private val db: AppDatabase,
    private val sanguineLocalDataSource: SanguineLocalDataSource,
    private val cholericLocalDataSource: CholericLocalDataSource,
    private val phlegmaticLocalDataSource: PhlegmaticLocalDataSource,
    private val melancholicLocalDataSource: MelancholicLocalDataSource
) : Worker(context, workerParams) {

    override fun doWork(): Result {
        db.runInTransaction {
            sanguineLocalDataSource.insertAll(

            )

            cholericLocalDataSource.insertAll(

            )

            phlegmaticLocalDataSource.insertAll(

            )

            melancholicLocalDataSource.insertAll(

            )
        }


        return Result.success()
    }

}