package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.AppDatabase
import javax.inject.Inject

class BreedLocalDataSource @Inject constructor(
    val db: AppDatabase
) {
}