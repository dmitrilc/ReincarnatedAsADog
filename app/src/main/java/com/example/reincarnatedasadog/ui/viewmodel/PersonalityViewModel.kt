package com.example.reincarnatedasadog.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.reincarnatedasadog.data.entity.Breed
import com.example.reincarnatedasadog.data.repo.BreedRepo
import com.example.reincarnatedasadog.ui.state.ResultUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.text.NumberFormat
import javax.inject.Inject
import kotlin.random.Random

private const val TAG = "PERSONALITY_VM"

@HiltViewModel
class PersonalityViewModel @Inject constructor(
    private val repo: BreedRepo
) : ViewModel() {
    private val _uiState = MutableStateFlow(emptyList<ResultUiState>())
    val uiState: StateFlow<List<ResultUiState>> = _uiState

    private val imageUriCallback: (Breed)->Unit = {
        updateImageUri(it)
    }

    private fun updateImageUri(breed: Breed) {
        viewModelScope.launch(Dispatchers.IO){
            repo.getImageUri(breed)?.let { uri ->
                _uiState.value = _uiState.value.map {
                    if (it.breed.id == breed.id){
                        it.copy(imageUri = uri)
                    } else {
                        it
                    }
                }
            }
        }
    }

    fun submit(checkedIds: List<Int>){
        viewModelScope.launch(Dispatchers.IO) {
            val sortedList = repo.submit(checkedIds)
            val ratioFormat = NumberFormat.getPercentInstance()
            val checkedCount = checkedIds.count()

            _uiState.value = sortedList.map {
                val diff = if (checkedCount >= it.totalTruthCount){
                    checkedCount - it.totalTruthCount
                } else {
                    it.totalTruthCount - checkedCount
                }

                val ratio = if (checkedIds.count() == it.totalTruthCount){
                    .9F - Random.nextDouble(0.05, 0.15)
                } else {
                    (0.9F - Random.nextDouble(0.05, 0.15)) / diff
                }

                val displayName = if (it.breed.sub.isNullOrEmpty()){
                    it.breed.parent.titleCase()
                } else {
                    "${it.breed.parent.titleCase()} ${it.breed.sub.titleCase()}"
                }

                ResultUiState(
                    breed = it.breed,
                    displayName = displayName,
                    ratio = ratioFormat.format(ratio),
                    imageUriCallback = imageUriCallback
                )
            }.sortedBy {
                it.ratio
            }.reversed()
        }
    }

    //Use for generating schema only
    fun getAllBreeds(){
        viewModelScope.launch(Dispatchers.IO) {
            //repo.prepopulateBreedsTable()
        }
    }

}

fun String.titleCase() = this.replaceFirst(this[0], this[0].titlecaseChar())