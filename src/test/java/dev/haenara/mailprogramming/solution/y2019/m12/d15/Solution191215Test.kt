package dev.haenara.mailprogramming.solution.y2019.m12.d15

import org.junit.Assert.assertArrayEquals
import org.junit.Test


internal class Solution191215Test {
    @Test
    fun `191215-TC1 예제 입력일 때 예제 결과`() {
        assertArrayEquals(
            arrayOf(0, 3, 7),
            Solution191215().solution(arrayOf(0, -3, 5, -4, -2, 3, 1, 0))
        )
    }

    @Test
    fun `191215-TC2 전부 0일 때 모든 index가 결과`() {
        assertArrayEquals(
            arrayOf(0, 1, 2, 3, 4, 5),
            Solution191215().solution(arrayOf(0, 0, 0, 0, 0, 0))
        )
    }

    @Test
    fun `191215-TC3 좌우대칭이고 0이 아닌 경우에 중앙값이 결과`() {
        assertArrayEquals(
            arrayOf(4),
            Solution191215().solution(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1))
        )
    }

    @Test
    fun `191215-TC4 정답이 없는 경우 빈 결과`() {
        assertArrayEquals(
            arrayOf(),
            Solution191215().solution(arrayOf(1, 3, 6, 23, 17))
        )
    }
}