package com.example.reincarnatedasadog.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.reincarnatedasadog.databinding.ResultViewholderBinding
import com.example.reincarnatedasadog.ui.state.ResultUiState

private const val TAG = "RESULTS_ADAPTER"

class ResultsAdapter() : ListAdapter<ResultUiState, ResultsAdapter.ResultViewHolder>(DiffCallback) {
    class ResultViewHolder(val binding: ResultViewholderBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val binding = ResultViewholderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ResultViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        currentList[position].let { state ->
            //Sets Breed display name
            holder.binding.textViewResultViewHolder.text = state.displayName

            //Sets breed percentage
            holder.binding.textViewPercentage.text = "Chance: ${currentList[position].ratio}"

            //invoke callback to load new image uri and image
            if (state.imageUri.isNullOrEmpty()){
                state.imageUriCallback(state.breed)
            } else {
                holder.binding.imageViewDogImage.load(state.imageUri)
            }
        }
    }

    override fun getItemCount() = this.currentList.size

    companion object DiffCallback : DiffUtil.ItemCallback<ResultUiState>() {
        override fun areItemsTheSame(oldItem: ResultUiState, newItem: ResultUiState): Boolean {
            return oldItem.breed.id == newItem.breed.id
        }

        override fun areContentsTheSame(oldItem: ResultUiState, newItem: ResultUiState): Boolean {
            return oldItem == newItem
        }
    }
}