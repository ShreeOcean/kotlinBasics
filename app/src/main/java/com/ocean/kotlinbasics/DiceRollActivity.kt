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
        val diceRoll = dice.roll()
        binding.tvDiceRoll.text = diceRoll.toString()
    }
}