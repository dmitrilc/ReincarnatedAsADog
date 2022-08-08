package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.dao.CholericDao
import com.example.reincarnatedasadog.data.entity.Choleric
import javax.inject.Inject

class CholericLocalDataSourceImpl @Inject constructor(
    private val dao: CholericDao
): CholericLocalDataSource {
    override fun insert(vararg cholerics: Choleric) = dao.insert(*cholerics)
}