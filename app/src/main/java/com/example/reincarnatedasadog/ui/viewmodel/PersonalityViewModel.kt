package com.example.reincarnatedasadog.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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

    fun submit(checkedIds: List<Int>){
        viewModelScope.launch(Dispatchers.IO) {
            val sortedList = repo.submit(checkedIds)

            _uiState.value = sortedList.map {

                val checkedCount = checkedIds.count()

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

                val ratioFormat = NumberFormat.getPercentInstance()

                ResultUiState(
                    it.breed.name,
                    ratioFormat.format(ratio)
                )
            }.sortedBy {
                it.ratio
            }.reversed()
        }
    }

}