package dev.haenara.mailprogramming.solution.y2020.m01

import Solution200112
import org.junit.Assert.*
import org.junit.Test

internal class Solution200112Test {

    @Test
    fun `20200112-TC1 예제1번 입력 일 때 예제1번 결과`() {
        assertArrayEquals(
            longArrayOf(120, 60, 40, 30, 24),
            Solution200112().solution(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `20200112-TC2 예제2번 입력 일 때 예제2번 결과`() {
        assertArrayEquals(
            longArrayOf(1152, 1920, 1440, 2880, 960, 720),
            Solution200112().solution(intArrayOf(5, 3, 4, 2, 6, 8)))
    }
}