package io.yypccu.randomnumber

import kotlin.random.Random

class MyRandomGenerator {

    fun getInt(): Int {
        return Random.nextInt()
    }

    fun getInt(until: Int): Int {
        return Random.nextInt(until)
    }

    fun getInt(from: Int, until: Int): Int {
        return Random.nextInt(from, until)
    }

}