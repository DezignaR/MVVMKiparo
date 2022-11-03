package com.example.mvvmkiparo.presentation.second


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.mvvmkiparo.R
import com.example.mvvmkiparo.databinding.FragmentSecondBinding
import com.google.android.material.navigation.NavigationBarView

class SecondFragment : Fragment() {

    companion object {
        fun newInstance() = SecondFragment()
    }

    private val secondViewModel: SecondViewModel by viewModels()
    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        secondViewModel
        binding.button2.setOnClickListener { view ->
            if (binding.checkBoxSecond.isChecked)
                view.findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
            else
                view.findNavController().navigate(R.id.action_secondFragment_to_generalFragment)
        }

        binding.topAppBar.setNavigationOnClickListener {
            if (binding.navigationRail.isVisible) {
                binding.navigationRail.isVisible = false
                binding.topAppBar.setNavigationIcon(R.drawable.ic_down_circle)
            } else {
                binding.navigationRail.isVisible = true
                binding.topAppBar.setNavigationIcon(R.drawable.ic_left)
            }
        }

        binding.navigationRail.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.stopwatch -> {
                    // binding.topAppBar.isVisible = true
                    binding.navigationRail.isVisible = false
                    true
                }
                else -> false
            }
        }
    }
}


