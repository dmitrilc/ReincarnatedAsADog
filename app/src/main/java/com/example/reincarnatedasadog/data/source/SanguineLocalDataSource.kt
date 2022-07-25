package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.entity.Sanguine

sealed interface SanguineLocalDataSource {
    fun insertAll(vararg sanguines: Sanguine)
}