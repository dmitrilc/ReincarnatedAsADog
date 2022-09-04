package com.example.reincarnatedasadog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.reincarnatedasadog.R
import com.example.reincarnatedasadog.databinding.FragmentPersonalityBinding
import com.example.reincarnatedasadog.ui.viewmodel.PersonalityViewModel
import dagger.hilt.android.AndroidEntryPoint

private const val TAG = "PERSONALITY_FRAG"

@AndroidEntryPoint
class PersonalityFragment : Fragment() {

    private val viewModel: PersonalityViewModel by activityViewModels()
    private var _binding: FragmentPersonalityBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPersonalityBinding.inflate(inflater)

        binding.buttonSubmit.setOnClickListener {
            val checkedIds = binding.sanguineGroup.checkedChipIds +
                    binding.cholericGroup.checkedChipIds +
                    binding.phlegmaticGroup.checkedChipIds +
                    binding.melancholicGroup.checkedChipIds

            viewModel.submit(checkedIds)
            findNavController().navigate(R.id.resultsFragment)
        }

        return binding.root
    }

}