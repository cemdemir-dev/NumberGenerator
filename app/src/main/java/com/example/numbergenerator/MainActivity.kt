package com.example.numbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.numbergenerator.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        generateNumber()
    }
    fun generateNumber(){
        binding.generateButton.setOnClickListener(){
            val myRandomInt = Random.nextInt(until = 10000)
            binding.numberText.text = "$myRandomInt"
        }
    }
}