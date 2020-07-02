package com.alvin.kotlinstudy.lesson2

/**
 * @author : Alvin
 * create at : 2020/4/16 19:41
 * description :类和对象
 * 构造函数中带有var val的都是属性 不带的只是属性
 */
open class Person constructor(var name: String, var age: Int, sex: Int) {
    var firstProperty = "Description This is the first property of Person:$name".run(::println)

    init {
        println("first init block print person name: ${this.name}")
    }

    val secondProperty = "second property print person age: ${this.age}".run(::println)

    init {
        println("second init block print person age: ${this.age}")
    }

    /**
     * 第二构造方法 必须
     */
    public constructor(name: String, age: Int, des: String) : this(name, age, -1) {

    }

    constructor(name: String, age: Int, des: String, favoriteFood: String) : this(name, age, "")

//    fun getName():String { 编译无法通过因为kotlin自带get set
//        return this.name
//    }

    fun eatLunch() {
        println(name.plus(" eat lunch"))
    }
}

class Student(var num: String) : Person("Student", 15, -1) {

}

class Mate : Person {
    constructor() : super("Mate", 120, 0)
}

class Book(var name: String = "Anonymous") {
    init {
        println("init------------- name ${this.name}")
    }

    constructor(name: String, price: Int) : this(name) {
        println("second constructor method Book' name is ".plus(this.name))
    }

    fun test() {
        val p = Person("alvin", 30, 1)
        p.name = "Yannis"
    }

    fun testNull() {
        val p: Person? = null
        p!!.eatLunch()
        val bk: Book = Book("English", 20)

    }
}