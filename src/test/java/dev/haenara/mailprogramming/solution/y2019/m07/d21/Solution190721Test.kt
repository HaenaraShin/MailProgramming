package dev.haenara.mailprogramming.solution.y2019.m07.d21


import org.junit.Assert.assertArrayEquals
import org.junit.Test

class Solution190721Test {

    @Test
    fun `191215-TC1 예제 입력일 때 예제 결과`() {
        assertArrayEquals(
            arrayOf("00000", "00001", "00010", "00100", "00101", "01000", "01001", "01010", "10000", "10001", "10010", "10100", "10101"),
            Solution190721().solution(5)
        )
    }

    @Test
    fun `191215-TC2 입력이 1일때 2개의 경우의 수`() {
        assertArrayEquals(
            arrayOf("0", "1"),
            Solution190721().solution(1)
        )
    }

    @Test
    fun `191215-TC3 입력이 2일때 3개의 경우의 수`() {
        assertArrayEquals(
            arrayOf("00", "01", "10"),
            Solution190721().solution(2)
        )
    }

    @Test
    fun `191215-TC4 입력이 3일때 5개의 경우의 수`() {
        assertArrayEquals(
            arrayOf("000", "001", "010", "100", "101"),
            Solution190721().solution(3)
        )
    }

}