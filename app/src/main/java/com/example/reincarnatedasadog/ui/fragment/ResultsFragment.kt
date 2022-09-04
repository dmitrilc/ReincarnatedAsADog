package com.example.reincarnatedasadog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
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
    ): View? {
        _binding = FragmentResultsBinding.inflate(inflater)

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { uiState ->
                    if (uiState.isNotEmpty()){
                        binding.recyclerResults.adapter = ResultsAdapter(uiState)
                    }
                }
            }
        }

        return binding.root
    }

}