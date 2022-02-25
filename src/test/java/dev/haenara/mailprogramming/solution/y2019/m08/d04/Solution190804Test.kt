package dev.haenara.mailprogramming.solution.y1009.m08.d04

import dev.haenara.mailprogramming.solution.y2019.m08.d04.Solution190804
import org.junit.Assert
import org.junit.Test

class Solution190804Test {
    @Test
    fun example() {
        Assert.assertArrayEquals(
            arrayOf(0, 0, 1, 1, 2, 2),
            Solution190804().solution(arrayOf(2, 0, 2, 1, 1, 0))
        )
    }

    @Test
    fun only0() {
        Assert.assertArrayEquals(
            arrayOf(0, 0, 0, 0, 0, 0),
            Solution190804().solution(arrayOf(0, 0, 0, 0, 0, 0))
        )
    }

    @Test
    fun only1() {
        Assert.assertArrayEquals(
            arrayOf(1, 1, 1, 1, 1),
            Solution190804().solution(arrayOf(1, 1, 1, 1, 1))
        )
    }

    @Test
    fun only2() {
        Assert.assertArrayEquals(
            arrayOf(2, 2, 2, 2, 2, 2),
            Solution190804().solution(arrayOf(2, 2, 2, 2, 2, 2))
        )
    }

    @Test
    fun already() {
        Assert.assertArrayEquals(
            arrayOf(0, 0, 1, 1, 2, 2),
            Solution190804().solution(arrayOf(0, 0, 1, 1, 2, 2))
        )
    }

    @Test
    fun reversed() {
        Assert.assertArrayEquals(
            arrayOf(0, 0, 0, 1, 1, 1, 2, 2, 2),
            Solution190804().solution(arrayOf(2, 2, 2, 1, 1, 1, 0, 0, 0))
        )
    }

    @Test
    fun general() {
        Assert.assertArrayEquals(
            arrayOf(0, 0, 0, 1, 1, 1, 1, 2, 2, 2),
            Solution190804().solution(arrayOf(2, 0, 1, 1, 2, 0, 1, 2, 0, 1))
        )

        Assert.assertArrayEquals(
            arrayOf(0, 2, 2, 2),
            Solution190804().solution(arrayOf(0, 2, 2, 2))
        )

        Assert.assertArrayEquals(
            arrayOf(0, 2, 2, 2),
            Solution190804().solution(arrayOf(2, 2, 2, 0))
        )

        Assert.assertArrayEquals(
            arrayOf(1, 2, 2, 2),
            Solution190804().solution(arrayOf(1, 2, 2, 2))
        )

        Assert.assertArrayEquals(
            arrayOf(1, 1, 2, 2),
            Solution190804().solution(arrayOf(1, 2, 1, 2))
        )

        Assert.assertArrayEquals(
            arrayOf(0, 0, 1, 1),
            Solution190804().solution(arrayOf(1, 0, 1, 0))
        )
    }
}
