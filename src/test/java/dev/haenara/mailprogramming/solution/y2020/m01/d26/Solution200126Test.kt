package dev.haenara.mailprogramming.solution.y2020.m01.d26

import org.junit.Assert.assertEquals
import org.junit.Test

internal class Solution200126Test {

    @Test
    fun `20200126-TC1 예제1번 입력 일 때 예제1번 결과`() {
        assertEquals(7,
            Solution200126().solution(arrayOf(2, 7, 9, 5, 1, 3, 5))
        )
    }

    @Test
    fun `20200126-TC2 가장 큰 차이가 제일 먼저 나오는 경우`() {
        assertEquals(5,
            Solution200126().solution(arrayOf(0, 5, 1, 4, 2, 3, 4))
        )
    }

    @Test
    fun `20200126-TC3 가장 큰 차이가 마지막에 나오는 경우`() {
        assertEquals(5,
            Solution200126().solution(arrayOf(2, 3, 1, 4, 0, 5))
        )
    }

    @Test
    fun `20200126-TC4 최대값이 점점 커지는 경우`() {
        assertEquals(5,
            Solution200126().solution(arrayOf(0, 1, 2, 3, 4, 5))
        )
    }

    @Test
    fun `20200126-TC5 최소값이 점점 작아지는 경우`() {
        assertEquals(5,
            Solution200126().solution(arrayOf(4, 3, 2, 1, -2, 3))
        )
    }

    @Test
    fun `20200126-TC6 최소값이 점점 작아지는데 의미는 없는 경우`() {
        assertEquals(5,
            Solution200126().solution(arrayOf(0, 5, 4, 3, 2, 1, 0, -1))
        )
    }

    @Test
    fun `20200126-TC7 최소값, 최대값이 계속 갱신되는 경우`() {
        assertEquals(5,
            Solution200126().solution(arrayOf(2, 3, 4, 1, 5, 0, 5))
        )
    }

    @Test
    fun `20200126-TC8 같은 패턴이 반복 되는 경우`() {
        assertEquals(5,
            Solution200126().solution(arrayOf(0, 5, 0, 5, 0, 5))
        )
    }

    @Test
    fun `20200126-TC9 값이 반복 되는 경우`() {
        assertEquals(0,
            Solution200126().solution(arrayOf(1, 1, 1, 1, 1))
        )
    }

    @Test
    fun `20200126-TC10 좌측의 원소가 우측의 원소보다 커서 비교할게 없는 경우`() {
        assertEquals(0,
            Solution200126().solution(arrayOf(5, 0))
        )
    }

}