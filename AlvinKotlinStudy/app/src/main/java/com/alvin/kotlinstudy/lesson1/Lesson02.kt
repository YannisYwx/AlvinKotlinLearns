package com.alvin.kotlinstudy.lesson1

/**
 * @author : Alvin
 * create at : 2020/3/31 18:23
 * description :包 packages 控制表达式
 */
import com.alvin.kotlinstudy.lesson1.Lesson as LESSON

class Lesson02 {

    fun testNULL() {
        var lesson3: Lesson3? = null
//        lesson3!!.testReturn(3) // kotlin Null pointer error
        lesson3?.testReturn(1)
        println("-------next step: initialization Lesson3")
        lesson3 = Lesson3()
        lesson3.testReturn(1)
    }

    fun testPackage() {
        val lsn: LESSON = LESSON()
        lsn.test1()
        var temp:String? = null
        println(temp)
    }

    /**
     * 在kotlin中 if 可以作为 块  并且这个块的最后一个值可以作为返回值
     */
    fun testIf() {
        val a = 1
        val b = 2
        var min: Int?
        var max: Int?
        min = if (a > b) b else a
        max = if (a < b) b else a
        println("max is ".plus(max).plus(" min is ").plus(min))
    }

    /**
     * kotlin中 when代替java的switch, else 必须存在
     */
    fun testWhen() {
        var a: Int? = 1
        var isIn = when (a) {
            1 ->
                println("find value 1")
            2 ->
                println("find value 2")
            3 ->
                println("find value 3")
            else -> {
                println("No value match")
            }
        }
        println(isIn)

        when (a) {
            is Int -> println("a is Type of INT")
            1, 2, 3 -> println("a in 1..3")
            4 -> println("value is 4")
            in 5..10 -> println("a in 5..10")
            is Int -> println("a is Type of INT")
            else -> println("No value match。")
        }
    }

    fun judgmentType(obj: Any): () -> Unit = {
        when (obj) {
            is Int -> println("obj 是 Int 类型")
            is Float -> println("obj 是 Float 类型")
            is String -> println("obj 是 String 类型")
            is Char -> println("obj 是 Char 类型")
            is Long -> println("obj 是 Long 类型")
            else -> println("obj 是 其他类型")
        }
    }

    fun testFor() {
        val ary: Array<Int> = arrayOf(1, 2, 3)
        for(i in ary) {
            println(i)
        }
        //指定递减步长
        for(i in 100 downTo  0 step 2) {
            println(i)
        }
        for(id in ary.indices) println("ary[$id] is " + ary[id])
        for((index, value) in ary.withIndex()) println("The element at $index is $value")
    }

}