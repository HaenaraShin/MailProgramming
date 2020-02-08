package dev.haenara.mailprogramming.solution.y2019.m12.d08

import Solution191208
import org.junit.Assert.assertEquals
import org.junit.Test

internal class Solution191208Test {

    @Test
    fun `191215-TC1 예제 입력일 때 예제 결과`() {
        assertEquals(
            10,
            Solution191208().solution(12)
        )
    }

    @Test
    fun `191215-TC2 예제 입력 1일 때 결과 0`() {
        assertEquals(
            0,
            Solution191208().solution(1)
        )
    }

    @Test
    fun `191215-TC3 예제 입력 2일 때 결과 0`() {
        assertEquals(
            0,
            Solution191208().solution(0)
        )
    }

    @Test
    fun `191215-TC4 예제 입력 3일 때 결과 2`() {
        assertEquals(
            2,
            Solution191208().solution(3)
        )
    }


    @Test
    fun `191215-TC5 예제 입력 35일 때 결과 44`() {
        assertEquals(
            44,
            Solution191208().solution(35)
        )
    }
}