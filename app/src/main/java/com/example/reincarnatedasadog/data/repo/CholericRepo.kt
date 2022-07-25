package com.example.reincarnatedasadog.data.repo

import com.example.reincarnatedasadog.data.source.CholericLocalDataSourceImpl
import javax.inject.Inject

class CholericRepo @Inject constructor(
    val source: CholericLocalDataSourceImpl
) {
}