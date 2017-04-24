package com.cxmax.kotlin_sample.chapter6_returns_and_jumps

/**
 * @describe :
 * @usage :
 *
 *
 * Created by cxmax on 2017/4/20.
 */
class ReturnsAndJumps {
    // break 是跳转标签后面的表达式，continue 是跳转到循环的下一次迭代

    fun testLoop(){
        loop@ for (i in 1..100) {
            for (j in 1..100){
                if(j in 1..20){
                    break@loop
                }
            }
        }

        ints.forEach lit@ {
            if (it ==0) return@lit
            print(it)
        }
    }
}