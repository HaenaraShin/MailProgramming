package dev.haenara.mailprogramming.solution.y2019.m12.d15

import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2019. 12. 15
 * 정수 배열이 주어졌을 때, 왼쪽과 오른쪽의 합이 같은 값이 되는 위치를 찾으시오.
 * 즉, A라는 배열이 있다면 A[0] + … + A[i - 1]과 A[i + 1] + … + A[n]이 같은 값이 되는 i의 위치가 답이 됩니다.
 * 만약 A[1] + … + A[n]이 0이라면 0도 답이 됩니다.
 *
 * Input: [0, -3, 5, -4, -2, 3, 1, 0]
 * Output: [0, 3, 7]
 *
 * 풀이 :
 * 전체를 오른쪽 합계(rightSum)에 넣어놓은 다음 한개씩 빼서 왼쪽 합계(leftSum)에 넣어가면서 진행한다.
 * 왼쪽 합계(leftSum)와 오른쪽 합계(rightSum)가 같으면 정답에 추가한다.
 */
class Solution191215 : Solution<Array<Int>, Array<Int>>{
    override fun solution(input: Array<Int>): Array<Int> {
        var leftSum = 0
        var rightSum = input.sum()
        val answerList = arrayListOf<Int>()
        for ((index, value) in input.withIndex()){
            rightSum -= value
            if (leftSum == rightSum) {
                answerList.add(index)
            }
            leftSum += value
        }
        return answerList.toTypedArray()
    }
}