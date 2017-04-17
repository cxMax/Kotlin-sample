package com.cxmax.kotlin_sample.chapter2_Idioms

import android.provider.MediaStore
import java.io.File

/**
 * @describe :
 * @usage :
 *
 *
 * Created by cxmax on 2017/4/16.
 */
class Idioms {

    data class Customer(val name : String ,val email : String)

    /*
     * default values for function parameters
     */
    fun foo(a : Int = 0 , b : String = "") {}

    /*
     * filtering a list
     */
    val postives = list.fiter{ x -> x > 0}

    val postives1 = list.fiter{ it > 0}

    /*
     * String interpolation
     */
    val name = "xiaofang"
    fun printName(){
        println("Name $name")
    }

    /*
     * Instance Checks
     */
    val x = "hh"
    fun checkInstance() {
        when(x) {
            is String -> {

            }
            else -> {

            }
        }
    }

    /*
     * traversing a map/list of pairs
     */
    fun traversing() {
        for ((k,v) in map) {
            println("$k - > $v")
        }
    }

    /*
     * use range
     */
    fun range() {
        for (i in 1..100) {

        }
        for (i in 2..10) {

        }
    }

    /*
     * Read-only list
     */
    fun readList() {
        val  list = listOf("a" , "b" , "c")
    }

    /*
     * Read-only map
     */
    fun readMap() {
        val map = mapOf("a" to 1 , "b" to 2 , "c" to 3)
    }

    /*
     * accessing map
     */
    fun accessMap() {
        println(map["key"])
        map["key"] = value
    }

    /*
     * lazy property
     */
    fun lazyJob() {
        val p : String by lazy {

        }
    }

    /*
     * extension functions
     */
    fun String.spaceToCamelCase() {
        "Convert this to camelcase".spaceToCamelCase()
    }

    /*
     * creating a singleton
     */
    object Resource {
        val name = "Name"
    }

    /*
     * if not null shorthand
     */
    fun notNullCheck() {
        val files = File("Test").listFiles()
        println(files?.size)
    }

    /*
     * if not null and else shorthand
     */
    fun checkNullable() {
        val files = File("Test").listFiles()
        println(files?.size ?: "empty")
    }

    /*
     * executing a statement if null
     */
    fun executeNullable() {
        val data = ...
        val email = data["email"] ?: throw IllegalStateException("email is missing")
    }

    /*
     * executing if not null
     */
    fun executeNotNull() {
        val data = ...
        data?.let{
            ... //execute this block if not null
        }
    }

    /*
     * return on when statement
     */
    fun transform(color : String) : Int{
        return when(color) {
            "red" -> 0
            "blue" -> 1
            "yellow" -> 2
            else -> throw IllegalStateException("Invalid color param value")
        }
    }

    /*
     * try/catch expression
     */
    fun test() {
        val result = try{
            count()
        }catch (e : IllegalStateException) {
            throw IllegalStateException(e)
        }
    }

    /*
     * if expression
     */
    fun foo(param : Int) {
        val result = if (param == 1) {
            "one"
        }else if (param == 2) {
            "two"
        }else {
            "three"
        }
    }

    /*
     * builder-style usage of methods that return unit
     */
    fun arrayOfMinusOnes(size : Int) : IntArray {
        return kotlin.IntArray(size).apply { fill(-1) }
    }

    /*
     * single-expression functions
     */
    fun theAnswer() = 42

    /*
     * this is equivalen to
     */
    fun theAnswer1() : Int {
        return 42
    }

    /*
     * this is effectively combined with other idioms , leading to shorter code
     */
    fun transform(color: String): Int = when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }

    /*
     * calling multiple methods on an object instance ('with')
     */
    class Turtle {
        fun penDown(){}
        fun penUp(){}
        fun turn(degrees: Double){}
        fun forward(pixels: Double){}
    }

    fun withTurtle() {
        val myTurtle = Turtle()
        with(myTurtle) {
            penDown()
            for(i in 1..4) {
                forward(100.0)
                turn(90.0)
            }
            penUp()
        }
    }

    /*
     * Convenient form for a generic function
     */
    inline fun<reified T : Any> Gson.fromJson(json) : T = this.fromJson(json,T :: class.java)

    /*
     * consuming a nullable boolean
     */
    fun consumeNullable() {
        val b : Boolean ? = ...
        if (b == true) {

        }else {

        }
    }

}