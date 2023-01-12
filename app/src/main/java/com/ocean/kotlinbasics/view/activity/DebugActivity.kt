package com.ocean.kotlinbasics.view.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ocean.kotlinbasics.databinding.ActivityDebugBinding

class DebugActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDebugBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDebugBinding.inflate(layoutInflater)
        setContentView(binding.root)

        logging()
    }

    companion object {
        private const val TAG = "DebugActivity"
    }
    fun logging() {
        Log.v(TAG, "Hello, world!")
    }
}