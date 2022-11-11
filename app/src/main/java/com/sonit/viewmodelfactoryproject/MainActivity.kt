package com.sonit.viewmodelfactoryproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.sonit.viewmodelfactoryproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel
    lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(2)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)

      binding.preSetValue.text = viewModel.getMultiplier().toString()
        binding.apply {
            sumButton.setOnClickListener {
                if (inputField.text?.length != 0) {
                    viewModel.makeNumber_Even(inputField.text.toString().toInt())
                    resultValue.text = viewModel.getEvenNumber().toString()
                }
            }

        }
    }
}