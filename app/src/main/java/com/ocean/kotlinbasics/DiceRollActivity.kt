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
        rollDice()
    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val luckyNumber = (1..6).random()

        val drawableResource = when (dice.roll()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.imageViewDice.setImageResource(drawableResource)
        binding.imageViewDice.contentDescription = dice.roll().toString()

//        when (dice.roll()) {
////            luckyNumber -> binding.tvDiceRoll.text = " You won! your lucky roll is $luckyNumber"
////            luckyNumber -> binding.imageViewDice.setImageDrawable()
//            1 -> {
////                binding.tvDiceRoll.text = " So sorry! You rolled a 1. Try again for $luckyNumber !"
//                binding.imageViewDice.setImageResource(R.drawable.dice_1)
//            }
//            2 -> {
////                binding.tvDiceRoll.text = " Sadly, you rolled a 2. Try again for $luckyNumber !"
//                binding.imageViewDice.setImageResource(R.drawable.dice_2)
//            }
//            3 -> {
////                binding.tvDiceRoll.text = " Unfortunately, you rolled a 3. Try again for $luckyNumber !"
//                binding.imageViewDice.setImageResource(R.drawable.dice_3)
//            }
//            4 -> {
////                binding.tvDiceRoll.text = " Unfortunately, you rolled a 4. Try again for $luckyNumber !"
//                binding.imageViewDice.setImageResource(R.drawable.dice_4)
//            }
//            5 -> {
////                binding.tvDiceRoll.text = " Don't cry! You rolled a 5. Try again for $luckyNumber !"
//                binding.imageViewDice.setImageResource(R.drawable.dice_5)
//            }
//            6 -> {
////                binding.tvDiceRoll.text = " Apologies! You rolled a 6. Try again for $luckyNumber !"
//                binding.imageViewDice.setImageResource(R.drawable.dice_6)
//            }
//        }

    }
}