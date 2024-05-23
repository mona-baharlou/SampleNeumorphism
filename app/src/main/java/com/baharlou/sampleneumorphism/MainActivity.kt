package com.baharlou.sampleneumorphism

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.baharlou.sampleneumorphism.databinding.ActivityMainBinding
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonClick()


    }

    @SuppressLint("RestrictedApi")
    private fun buttonClick() {
        binding.btnGo.setOnClickListener {
            goToSecondActivity()
        }

        binding.neumorphImageView7.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.neumorphImageView8.setShapeType(ShapeType.FLAT)

                binding.neumorphImageView8.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )


            }

        }

        binding.neumorphImageView8.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.neumorphImageView7.setShapeType(ShapeType.FLAT)

                binding.neumorphImageView7.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )


            }

        }
    }

    private fun goToSecondActivity() {
        val intent = Intent(this , SecondActivity::class.java)
        startActivity(intent)
    }
}