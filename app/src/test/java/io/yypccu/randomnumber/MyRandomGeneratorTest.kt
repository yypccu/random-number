package io.yypccu.randomnumber

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class MyRandomGeneratorTest {

    // region constants

    // end region constants

    // region helper field

    // end region helper field

    lateinit var SUT: MyRandomGenerator

    @Before
    fun setup() {
        SUT = MyRandomGenerator()

    }

    @Test
    fun getInt_until100Success_numbersAreUnderUntil() {
        var num: Int
        for (i in 1..1000000) {
            num = SUT.getInt(100)
            assertTrue("$num should under 100", num < 100)
        }
    }

    // region helper methods

    // end region helper methods

    // region helper classes

    // end region helper classed
}