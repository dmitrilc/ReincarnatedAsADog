package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.dao.PhlegmaticDao
import com.example.reincarnatedasadog.data.entity.Phlegmatic
import javax.inject.Inject

class PhlegmaticLocalDataSourceImpl @Inject constructor(
    private val dao: PhlegmaticDao
) : PhlegmaticLocalDataSource {

    override fun insert(vararg phlegmatics: Phlegmatic) = dao.insert(*phlegmatics)
}