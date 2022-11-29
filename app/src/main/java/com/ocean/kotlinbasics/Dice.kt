package com.ocean.kotlinbasics

object Dice {
    fun roll(numSides : Int): Int {
        return (1..numSides).random()
    }
}