package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.entity.Melancholic

interface MelancholicLocalDataSource {
    fun insert(vararg melancholics: Melancholic)
}