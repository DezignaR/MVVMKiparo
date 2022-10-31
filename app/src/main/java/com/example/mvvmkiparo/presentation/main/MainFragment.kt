package com.example.mvvmkiparo.presentation.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.mvvmkiparo.R
import com.example.mvvmkiparo.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {


    companion object {

        fun newInstance() = MainFragment()

    }

    lateinit var binding: FragmentMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        mainViewModel
        binding.buttonPush.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_mainFragment_to_generalFragment)
        }
    }

}
