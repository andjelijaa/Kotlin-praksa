package com.example.happybirthday

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Lemonade : AppCompatActivity() {

    private val LEMONADE_STATE = "LEMONADE_STATE"
    private val LEMON_SIZE = "LEMON_SIZE"
    private val SQUEEZE_COUNT = "SQUEEZE_COUNT"
    private val SELECT = "select"
    private val SQUEEZE = "squeeze"
    private val DRINK = "drink"
    private val RESTART = "restart"
    private var squeezeCount = -1
    private var lemonadeState = "select"
    private var lemonSize = -1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lemonade_main)
        val textButtton: TextView = findViewById(R.id.textView3)
        val lemonImage: ImageView = findViewById(R.id.imageLemon)
        setViewElements()
        lemonImage.setOnClickListener {
            val textView = LemonTree(3).pick()

            clickLemonImage(textView)
            clickText(textView)
        }

    }

    private fun setViewElements() {
        val textAction: TextView = findViewById(R.id.textView3)

    }

    private fun clickText(number: Int) {
        val textAction: TextView = findViewById(R.id.textView3)
        val textAction1 = when (number) {
            1 -> "Click to select a lemon!"
            2 -> "Click to juice the lemon!"
            3 -> "Click to drink your lemon!"
            else -> "Click to start again!"

        }
        textAction.setText(textAction1)
    }

    private fun clickLemonImage(number: Int) {
        val lemonImage: ImageView = findViewById(R.id.imageLemon)
        val drawableResource = when (number) {
            1 -> R.drawable.image1
            2 -> R.drawable.image2
            3 -> R.drawable.image3
            else -> R.drawable.image4

        }
        lemonImage.setImageResource(drawableResource)
        lemonImage.contentDescription = setViewElements().toString()


    }
}

var number:Int=0
class LemonTree(var num: Int) {

    fun pick(): Int {
        if(number in (0..num)){
            number++
            return number
        }
           else{
               number=0
           return number
        }
        }
}