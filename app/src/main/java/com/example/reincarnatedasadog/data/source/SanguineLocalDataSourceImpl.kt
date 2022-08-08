package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.dao.SanguineDao
import com.example.reincarnatedasadog.data.entity.Sanguine
import javax.inject.Inject

class SanguineLocalDataSourceImpl @Inject constructor(
    private val dao: SanguineDao
) : SanguineLocalDataSource {
    override fun insert(vararg sanguines: Sanguine) = dao.insert(*sanguines)
}