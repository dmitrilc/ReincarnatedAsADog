package com.example.reincarnatedasadog.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reincarnatedasadog.databinding.ResultViewholderBinding
import com.example.reincarnatedasadog.ui.state.ResultUiState

private const val TAG = "RESULTS_ADAPTER"

class ResultsAdapter(private val state: List<ResultUiState>) : RecyclerView.Adapter<ResultsAdapter.ResultViewHolder>() {
    class ResultViewHolder(val binding: ResultViewholderBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val binding = ResultViewholderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ResultViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        state[position].let {
            holder.binding.textViewResultViewHolder.text = it.breedName
            holder.binding.textViewPercentage.text = "Chance: ${state[position].ratio}"
        }
    }

    override fun getItemCount() = state.count()
}
