package com.example.mvvm.UI.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.mvvm.UI.ViewModel.FraseViewModel
import com.example.mvvm.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity()  {

    private lateinit var binding: ActivityMainBinding

     val fraseViewModel:FraseViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fraseViewModel.fraseModel.observe(this, Observer {
            binding.frase.text=it.name
        })
        fraseViewModel.onCreate()
        binding.viewContainer.setOnClickListener{
            fraseViewModel.fraseRandom()
        }



    }

}