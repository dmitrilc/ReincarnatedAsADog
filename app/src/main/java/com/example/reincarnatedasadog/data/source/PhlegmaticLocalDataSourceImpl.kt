package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.dao.PhlegmaticDao
import com.example.reincarnatedasadog.data.entity.Phlegmatic
import javax.inject.Inject

class PhlegmaticLocalDataSourceImpl @Inject constructor(
    private val dao: PhlegmaticDao
) : PhlegmaticLocalDataSource {

    override fun insertAll(vararg phlegmatics: Phlegmatic) = dao.insertAll(*phlegmatics)
}