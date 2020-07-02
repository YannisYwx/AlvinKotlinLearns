package com.alvin.kotlinstudy;

import com.alvin.kotlinstudy.lesson1.Lesson;
import com.alvin.kotlinstudy.lesson1.Lesson02;
import com.alvin.kotlinstudy.lesson1.Lesson3;
import com.alvin.kotlinstudy.lesson2.Book;
import com.alvin.kotlinstudy.lesson2.Person;

/**
 * @author : Alvin
 * create at : 2020/3/31 18:37
 * description :
 */
class Mainff {

    public static void main(String[] args) {
//        Lesson02 ls2 = new Lesson02();
//        ls2.testNULL();
//        ls2.testPackage();
//        ls2.testIf();
//        ls2.testWhen();
//        ls2.judgmentType(123456789000L);
//        ls2.testFor();
//        Lesson3 l3 = new Lesson3();
//        l3.testContinue();
//        l3.testBreak();
//        l3.testLabelBreak();
//        l3.testLabelReturn();
        Person person = new Person("Alvin",18, 1);
        person.getName();
        Book book = new Book();
        Book englishBook = new Book("English",26);
        englishBook.testNull();

    }
}
