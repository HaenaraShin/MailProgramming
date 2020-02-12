package dev.haenara.mailprogramming.solution.y2020.m02.d09

import org.junit.Assert.assertArrayEquals
import org.junit.Test

internal class Solution200209Test {
    @Test
    fun `20200209-TC1 예제1번 입력 일 때 예제1번 결과`() {
        assertArrayEquals(
            arrayOf(4, -1, 2, 1),
            Solution200209().solution(arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, -4))
        )
    }

    @Test
    fun `20200209-TC2 예제2번 입력 일 때 예제2번 결과`() {
        assertArrayEquals(
            arrayOf(5, 6, -2, 3),
            Solution200209().solution(arrayOf(8, -7, -3, 5, 6, -2, 3, -4, 2))
        )
    }

    @Test
    fun `20200209-TC3 0만 들어있을 때 합계는 0`() {
        assertArrayEquals(
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0),
            Solution200209().solution(arrayOf(0, 0, 0, 0, 0, 0, 0, 0))
        )
    }

    @Test
    fun `20200209-TC4 예제 1번에 중간중간 0이 들어가도 0이 포함된 예제 1의 결과`() {
        assertArrayEquals(
            arrayOf(4, 0, -1, 0, 2, 0, 1, 0),
            Solution200209().solution(arrayOf(0, -2, 0, 1, 0, -3, 0, 4, 0, -1, 0, 2, 0, 1, 0, -5, 0, -4, 0))
        )
    }

    @Test
    fun `20200209-TC5 음수가 계속 커서 최댓값이 결과`() {
        assertArrayEquals(
            arrayOf(9),
            Solution200209().solution(arrayOf(1, -2, 3, -4, 5, -6, 7, -8, 9, -10))
        )
    }

    @Test
    fun `20200209-TC6 양수가 계속 커서 최댓값 계속 누적되는 결과`() {
        assertArrayEquals(
            arrayOf(2, -1, 3, -2, 4, -3, 5, -4, 6),
            Solution200209().solution(arrayOf(2, -1, 3, -2, 4, -3, 5, -4, 6))
        )
    }

    @Test
    fun `20200209-TC7 양수가 계속 커서 최댓값 계속 누적되는 결과2`() {
        assertArrayEquals(
            arrayOf(2, -1, 3, -2, 4, -3, 5),
            Solution200209().solution(arrayOf(2, -1, 3, -2, 4, -3, 5, -4))
        )
    }

    @Test
    fun `20200209-TC8 양수만 있어서 전체의 합이 결과인 경우`() {
        assertArrayEquals(
            arrayOf(1, 2, 3, 4, 5),
            Solution200209().solution(arrayOf(1, 2, 3, 4, 5))
        )
    }

    @Test
    fun `20200209-TC9 적당히 값이 잘 섞여있는 경우`() {
        assertArrayEquals(
            arrayOf(7),
            Solution200209().solution(arrayOf(-1, 3, 2, -4, 3, -4, 5, -10, 7, -1))
        )
    }

    @Test
    fun `20200209-TC10 적당히 값이 잘 섞여있는 경우`() {
        assertArrayEquals(
            arrayOf(3, 6, -2, 4, 0),
            Solution200209().solution(arrayOf(1, -4, 2, 0, 3, -10, 3, 6, -2, 4, 0))
        )
    }
}