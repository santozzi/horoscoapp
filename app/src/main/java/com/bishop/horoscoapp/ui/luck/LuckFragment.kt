package com.bishop.horoscoapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bishop.horoscoapp.R
import com.bishop.horoscoapp.databinding.FragmentLuckBinding

class LuckFragment : Fragment() {

    private var _binding:FragmentLuckBinding? =null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLuckBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}