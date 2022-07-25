package com.example.reincarnatedasadog.data.repo

import com.example.reincarnatedasadog.data.entity.Sanguine
import com.example.reincarnatedasadog.data.source.SanguineLocalDataSource
import javax.inject.Inject

class SanguineRepoImpl @Inject constructor(
    val source: SanguineLocalDataSource
) : SanguineRepo {
    override fun insertAll(vararg sanguine: Sanguine) = source.insertAll(*sanguine)
}