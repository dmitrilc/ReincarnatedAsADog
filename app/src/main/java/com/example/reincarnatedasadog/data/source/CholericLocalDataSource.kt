package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.entity.Choleric

interface CholericLocalDataSource {
    fun insert(vararg cholerics: Choleric)
}