package com.example.reincarnatedasadog.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.reincarnatedasadog.ui.viewmodel.PersonalityViewModel
import com.example.reincarnatedasadog.R

class PersonalityFragment : Fragment() {

    private lateinit var viewModel: PersonalityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_personality, container, false)
    }

}