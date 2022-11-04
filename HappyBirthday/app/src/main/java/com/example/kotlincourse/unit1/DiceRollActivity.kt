package com.example.kotlincourse

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DiceRollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView2)
        val drawableResource=   when (diceRoll){
             1->R.drawable.dice_1
             2->R.drawable.dice_2
             3->R.drawable.dice_3
             4->R.drawable.dice_4
             5->R.drawable.dice_5
             else->R.drawable.dice_6

        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()

    }
}
/*
fun main() {
    val myFirstDice = Dice(8)
    val rollResult = myFirstDice.roll()
    val luckyNumber=4

    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
        else-> println("You rolled a 7 or 8.")
    }
}
*/



class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}