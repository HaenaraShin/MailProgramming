package dev.haenara.mailprogramming.solution.y2020.m01.d06

import Solution200106
import org.junit.Assert
import org.junit.Test


internal class Solution200106Test {
    @Test
    fun `예제 입력일 때 예제 결과값`() {
        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(2, 4), Pair(1, 5), Pair(7, 9))),
            arrayOf(Pair(1, 5), Pair(7, 9))
        )
    }

    @Test
    fun `인자가 한개일 때 결과값이 한개`() {
        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,0))),
            arrayOf(Pair(0,0))
        )
    }


    @Test
    fun `똑같은 인자가 여러개일 때 결과값이 한개`() {
        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,0), Pair(0,0))),
            arrayOf(Pair(0,0))
        )

        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,0), Pair(0,0), Pair(0,0))),
            arrayOf(Pair(0,0))
        )

        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,0), Pair(0,0), Pair(0,0), Pair(0,0))),
            arrayOf(Pair(0,0))
        )
    }

    @Test
    fun `중첩된 포함관계가 여러개일 때 결과값이 한개`() {
        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,0), Pair(0,1), Pair(0,2), Pair(0,3), Pair(0,4))),
            arrayOf(Pair(0, 4))
        )

        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,4), Pair(0,3), Pair(0,2), Pair(0,1), Pair(0,0))),
            arrayOf(Pair(0, 4))
        )

        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,4), Pair(1,4), Pair(2,4), Pair(3,4), Pair(3,4))),
            arrayOf(Pair(0, 4))
        )
    }


    @Test
    fun `포함관계가 나중에 한꺼번에 중첩될 때 정상적으로 합쳐진 결과값`() {
        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,0), Pair(1,1), Pair(2,2), Pair(3,3), Pair(0,4))),
            arrayOf(Pair(0, 4))
        )

        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,0), Pair(1,1), Pair(1,2), Pair(3,3), Pair(2,3))),
            arrayOf(Pair(0, 0), Pair(1, 3))
        )

        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,0), Pair(1,1), Pair(1,2), Pair(3,3), Pair(2,4))),
            arrayOf(Pair(0, 0), Pair(1, 4))
        )
    }


    @Test
    fun `정렬된 입력일 때 정렬된 결과 값`() {
        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(0,0), Pair(1,1), Pair(2,2), Pair(3,3), Pair(4,4))),
            arrayOf(Pair(0,0), Pair(1,1), Pair(2,2), Pair(3,3), Pair(4,4))
        )
    }

    @Test
    fun `역순 정렬된 입력일 때 정렬된 결과 값`() {
        Assert.assertArrayEquals(
            Solution200106().solution(arrayOf(Pair(4,4), Pair(3,3), Pair(2,2), Pair(1,1), Pair(0,0))),
            arrayOf(Pair(0,0), Pair(1,1), Pair(2,2), Pair(3,3), Pair(4,4))
        )
    }


}