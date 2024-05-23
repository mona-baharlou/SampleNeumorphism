package com.baharlou.sampleneumorphism

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.baharlou.sampleneumorphism.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentsOfCards()
    }

    private fun setContentsOfCards() {
        binding.climateCard.txtOne.text = "Climate"
        binding.climateCard.txtSec.text = "A/C is ON"
        binding.climateCard.imgChecking.visibility = View.INVISIBLE


        binding.tiresCard.txtOne.text = "Tires"
        binding.tiresCard.txtSec.text = "Low Pressure"

        binding.directionCard.txtOne.text = "Direction"
        binding.directionCard.txtSec.text = "Automatic Mode"
        binding.directionCard.imgChecking.visibility = View.INVISIBLE



    }
}