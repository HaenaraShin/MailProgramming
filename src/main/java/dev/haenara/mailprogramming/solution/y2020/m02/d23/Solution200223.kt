package dev.haenara.mailprogramming.solution.y2020.m02.d23

import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2020. 02. 23
 *
 * M x N 크기의 양의 정수 매트릭스와 비용(cost)가 주어졌을 때,
 * 주어진 비용으로 매트릭스의 시작 위치 (0, 0)에서 마지막 위치 (M-1, N-1)까지 도달하는 경로의 수를 구하시오.
 * 매트릭스에서 이동한 경로의 비용은 거쳐간 셀 값의 합이다.
 * 매트릭스에서는 오직 오른쪽 한 칸 또는 아래쪽 한 칸으로만 이동할 수 있다.
 * 즉, 셀 (i, j)에서는 (i, j+1) 또는 (i+1, j)로 이동할 수 있다.
 *
 * Input
 * [[4, 7, 1, 6],
 *  [5, 7, 3, 9],
 *  [3, 2, 1, 2],
 *  [7, 1, 6, 3]]
 * cost = 25
 *
 * Output
 * 2 (두 가지 경로는 4-7-1-3-1-6-3, 4-5-7-3-1-2-3)
 *
 * 풀이
 *
 */

class Solution200223 : Solution<Solution200223.Input, Int>{
    private var count = 0
    private lateinit var map : Array<Array<Int>>
    private var cost = 0

    override fun solution(input : Input) : Int {
        map = input.map
        cost = input.cost
        return goRightOrDown(0, 0)
    }

     private fun goRightOrDown(x : Int, y : Int, costSum : Int = 0) : Int {
         val sum = costSum + map[y][x]
         if (x == map[y].lastIndex && y == map.lastIndex) {
             return if (sum == cost) {
                 1
             } else {
                 0
             }
         } else if (x == map[y].lastIndex) {
             // move down
             return goRightOrDown(x, y + 1, sum)
         } else if (y == map.lastIndex) {
             // move right
             return goRightOrDown(x + 1, y, sum)
         } else {
             // move right and down
             return goRightOrDown(x + 1, y, sum) + goRightOrDown(x, y + 1, sum)
         }
     }

    class Input(val map : Array<Array<Int>>, val cost : Int)
}

