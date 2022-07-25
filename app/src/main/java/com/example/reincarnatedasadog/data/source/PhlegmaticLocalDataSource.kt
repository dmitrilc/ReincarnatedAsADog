package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.entity.Phlegmatic

interface PhlegmaticLocalDataSource {
    fun insertAll(vararg phlegmatics: Phlegmatic)
}