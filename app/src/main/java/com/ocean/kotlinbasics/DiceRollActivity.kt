package com.ocean.kotlinbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ocean.kotlinbasics.databinding.ActivityDiceRollBinding

class DiceRollActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDiceRollBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDiceRollBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDiceRoll.setOnClickListener { rollDice() }
    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val num = 6
        val luckyNumber = (1..num).random()

        when (dice.roll()) {
            luckyNumber -> binding.tvDiceRoll.text = dice.roll().toString() + (" You won! your lucky roll is $luckyNumber" )
            1 -> binding.tvDiceRoll.text = dice.roll().toString() + (" So sorry! You rolled a 1. Try again for $luckyNumber !")
            2 -> binding.tvDiceRoll.text = dice.roll().toString() + (" Sadly, you rolled a 2. Try again for $luckyNumber !")
            3 -> binding.tvDiceRoll.text = dice.roll().toString() + (" Unfortunately, you rolled a 3. Try again for $luckyNumber !")
            5 -> binding.tvDiceRoll.text = dice.roll().toString() + (" Don't cry! You rolled a 5. Try again for $luckyNumber !")
            6 -> binding.tvDiceRoll.text = dice.roll().toString() + (" Apologies! You rolled a 6. Try again for $luckyNumber !")
        }

    }
}