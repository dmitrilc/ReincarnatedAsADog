package com.example.reincarnatedasadog.data.repo

import com.example.reincarnatedasadog.data.source.CholericLocalDataSource
import javax.inject.Inject

class CholericRepo @Inject constructor(
    val source: CholericLocalDataSource
) {
}