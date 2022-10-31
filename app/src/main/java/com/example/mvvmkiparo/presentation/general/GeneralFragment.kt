package com.example.mvvmkiparo.presentation.general

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.mvvmkiparo.R
import com.example.mvvmkiparo.databinding.FragmentGeneralBinding


class GeneralFragment : Fragment() {


    companion object {
        fun newInstance() = GeneralFragment()
    }

    private lateinit var binding: FragmentGeneralBinding
    private val generalViewModel: GeneralViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentGeneralBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        generalViewModel.resultLive.observe(viewLifecycleOwner) { text ->
            binding.button.text = text

        }
        binding.switchGeneralNext.setOnClickListener {
            generalViewModel.setNext()
            binding.switchGeneralBack.isChecked = false
            binding.switchGeneralNext.isChecked = true
        }
        binding.switchGeneralBack.setOnClickListener {
            generalViewModel.setBack()
            binding.switchGeneralBack.isChecked = true
            binding.switchGeneralNext.isChecked = false
        }

        binding.button.setOnClickListener { view ->
            if (binding.switchGeneralNext.isChecked)
                view.findNavController().navigate(R.id.action_generalFragment_to_secondFragment)
            else if (binding.switchGeneralBack.isChecked)
                view.findNavController().navigate(R.id.action_generalFragment_to_mainFragment)
        }
    }
}