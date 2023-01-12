package com.ocean.kotlinbasics.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ocean.kotlinbasics.R
import com.ocean.kotlinbasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCoroutine.setOnClickListener(this)
        binding.btnDice.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_coroutine ->{
                // do some work here
            }
            R.id.btn_dice ->{
                startActivity(Intent(this@MainActivity, DiceRollActivity::class.java))
            }
            R.id.btn_scrollable_list -> {
                startActivity(Intent(this@MainActivity, ScrollableListActivity::class.java))
            }
        }
    }
}


