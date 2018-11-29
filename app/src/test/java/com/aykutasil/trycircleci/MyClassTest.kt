package com.aykutasil.trycircleci

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MyClassTest {

    private var myClass: MyClass? = null

    @Before
    fun initializeTestClass() {
        myClass = MyClass()
    }

    @Test
    fun topla_is_int() {
        val sonuc = myClass?.topla(1, 2)
        assert(sonuc is Int)
    }

    @Test
    fun check_topla() {
        val sonuc = myClass?.topla(1, 2)
        assert(sonuc == 3)
    }

}