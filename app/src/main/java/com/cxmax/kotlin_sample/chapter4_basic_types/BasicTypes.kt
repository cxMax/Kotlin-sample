package com.cxmax.kotlin_sample.chapter4_basic_types

/**
 * @describe :
 * @usage :
 *
 *
 * Created by cxmax on 2017/4/16.
 */
class BasicTypes {
    /**
     * Double
     * Float
     * Long
     * Int
     * Short
     * Byte
     */
    val oneMillion = 1_000_000
    val credit_card_number = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    /*
     * Arrays
     */
    // 创建一个 Array<String>  内容为 ["0", "1", "4", "9", "16"]
    val asc = Array(5, {i -> (i * i).toString() })

    fun str() {
        for (c in String) {
            println(c)
        }
    }
}