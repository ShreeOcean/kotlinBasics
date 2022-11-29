package com.ocean.kotlinbasics.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ocean.kotlinbasics.ConstantNames
import com.ocean.kotlinbasics.Dice
import com.ocean.kotlinbasics.R

class DiceRollViewModel : ViewModel() {

    var diceText : MutableLiveData<String> = MutableLiveData()
    var diceImage : MutableLiveData<Int> = MutableLiveData()

    fun rollDice() {
        val dice = Dice.roll(6)
        val luckyNumber = (1..6).random()

        when (dice) {
            luckyNumber -> {
                "${ConstantNames.WON}$luckyNumber".also { diceText.value = it}
                val drawableResource = when (luckyNumber){
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
                diceImage.value = drawableResource
//                binding.imageViewDice.setImageResource(drawableResource)
            }
            1 -> {
                " ${ConstantNames.DICE1}$luckyNumber".also { diceText.value = it }
                diceImage.value = R.drawable.dice_1

            }
            2 -> {
                " ${ConstantNames.DICE2}$luckyNumber !".also { diceText.value = it }
                diceImage.value = R.drawable.dice_2
            }
            3 -> {
                "${ConstantNames.DICE3}$luckyNumber !".also { diceText.value = it }
                diceImage.value = R.drawable.dice_3
            }
            4 -> {
                "${ConstantNames.DICE4}$luckyNumber !".also { diceText.value = it }
                diceImage.value = R.drawable.dice_4
            }
            5 -> {
                " ${ConstantNames.DICE5}$luckyNumber !".also { diceText.value = it }
                diceImage.value = R.drawable.dice_5
            }
            6 -> {
                " ${ConstantNames.DICE6}$luckyNumber !".also { diceText.value = it }
                diceImage.value = R.drawable.dice_6
            }
        }
    }
}