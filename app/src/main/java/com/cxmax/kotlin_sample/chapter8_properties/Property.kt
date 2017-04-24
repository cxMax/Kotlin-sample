package com.cxmax.kotlin_sample.chapter8_properties

/**
 * @describe :
 * @usage :
 *
 *
 * Created by cxmax on 2017/4/24.
 */
class Property {
    public var name: String = "!"
    public var street: String ="!"
    public var city: String = "!"
    public var state: String? = "!"
    public var zip: String = "!"

    var initialized = 1 // 类型为 Int, 默认实现了 getter 和 setter

    val inferredType = 1 // 类型为 Int 类型,默认实现 getter

    val isEmpty: Boolean
        get() = !this.isEmpty

    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value) // parses the string and assigns values to other properties
        }

    const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

}