package dev.haenara.mailprogramming.solution.y2019.m12.d29

import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2020. 01. 19
 * 가장 긴 바이토닉 부분 배열 문제(Longest Bitonic Subarray Problem)는 주어진 배열에서 우선 값이 증가했다가
 * 그 후 감소하는 원소들의 집합 중 가장 긴 부분 배열을 찾는 문제입니다.
 * 배열이 주어졌을 때, 가장 긴 바이토닉 부분 배열을 찾으시오.
 * 단, 증가만 하거나 감소만 하는 부분 배열도 답이 될 수 있습니다.
 *
 * Input: [3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4]
 * Output: [4, 5, 9, 10, 8, 5, 3]
 *
 * Input: [1, 2, 3, 4, 5]
 * Output: [1, 2, 3, 4, 5]
 *
 * Input: [5, 4, 3, 2, 1]
 * Output: [5, 4, 3, 2, 1]
 * 단 이 문제는 O(N)으로 풀어야 한다.!
 *
 * 풀이 :
 * 변화량을 비교하여 임시 ArrayList에 값을 넣어가며 가장 긴 ArrayList 1개만을 기억하고 있는다.
 * 변화량이 같거나 이전변화량과 비교하여 증감하다 감소하는경우는 임시 ArrayList에 추가한다.
 * 반대로 감소하다 증가하는 경우에는 이전 마지막값을 포항하여 새로운 ArrayList 만들고 그 안에 넣는다.
 * 시행마다 임시 ArrayList가 가장 긴 1개의 ArrayList보다 긴지 비교하여 길다면 업데이트한다.
 */

class Solution200119 : Solution<Array<Int>, Array<Int>>{
    override fun solution(input: Array<Int>): Array<Int> {
        var lastValue = null as Int?
        var diff = 0 // 변화량
        var lastDiff = diff // 이전 변화량
        var longestBitonic = arrayListOf<Int>() // 가장 긴 배열
        var currnetBitonic = longestBitonic // 임시 배열
        for (e in input) {
            diff = e - (lastValue ?: e)
            if (currnetBitonic.isEmpty()) {
                currnetBitonic.add(e)
            } else {
                if (diff == 0 || lastValue == null) {
                    currnetBitonic = arrayListOf(e)
                } else if (diff * lastDiff > 0 || lastDiff == 0 || diff < lastDiff) { // 상태 유지
                    currnetBitonic.add(e)
                } else { // 커지다 작아지거나 동일한 값일 때
                    currnetBitonic = arrayListOf(lastValue, e)
                }
            }
            if (currnetBitonic.size > longestBitonic.size) { // 가장 긴 배열 하나만 기억하기 위해 길이 비교
                longestBitonic = currnetBitonic // 최종 승자만이 기억될 것입니다..
            }
            lastValue = e
            lastDiff = diff
        }
        return longestBitonic.toTypedArray()
    }

}