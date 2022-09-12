package com.example.reincarnatedasadog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.example.reincarnatedasadog.databinding.FragmentResultsBinding
import com.example.reincarnatedasadog.ui.viewmodel.PersonalityViewModel
import kotlinx.coroutines.launch

private const val TAG = "RESULTS_FRAGMENT"

class ResultsFragment : Fragment() {
    private val viewModel: PersonalityViewModel by activityViewModels()
    private var _binding: FragmentResultsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResultsBinding.inflate(inflater)

        binding.recyclerResults.adapter = ResultsAdapter()

        lifecycleScope.launch {
            viewModel.uiState.collect { uiState ->
                (binding.recyclerResults.adapter as ResultsAdapter)
                    .submitList(uiState)
            }
        }

        return binding.root
    }

}