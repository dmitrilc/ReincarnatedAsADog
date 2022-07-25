package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.dao.CholericDao
import com.example.reincarnatedasadog.data.entity.Choleric
import javax.inject.Inject

class CholericLocalDataSourceImpl @Inject constructor(
    private val dao: CholericDao
): CholericLocalDataSource {
    override fun insertAll(vararg cholerics: Choleric) = dao.insertAll(*cholerics)
}