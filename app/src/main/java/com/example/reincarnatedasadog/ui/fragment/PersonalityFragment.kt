package com.example.reincarnatedasadog.ui.fragment

import android.content.res.Resources
import android.os.Bundle
import android.util.AttributeSet
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.updatePaddingRelative
import androidx.fragment.app.viewModels
import com.example.reincarnatedasadog.ui.viewmodel.PersonalityViewModel
import com.example.reincarnatedasadog.R
import com.example.reincarnatedasadog.databinding.FragmentPersonalityBinding
import com.google.android.material.chip.Chip

class PersonalityFragment : Fragment() {

    private val viewModel by viewModels<PersonalityViewModel>()
    private var _binding: FragmentPersonalityBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPersonalityBinding.inflate(inflater)
        return binding.root
    }

}