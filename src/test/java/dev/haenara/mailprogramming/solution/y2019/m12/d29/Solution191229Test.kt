package dev.haenara.mailprogramming.solution.y2019.m12.d29

import org.junit.Assert.assertArrayEquals
import org.junit.Test

internal class Solution191229Test {

    @Test
     fun `191229-TC1 예제 입력일 때 예제 결과`() {
        assertArrayEquals(
            arrayOf(6, 8, 2, 3, 4, 1, 0, 0, 0),
            Solution191229().solution(arrayOf(6, 0, 8, 2, 3, 0, 4, 0, 1))
        )
    }

    @Test
    fun `191229-TC2 0만 여러개 있을 때 결과는 그대로`() {
        assertArrayEquals(
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0),
            Solution191229().solution(arrayOf(0, 0, 0, 0, 0, 0, 0, 0))
        )
    }

    @Test
    fun `191229-TC3 0만 1개 있을 때 결과는 그대로`() {
        assertArrayEquals(
            arrayOf(0),
            Solution191229().solution(arrayOf(0))
        )
    }

    @Test
    fun `191229-TC4 0이 없을 때 입력과 동일한 결과`() {
        assertArrayEquals(
            arrayOf(3, 4, 1, 2, 5),
            Solution191229().solution(arrayOf(3, 4, 1, 2, 5))
        )
    }

    @Test
    fun `191229-TC5 0이 맨 앞에 있을때 0만 맨 뒤로가는 결과`() {
        assertArrayEquals(
            arrayOf(3, 4, 1, 2, 5, 0),
            Solution191229().solution(arrayOf(0, 3, 4, 1, 2, 5))
        )
    }

    @Test
    fun `191229-TC5 0이 아닌 숫자 1개만 있을때 그대로 결과`() {
        assertArrayEquals(
            arrayOf(1),
            Solution191229().solution(arrayOf(1))
        )
    }

    @Test
    fun `191229-TC6 이미 정렬되어 있을 때 그대로 결과`() {
        assertArrayEquals(
            arrayOf(6, 8, 2, 3, 4, 1, 0, 0, 0),
            Solution191229().solution(arrayOf(6, 8, 2, 3, 4, 1, 0, 0, 0))
        )
    }

    @Test
    fun `191229-TC7 0이 앞에 몰려있을 때 0이 뒤로 전부 정렬된 결과`() {
        assertArrayEquals(
            arrayOf(6, 8, 2, 3, 4, 1, 0, 0, 0),
            Solution191229().solution(arrayOf(0, 0, 0, 6, 8, 2, 3, 4, 1))
        )
    }


    @Test
    fun `191229-TC8 0이 중간중간 있어도 정상적으로 정렬된 결과`() {
        assertArrayEquals(
            arrayOf(6, 8, 2, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0),
            Solution191229().solution(arrayOf(0, 6, 0, 8, 0, 2, 0, 3, 0, 4, 0, 1, 0))
        )
    }
}