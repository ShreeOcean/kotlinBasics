package com.ocean.kotlinbasics.objects

object Dice {
    fun roll(numSides : Int): Int {
        return (1..numSides).random()
    }
}