package com.alvin.kotlinstudy.lesson1

/**
 * @author : Alvin
 * create at : 2020/3/27 18:11
 * description :基本语法与数据
 */
class Lesson {

    //变量
    var intNum = 1_00
    var longNum = 123_456_789
    var hexBytes = 0xFE_DC_BA_98
    var strings = "hello world"
    var bytes = 0b10101010_11110000

    /**
     * ==  === equals
     * == 相当于 java中的 equals 比较内容
     * === 相当于 java中的 == 比较地址
     */
    fun test1() {
        val a: Int? = 10
        println("a == a => " + (a == a))
        val a1: Int? = a
        val a2: Int? = a
        println("a1 == a2 =>" + (a1 == a2))
        println("a1 === a2 =>" + (a1 === a2))
        println("a1.equals(a2) =>" + (a1?.equals(a2)))
    }

    /**
     * 测试类型转换
     * kotlin不在像java那样可以进行隐式转换（是指原生数据类型，如int可以隐式赋值为long），在kotlin中必须要进行显示转换：
     * kotlin中，每一个数字类型都对应有这样一个方法，如下所示：
    — toByte(): Byte
    — toShort(): Short
    — toInt(): Int
    — toLong(): Long
    — toFloat(): Float
    — toDouble(): Double
    — toChar(): Char
     */
    fun test2() {
        val a: Int? = 1
        val b: Long? = a?.toLong();
        val c = 1L + 1 //自动判断常量c类型为Long
        //val c = a?.plus(b!!)
    }

    /**
     * 位操作 以及范围操作符
     * kotlin提供了以下位操作相关方法，但支持Int和Long类型。如下所示：
    — shl(bits) – 有符号左移
    — shr(bits) – 有符号右移
    — ushr(bits) – 无符号右移
    — and(bits) – 与操作
    — or(bits) – 或操作
    — xor(bits) – 异或操作
    — inv() – 倒置操作
     *
     * 范围操作符: a..b, x in a..b, x !in a..b
     */
    fun test3() {
        val x: Int = 1
        val a: Int = 0
        val b: Int = 100
        if (x in a..b) {
            println("x in a..b")
            println(x.toString().plus("0..100"))
        }
    }

    /**
     * kotlin中的字符类型是Char，与java中区别就是kotlin中的字符无法直接作为数字来表示
     */
    fun testCharAndBoolean(): Boolean {
        val c: Char? = 'a'
        //val i: Int? = c? //错误
        val i: Int? = c?.toInt() //需要转换
        println(c?.toInt()) //97
        val isOk: Boolean = false
        val isFalse: Boolean = true
        return isOk || isFalse

    }

    /**
     * kotlin以Array为关键字来表示数组，提供诸如get、set等方法以及size属性等等，同时也支持操作符[]
     */
    fun arrayTest() {
        val ay1: Array<Int> = arrayOf(0, 1, 2, 3)
        println(ay1[1]) //打印 1
        ay1.forEach {
            println(it)
        }// 0 1 2 3
        val ay2: Array<Int?> = arrayOfNulls(3)
        ay2.forEach { println(it) } //打印 null null null
        //数组的唯一构造函数
        val ay3: Array<Int?> = Array(5) { i ->
            i + i
        }
        ay3.forEach { println(it) } // 0 2 4 6 8

        val ary: Array<Int> = arrayOf(1, 2, 3)
        //val obj: Array<Any> = ary compile error
        val obj: Array<out Any> = ary //compile success. The keyword of out mean that:
    }

    fun stringTest(){
        val s = "hello word"
        println("$s.length is ${s.length}")
        val sPlus = s.plus(" alvin")
        println(sPlus)
    }
}