package com.cxmax.kotlin_sample.chapter7_class

/**
 * @describe :
 * @usage :
 *
 *
 * Created by cxmax on 2017/4/24.
 */
sealed class SealedPerson {

    class Const(val number: Double) : SealedPerson()
}