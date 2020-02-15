package dev.haenara.mailprogramming.solution.y2019.m08.d01


import org.junit.Assert.assertEquals
import org.junit.Test

class Solution190801Test {

    @Test
    fun `190801-TC1 예제1 입력일 때 예제 결과1`() {
        assertEquals(
            "b.n.n.",
            Solution190801().solution("banana")
        )
    }

    @Test
    fun `190801-TC2 예제2 입력일 때 예제 결과2`() {
        assertEquals(
            "...",
            Solution190801().solution("aaa")
        )
    }

    @Test
    fun `190801-TC3 a가 없을 때 입력한 그대로 결과`() {
        assertEquals(
            "qwert",
            Solution190801().solution("qwert")
        )
    }

    @Test
    fun `190801-TC4 숫자와 특수문자가 있어도 정상적으로 변환`() {
        assertEquals(
            "12345.bcd.!!",
            Solution190801().solution("12345abcda!!")
        )
    }
}