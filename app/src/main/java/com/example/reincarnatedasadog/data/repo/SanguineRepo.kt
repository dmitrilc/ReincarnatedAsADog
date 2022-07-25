package com.example.reincarnatedasadog.data.repo

import com.example.reincarnatedasadog.data.entity.Sanguine

sealed interface SanguineRepo {
    fun insertAll(vararg sanguine: Sanguine)
}