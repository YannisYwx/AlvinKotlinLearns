package com.alvin.kotlinstudy

import com.alvin.kotlinstudy.lesson1.Lesson

/**
 * @author : Alvin
 * create at : 2020/3/31 18:28
 * description :主方法
 */

class Main {
    /**
     * 伴生对象
     */
    companion object fun main(str:Array<String?>) {
        val lesson: Lesson = Lesson()
        lesson.stringTest()
    }
}