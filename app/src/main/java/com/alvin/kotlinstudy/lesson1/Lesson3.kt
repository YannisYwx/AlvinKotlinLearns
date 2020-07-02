package com.alvin.kotlinstudy.lesson1

/**
 * @author : Alvin
 * create at : 2020/4/15 18:17
 * description :返回和跳转
 */
class Lesson3 {
    /**
     * kotlin中有三种类型的跳转表达式
    — return，即返回语句，默认从最近的一个方法返回，表示该方法执行结束。
    — break，跳出最近的循环体
    — continue，跳过本次执行，继续执行循环体的下一次循环
     */

    fun testReturn(i: Int?) {
        if (i == 0) {
            println(" i = 0")
            return
        }
        println("-------------i = $i")
    }

    fun testBreak() {
        println("[testBreak]")
        for (i in 1..10) {
            if (i % 2 == 0 && i > 4) {
                println(" ---- i = $i -> break")
                break
            } else {
                println("---- i = $i")
            }
        }
    }

    fun testContinue() {
        println("[testContinue]")
        for (i in 1..10) {
            if (i % 2 == 0) {
                println(" ---- i = $i -> continue")
                continue
            }
            println("---- i = $i")

        }
    }

    /**
     * 指定跳出某个循环
     */
    fun testLabelBreak() {
        myBreak@ for (i in 8..80 step 4) {
            println("----------------i = $i")
            println("myBreak loop: ".plus(i))//打印 '1'
            for (j in 1..20 step 2) {
                if (j == i + 5) break@myBreak//注意break@myfor中间不能有空格，是一个整体
                println(i.toString().plus(":").plus(j))//打印'1:1 1:2 1:3 1:4 1:5'
            }
        }
    }

    fun testLabelReturn() {
        arrayOf(1, 2, 3, 4, 5).forEach myReturn@{
            println("testLabelReturn -- it = ".plus(it.toString()))
            if (it > 3) return@myReturn
            println("testLabelReturn -- it ::::::: ".plus(it.toString()))

        }

        /**
         * 直接返回方法
         */
        arrayOf(1, 2, 3, 4, 5).forEach {
            println("testLabelReturn return method -- it = ".plus(it.toString()))
            if (it > 3) return@forEach
            println("::::::::::::$it < 3")
        }

        /**
         *  直接return掉匿名方法 作用类似continue
         */
        arrayOf(1, 2, 3, 4, 5).forEach { _ ->
            fun(i: Int) {
                println("testLabelReturn return Anonymous method -- it = ".plus(i.toString()))
                if (i > 3) return
                println("::::::::::::$i < 3")
            }
        }

        /**
         * 返回run代码块 作用类似于 break
         */
        run {
            arrayOf(1, 2, 3, 4, 5).forEach {
                println("testLabelReturn return Anonymous method -- it = ".plus(it.toString()))
                if (it > 3) return@run
                println("::::::::::::$it < 3")
            }
        }

        var tampValue: String? = null
        tampValue = kotlin.run {
            println("run in run block code...........")
            return@run "hello world"
        }
        println(tampValue.plus(" i want fuck liuyifei"))
    }

}