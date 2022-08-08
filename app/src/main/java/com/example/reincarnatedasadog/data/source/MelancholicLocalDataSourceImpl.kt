package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.dao.MelancholicDao
import com.example.reincarnatedasadog.data.entity.Melancholic
import javax.inject.Inject

class MelancholicLocalDataSourceImpl @Inject constructor(
    private val dao: MelancholicDao
) : MelancholicLocalDataSource {

    override fun insert(vararg melancholics: Melancholic) = dao.insert(*melancholics)
}