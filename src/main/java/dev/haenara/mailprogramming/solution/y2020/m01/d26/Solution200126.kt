package dev.haenara.mailprogramming.solution.y2020.m01.d26

import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2020. 01. 26
 * 정수 배열이 주어졌을 때, 오른쪽 원소가 왼쪽 원소보다 더 큰 경우 중 두 원소의 차가 최대가 되는 값을 찾으시오.
 * Input: [2, 7, 9, 5, 1, 3, 5]
 * Output: 7 (원소 2와 9)
 *
 * 풀이
 * 문제의 조건대로 만약 두 원소의 차가 최대가 되는 경우는 둘중의 하나의 원소가 최소값 또는 최대값일 수밖에 없다.
 * 따라서 최소값이 나오는 경우와 최댓값이 나오는 경우를 찾아서 차이값을 갱신해나가면서
 * 결과적으로 최대 차이값이 결정되는 순간을 찾는다.
 * 단 최소값이 좌측에 있어야 하므로, 새로운 최소값이 나오는 경우부터 새로 비교하면 된다.
 */

class Solution200126 : Solution<Array<Int>, Int>{
    override fun solution(input: Array<Int>): Int {
        var currentMin = input[0]
        var currentMax = input[0]
        var currntDiff = currentMax - currentMin
        var maxDiff = currntDiff

        for (element in input) {
            if (currentMax < element) {
                currentMax = element
                currntDiff = currentMax - currentMin
                maxDiff = maxOf(currntDiff, maxDiff)
           }
            else if (currentMin > element) {
                currentMin = element
                currentMax = element
                currntDiff = 0
            }
        }
        return maxDiff
    }
}