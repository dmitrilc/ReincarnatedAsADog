package com.example.reincarnatedasadog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.reincarnatedasadog.databinding.FragmentPersonalityBinding
import com.example.reincarnatedasadog.ui.viewmodel.PersonalityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PersonalityFragment : Fragment() {

    private val viewModel: PersonalityViewModel by viewModels()
    private var _binding: FragmentPersonalityBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPersonalityBinding.inflate(inflater)

        viewModel.insert()

        return binding.root
    }

}