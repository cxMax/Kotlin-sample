package com.meizu.cloud.app.utils.viewdecorator

import android.util.Log.println

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-25.
 */
interface MyInterface {
    fun bar()

    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        println(prop)
    }
}