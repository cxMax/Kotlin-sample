package com.cxmax.kotlin_sample.chapter5_control_flow

/**
 * @describe :
 * @usage :
 *
 *
 * Created by cxmax on 2017/4/20.
 */
class ControlFlow {

    fun testIf() {
        var max = a
        if (a < b) {
            max = b
        }

        var max1 : Int
        if (a > b)
            max1 = a
        else
            max1 = b

        val max2 = if (a > b) a else b

        val max3 = if (a > b) {
            a
        } else {
            b
        }
    }

    fun testWhen() {
        when(x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> {
                print("x is neither 1 nor 2")
            }
        }

        when(x) {
            0,1 -> print("x == 0 or x == 1")
            else -> print("otherwise")
        }

        when (x) {
            in 1..10 -> print("x is in the range")
            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }

        val hasPrefix = when(x) {
            is String -> x.startsWith("prefix")
            else -> false
        }

        when {
            x.isOdd() -> print("x is odd")
            x.isEven() -> print("x is even")
            else -> print("x is funny")
        }
    }

    fun testFor() {
        for (item in collection) {
            print(item)
        }

        for (item : Int in ints) {

        }

        for (i in array.indices) {
            print(array[i])
        }
    }

    fun testWhile() {
        while(x > 0) {
            x--
        }

        do {
            val y = retrieveData()
        } while (y != null)
    }

}