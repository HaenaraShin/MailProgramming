package dev.haenara.mailprogramming.solution.y2019.m12.d22

import org.junit.Assert.assertEquals
import org.junit.Test


internal class Solution191222Test {

    @Test
    fun `191222-TC1 예제 입력일 때 예제 결과`() {
        assertEquals(
            2,
            Solution191222().solution(arrayOf(2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2))
        )
    }

    @Test
    fun `191222-TC2 모두 같은 원소일 때 해당 원소가 결과`() {
        assertEquals(
            1,
            Solution191222().solution(arrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1))
        )
    }

    @Test
    fun `191222-TC3 원소가 하나일 때 해당 원소가 결과`() {
        assertEquals(
            1,
            Solution191222().solution(arrayOf(1))
        )
    }

    @Test(expected = Exception::class)
    fun `191222-TC4 주요원소가 없을 때 Exception 발생`() {
        Solution191222().solution(arrayOf(1, 2, 3, 4, 5))
    }
}