package com.ocean.kotlinbasics.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ocean.kotlinbasics.R
import com.ocean.kotlinbasics.databinding.ActivityDiceRollBinding
import com.ocean.kotlinbasics.viewModel.DiceRollViewModel

class DiceRollActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDiceRollBinding
    private lateinit var viewModel: DiceRollViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dice_roll)
        viewModel = ViewModelProvider(this)[DiceRollViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner =this
        viewModel.rollDice()

        viewModel.diceImage.observe(this){
            binding.imageViewDice.setImageResource(it)
        }
    }
}

