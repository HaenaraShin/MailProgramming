package dev.haenara.mailprogramming.solution.y2019.m08.d04

import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2019. 08. 04
 * 0, 1, 2로 이루어진 배열을 가장 효율적으로 정렬 하시오. 시간복잡도 O(n).
 * Given an array consisting of 0, 1 and 2s, sort this array.
 * Input: [0, 1, 2, 2, 0, 0, 0, 1]
 * Output: [0, 0, 0, 0, 1, 1, 2, 2]
 *
 * 풀이
 * 퀵소트마냥 양쪽에서 진행하면서 0과 2로만 채워진 정렬된 배열을 우선 만든다.
 * 즉 좌측피벗이 2를 찾을때까지, 우측피벗이 0을 찾을때까지 진행하면서 정렬 되지 않은 0과 2를 찾으면 바꿔서 정렬하는 식이다.
 * 최종적으로 좌측에는 0만, 우측에는 2만 모조리 채워넣고 정렬이 끝난 뒤 1의 갯수만큼 중간에 삽입한다.
 */

class Solution190804 : Solution<Array<Int>, Array<Int>>{
    override fun solution(numbers: Array<Int>): Array<Int> {
        var left = 0
        var right = numbers.lastIndex
        var leftMiddle = 0
        var rightMiddle = 0
        while (left < right) {
            while (numbers[left] != 2 && left < right) {
                if (numbers[left] == 1) {
                    numbers[left] = 0 // 좌측은 무조건 0
                    leftMiddle++ // 1은 갯수만 세두었다가 마지막에 채운다.
                }
                left++
            }
            while (numbers[right] != 0 && left < right) {
                if (numbers[right] == 1) {
                    numbers[right] = 2 // 우측은 무조건 2
                    rightMiddle++ // 1은 갯수만 세두었다가 마지막에 채운다.
                }
                right--
            }
            if (left < right) {
                swap(numbers, left, right)
            } else {
                when (numbers[left]) {
                    0 -> {
                        for (i in 0 until leftMiddle) {
                            numbers[left - i] = 1
                        }
                    }
                    1 -> {
                        for (i in 0 until leftMiddle) {
                            numbers[left - 1 - i] = 1
                        }
                    }
                    2 -> {
                        left
                        for (i in 0 until rightMiddle) {
                            numbers[left + i] = 1
                        }
                        for (i in 0 until leftMiddle) {
                            numbers[left -1 - i] = 1
                        }
                    }
                }
                break
            }
        }
        return numbers
    }

    private fun swap(arr: Array<Int>, left: Int, right: Int) {
        val temp = arr[right]
        arr[right] = arr[left]
        arr[left] = temp
    }
}
