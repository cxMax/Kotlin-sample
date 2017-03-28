package com.cxmax.kotlin_sample.chapter1_started

import android.util.Log

/**
 * @describe :
 * @usage :
 *
 *
 * Created by cxmax on 2017/3/27.
 */
class BasicSyntax {

    /**
     * 1. define function
     */
    fun sum(a : Int , b : Int): Int{
        return a + b;
    }

    fun sum1(a : Int , b : Int) = a + b

    // unit can be omitted , println should run on kotlin 1.1.1
    fun printSum(a: Int,b: Int) : Unit {
        println("sum of $a and $b is ${a + b}")
    }

    /**
     *  2. define local variables
     */
    val a : Int = 1;
    val b = 2;
    fun test() {
        val c : Int
        c = 3;
    }


    //mutable variable
    fun test1(){
        var x = 5
        x += 1
    }

    /**
     *  3. comments
     */
    // this is an end-of-line comment

    /* this is a block comment on multiple lines */

    /**
     *  4. use String templates
     */
    var a1  = 1
    val s1 = "a1 is $a1"

    fun test3() {
        a1 = 2
        val s2 = "${s1.repalce("is" , "was")} , but now is $a1"
    }

    /**
     *  5. use conditional expressions
     */
    fun maxOf(a: Int,b: Int) : Int {
        if (a > b) {
            return a
        }
        return b
    }

    //else use if as an expression :
    fun maxOf(a: Int , b: Int) = if (a > b) a else b

    /**
     * 6. use nullable values and check for null
     */
    fun parseInt(str : String) : Int? {
        return null
    }

    /**
     *  7. use type checks and automatic casts
     */
    fun getStringLength(obj:Any) : Int? {
        if (obj is String) {
            return obj.length
        }
        return null
    }

    fun getStringLength1(obj:Any) : Int? {
        if (obj !is String) return null
        return obj.length
    }


    /**
     *  8. use a for loop
     */
    fun testLoop() {
        val items =  listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }
    }

    fun testLoop1() {
        val items = listOf("apple", "banana", "kiwi")
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }

    /**
     *  9. use a while loop
     */
    fun testWhile() {
        val items = listOf("apple", "banana", "kiwi")
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }

    /**
     *  10. use when expression
     */
    fun describe(obj: Any) : String =
            when(obj) {
                1          -> "One"
                "Hello"    -> "Greeting"
                is Long    -> "Long"
                !is String -> "Not a string"
                else       -> "Unknown"
            }

    /**
     *  11. use ranges
     */
    fun testRanges() {
        val x = 10
        val y = 9
        if (x in 1..y+1) {
            println("fits in range")
        }
    }

    //check if number is out of range :
    fun testRanges1() {
        val list = lisOf("a", "b", "c")

        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indiecs){
            println("list size is out of valid list indices range too")
        }
    }

    // Iterating  over a range :
    fun testIterator() {
        for (x in 1..5) {
            print(x)
        }
    }

    //over a progression :
    fun testProgression() {
        for (x in 1..10 step 2) {
            print(x)
        }
        for (x in 9 downTo 0 step 3) {
            print(x)
        }
    }

    /**
     *  12. use collections
     */
    fun testCollections() {
        //Iterating over a collection :
        for (item in items){
            println(item)
        }

        //check if a collection contains an object use in operator
        when {
            "abc" in items -> println("a")
            "apple" in items -> println("apple is fine too")
        }

        // use lambda expressions to fitter and map collections
        fun testLambda() {
            fruits
                    .filter { it.startsWith("a") }
                    .sortedBy { it }
                    .map { it.toUpperCase() }
                    .forEach { println(it) }
        }
    }



}