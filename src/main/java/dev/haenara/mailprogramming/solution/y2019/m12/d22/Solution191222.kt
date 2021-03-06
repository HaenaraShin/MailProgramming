package dev.haenara.mailprogramming.solution.y2019.m12.d22

import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2019. 12. 15
 * 중복된 원소가 있는 정수 배열이 주어졌을 때, 주요 원소를 찾으시오.
 * 주요 원소는 배열 크기의 반을 초과하여 등장하는 원소입니다.
 * Input: [2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2]
 * Output: 2
 *
 * 풀이 :
 * 주요원소의 정의대로 배열의 크기 N 의 절반인
 * N / 2 보다 많이 호출된 원소를 찾는다.
 * 단 이러한 경우에 원소의 배치에 따라 최악의 경우 O(N)이 된다.
 * 개선의 여지는 있다면 원소를 하나씩 세어나가다가 남은 원소의 갯수와 주요원소 후보 1,2위의 차이를 비교하는 식으로
 * 전체를 다 세보지 않아도 주요원소를 찾아낼 수 있지만
 * 개선해도 O(N)인것은 마찬가지이다.
 */

class Solution191222 : Solution<Array<Int>, Int>{
    override fun solution(input: Array<Int>): Int {
        val atLeast = input.size / 2
        val callCount = hashMapOf<Int, Int>()
        input.forEach {
            callCount[it] = (callCount[it] ?: 0) + 1
            if (callCount[it]!! > atLeast) {
                return it
            }
        }
        throw Exception("주요 원소가 존재하지 않습니다.")
    }
}