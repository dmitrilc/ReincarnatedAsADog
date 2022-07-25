package com.example.reincarnatedasadog.data.repo

import com.example.reincarnatedasadog.data.source.BreedLocalDataSource
import javax.inject.Inject

class BreedRepo @Inject constructor(
    val source: BreedLocalDataSource
) {
}