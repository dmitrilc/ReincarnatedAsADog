package com.example.reincarnatedasadog.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.reincarnatedasadog.data.repo.BreedManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "PERSONALITY_VM"

@HiltViewModel
class PersonalityViewModel @Inject constructor(
    val breedManager: BreedManager
) : ViewModel() {

    fun insert(){
        viewModelScope.launch(Dispatchers.IO) {
            breedManager.prepopulateDb()
        }
    }

}