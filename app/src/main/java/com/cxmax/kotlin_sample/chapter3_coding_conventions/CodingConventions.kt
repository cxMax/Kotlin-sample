package com.cxmax.kotlin_sample.chapter3_coding_conventions

/**
 * @describe :
 * @usage :
 *
 *
 * Created by cxmax on 2017/4/16.
 */
class CodingConventions {

    /*
     * colon
     */
    interface Foo<out T : Any> : Bar{
        fun foo(a : Int): T
    }

    /*
     * lambdas
     */
    fun lambda() {
        list.fillter { it > 10}
                .map { element -> element * 2}
    }

    /*
     * class header formating
     */
    class Person(id : Int, name : String)

    class Person(
            id : Int
            name : String
            surname : String
    ) : Human(id, name),
            kotlinMake{

    }
}