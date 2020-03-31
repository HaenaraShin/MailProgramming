package dev.haenara.mailprogramming.solution.y2020.m03.d29

import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2020. 03. 29
 * 순환 정수 배열이 주어졌을 때, 합이 최대가 되는 부분 배열을 구하시오.
 *
 * Input: [2, 1, -5, 4, -3, 1, -3, 4, -1]
 * Output: 부분 배열 [4, -1, 2, 1], 합 6
 * Input: [-3, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output: 부분 배열 [4, -1, 2, 1], 합 6
 *
 * 풀이 :
 * 입력배열이 2번 반복되는 배열이라 가정하고 2월 9일 문제와 동일하게 풀 수 있다.
 * 단 양수만 있을 경우 전체 배열의 길이를 넘어갈 수 있으므로 입력 길이보다 길면 자른다.
 */

class Solution200329 : Solution<Array<Int>, Array<Int>>{
    override fun solution(input: Array<Int>): Array<Int> {
        val doubleInput = intArrayOf(*input.toIntArray(), *input.toIntArray())
        var biggestArrayList = arrayListOf<Int>()
        var currentArrayList = arrayListOf<Int>()
        var lastArrayList = arrayListOf<Int>()
        var biggestSum = if (input.isNotEmpty()) { input[0] } else { 0 }
        var lastSum = 0
        var currentSum = 0
        var isLastPositive = 0
        doubleInput.forEach {
            // 예외적으로 음수만 나오는 경우에는 개별로 최대값인지 비교한다.
            if (biggestSum < 0 && it > biggestSum) {
                biggestArrayList.add(it)
                biggestSum = it
            }

            // 양수 또는 음수의 연속인지, 아니면 부호가 바뀐 것인지 비교한다.
            // 이전까지의 값을 isLastPositive에 저장하고 현재 값과 곱하여 양수면 부호가 같고 음수면 부호가 다른 것이다.
            if (isLastPositive * it >= 0) {
                // 양수든 음수든 일단 연속된다면 임시 합계를 누적한다.
                currentArrayList.add(it)
                currentSum += it
            } else {
                // 부호가 바뀌었다면 양수였다가 음수로 나온건지, 음수였다가 양수가 나온건지 비교한다.
                if (it < 0) {
                    // 양수였다가 음수가 된 경우
                    lastSum = currentSum  // 앞으로 나올 음수의 합과 이전에 나왔던 양수의 합을 비교해야 하므로 일단 저장해둔다.
                    lastArrayList = currentArrayList.clone() as ArrayList<Int>
                    if (biggestSum < currentSum) {  // 앞으로 양수가 안나올 수도 있으므로 현재시점에서 최대 합계보다 큰 양수의 합인지 비교한다.
                        biggestSum = currentSum
                        biggestArrayList = currentArrayList.clone() as ArrayList<Int>
                    }
                    currentSum = it  // 앞으로 나올 음수 누적 합계를 위해 현재 합계를 갱신
                    currentArrayList.clear()
                    currentArrayList.add(it)
                } else {
                    // 음수였다가 양수가 된 경우
                    if (currentSum + lastSum > 0) {  // 이전 양수합계가 음수합계보다 크다면
                        currentSum += (lastSum + it) // 양수합계와 음수합계를 합쳐서 하나의 작은 양수로 취급하여 누적 계산을 이어간다.
                        lastArrayList.forEachIndexed { index, element ->
                            currentArrayList.add(index, element)
                        }
                        currentArrayList.add(it)
                    } else { // 이전 양수합계가 작아서 더이상 의미가 없다면
                        currentSum = it // 앞으로 새로운 양수 누적 합계를 위해 현재 합계를 갱신
                        currentArrayList = arrayListOf(it)
                    }
                }
            }
            // 0인 경우는 부호 판단에서 생략한다.
            if (it != 0) {
                isLastPositive = it
            }
        }

        val answser = if (currentSum < 0) { // 최종적으로 음수 합계로 끝난 경우는 비교할 필요가 없다.
            biggestArrayList.toTypedArray()
        } else if (biggestSum <= currentSum) { // 최종합계가 여태까지의 합계최댓값보다 크다면 갱신
            currentArrayList.toTypedArray()
        } else {
            biggestArrayList.toTypedArray()
        }

        return if (answser.size > input.size) {
            answser.copyOfRange(0, answser.size)
        } else {
            answser
        }
    }
}