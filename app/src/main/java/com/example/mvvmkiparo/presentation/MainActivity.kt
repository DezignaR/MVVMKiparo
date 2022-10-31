package com.example.mvvmkiparo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mvvmkiparo.R
import com.example.mvvmkiparo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("AAA", "Activity created")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)


//        supportFragmentManager.beginTransaction()
//            .add(R.id.container, MainFragment())
//            .setReorderingAllowed(true)
//            .addToBackStack("Main")
//            .commit()

    }
}