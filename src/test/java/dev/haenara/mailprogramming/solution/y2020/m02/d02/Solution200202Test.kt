package dev.haenara.mailprogramming.solution.y2020.m02.d02

import org.junit.Assert
import org.junit.Test

internal class Solution200202Test {
    @Test
    fun `20200202-TC1 예제1번 입력 일 때 예제1번 결과`() {
        Assert.assertEquals(
            6,
            Solution200202().solution(arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, -4))
        )
    }

    @Test
    fun `20200202-TC2 예제2번 입력 일 때 예제2번 결과`() {
        Assert.assertEquals(
            -2,
            Solution200202().solution(arrayOf(-8, -3, -6, -2, -5, -4))
        )
    }

    @Test
    fun `20200202-TC3 0만 들어있을 때 합계는 0`() {
        Assert.assertEquals(
            0,
            Solution200202().solution(arrayOf(0, 0, 0, 0, 0, 0, 0, 0))
        )
    }

    @Test
    fun `20200202-TC4 예제 1번에 중간중간 0이 들어가도 예제 1 결과`() {
        Assert.assertEquals(
            6,
            Solution200202().solution(arrayOf(0, -2, 0, 1, 0, -3, 0, 4, 0, -1, 0, 2, 0, 1, 0, -5, 0, -4, 0))
        )
    }

    @Test
    fun `20200202-TC5 음수가 계속 커서 최댓값이 결과`() {
        Assert.assertEquals(
            9,
            Solution200202().solution(arrayOf(1, -2, 3, -4, 5, -6, 7, -8, 9, -10))
        )
    }

    @Test
    fun `20200202-TC6 양수가 계속 커서 최댓값 계속 누적되는 결과`() {
        Assert.assertEquals(
            10,
            Solution200202().solution(arrayOf(2, -1, 3, -2, 4, -3, 5, -4, 6))
        )
    }

    @Test
    fun `20200202-TC7 양수가 계속 커서 최댓값 계속 누적되는 결과2`() {
        Assert.assertEquals(
            8,
            Solution200202().solution(arrayOf(2, -1, 3, -2, 4, -3, 5, -4))
        )
    }

    @Test
    fun `20200202-TC8 양수만 있어서 전체의 합이 결과인 경우`() {
        Assert.assertEquals(
            15,
            Solution200202().solution(arrayOf(1, 2, 3, 4, 5))
        )
    }

    @Test
    fun `20200202-TC9 적당히 값이 잘 섞여있는 경우`() {
        Assert.assertEquals(
            7,
            Solution200202().solution(arrayOf(-1, 3, 2, -4, 3, -4, 5, -10, 7, -1))
        )
    }

    @Test
    fun `20200202-TC10 적당히 값이 잘 섞여있는 경우`() {
        Assert.assertEquals(
            11,
            Solution200202().solution(arrayOf(1, -4, 2, 0, 3, -10, 3, 6, -2, 4, 0))
        )
    }

    @Test
    fun `20200202-TC11 `() {
        Assert.assertEquals(
            10,
            Solution200202().solution(arrayOf(10, -1, 1, -2, 2, -3, 3, -4, 4, 0))
        )
    }

    @Test
    fun `20200202-TC12 `() {
        Assert.assertEquals(
            11,
            Solution200202().solution(arrayOf(10, -1, 1, -2, 2, -3, 3, -4, 4, 1))
        )
    }

    @Test
    fun `20200202-TC13 `() {
        Assert.assertEquals(
            10,
            Solution200202().solution(arrayOf(1, -1, 2, -2, 3, -3, 4, -4, 10))
        )
    }

    @Test
    fun `20200202-TC14 `() {
        Assert.assertEquals(
            11,
            Solution200202().solution(arrayOf(-10, 2, -1, 2, -2, 3, -3, 4, -4, 10))
        )
    }
}