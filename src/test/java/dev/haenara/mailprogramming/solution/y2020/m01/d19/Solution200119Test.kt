package dev.haenara.mailprogramming.solution.y2020.m01.d19

import dev.haenara.mailprogramming.solution.y2019.m12.d29.Solution200119
import org.junit.Assert.*
import org.junit.Test

internal class Solution200119Test {

    @Test
    fun `20200119-TC1 예제1번 입력 일 때 예제1번 결과`() {
        assertArrayEquals(
            arrayOf(4, 5, 9, 10, 8, 5, 3),
            Solution200119().solution(arrayOf(3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4)))
    }

    @Test
    fun `20200119-TC1 예제2번 증가만 할 때 전체 배열이 결과`() {
        assertArrayEquals(
            arrayOf(1, 2, 3, 4, 5),
            Solution200119().solution(arrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `20200119-TC1 예제3번 감소만 할 때 전체 배열이 결과`() {
        assertArrayEquals(
            arrayOf(5, 4, 3, 2, 1),
            Solution200119().solution(arrayOf(5, 4, 3, 2, 1)))
    }



    @Test
    fun `20200119-TC1 같은 값이 반복되면 하나만 결과`() {
        assertArrayEquals(
            arrayOf(1),
            Solution200119().solution(arrayOf(1, 1, 1, 1, 1)))
    }

}