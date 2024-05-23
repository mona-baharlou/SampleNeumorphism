package com.baharlou.sampleneumorphism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.baharlou.sampleneumorphism.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonClick()


    }

    private fun buttonClick() {
        binding.btnGo.setOnClickListener {
            goToSecondActivity()
        }
    }

    private fun goToSecondActivity() {
        val intent = Intent(this , SecondActivity::class.java)
        startActivity(intent)
    }
}