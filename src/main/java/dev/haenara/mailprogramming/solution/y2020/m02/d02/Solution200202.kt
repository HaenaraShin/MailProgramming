package dev.haenara.mailprogramming.solution.y2020.m02.d02

import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2020. 02. 02
 * 정수 배열이 주어졌을 때, 합이 최대가 되는 부분 배열의 합을 구하시오.
 * 단, 부분 배열의 원소들은 연속된 원소들로 구성되어야 합니다.
 *
 * Input: [-2, 1, -3, 4, -1, 2, 1, -5, -4]
 * Output: 6 (부분 배열은 [4, -1, 2, 1])

 * Input: [-8, -3, -6, -2, -5, -4]
 * Output: -2 (부분 배열은 [-2])
 *
 * 풀이
 * 연속된 양수끼리와 연속된 음수끼리 합쳐서 합계끼리 비교해나가며 계산해나간다.
 * 따라서 연속되는 양수 또는 음수가 나올 땐 누적하여 합산하고
 * 양수 또는 음수가 연속되지 않고 부호가 바뀐 경우에 이전까지 누적된 합계를 비교해나가는 식으로 계산한다.
 * 연속으로 양수가 나오다가 음수가 나올 때 이전까지의 양수 합계를 가지고 이전까지의 가장 큰 양수의 합보다 큰지 비교한다.
 * 양수의 합이 다음에 나오는 음수의 합보다 더 크다면 이후에 나오는 양수와 무조건 합치는 쪽이 더 크기 때문에
 * 양수의 합과 음수의 합을 합쳐서 약간 작은 양수로써 이후에 나오는 양수의 합에 더해지도록 한다.
 * 양수의 합보다 다음에 나오는 음수의 합이 더 크다면 이후에 양수가 나오더라도 영향이 없기 때문에
 * 그 때를 기준으로 가장 큰 양수의 합인지 비교만 하고 새로운 양수의 합계를 더한다.
 * 예외적으로 0이 나올때는 무시하고, 음수만 나올 때는 개별로 최대값인지 비교한다.
 */

class Solution200202 : Solution<Array<Int>, Int>{
    override fun solution(input: Array<Int>): Int {
        var biggestSum = if (input.isNotEmpty()) { input[0] } else { 0 }
        var lastSum = 0
        var currentSum = 0
        var isLastPositive = 0
        input.forEach {
            // 예외적으로 음수만 나오는 경우에는 개별로 최대값인지 비교한다.
            if (biggestSum < 0 && it > biggestSum) {
                biggestSum = it
            }

            // 양수 또는 음수의 연속인지, 아니면 부호가 바뀐 것인지 비교한다.
            // 이전까지의 값을 isLastPositive에 저장하고 현재 값과 곱하여 양수면 부호가 같고 음수면 부호가 다른 것이다.
            if (isLastPositive * it >= 0) {
                // 양수든 음수든 일단 연속된다면 임시 합계를 누적한다.
                currentSum += it
            } else {
                // 부호가 바뀌었다면 양수였다가 음수로 나온건지, 음수였다가 양수가 나온건지 비교한다.
                if (it < 0) {
                    // 양수였다가 음수가 된 경우
                    lastSum = currentSum  // 앞으로 나올 음수의 합과 이전에 나왔던 양수의 합을 비교해야 하므로 일단 저장해둔다.
                    if (biggestSum < currentSum) {  // 앞으로 양수가 안나올 수도 있으므로 현재시점에서 최대 합계보다 큰 양수의 합인지 비교한다.
                        biggestSum = currentSum
                    }
                    currentSum = it  // 앞으로 나올 음수 누적 합계를 위해 현재 합계를 갱신
                } else {
                    // 음수였다가 양수가 된 경우
                    if (currentSum + lastSum > 0) {  // 이전 양수합계가 음수합계보다 크다면
                        currentSum += (lastSum + it) // 양수합계와 음수합계를 합쳐서 하나의 작은 양수로 취급하여 누적 계산을 이어간다.
                    } else { // 이전 양수합계가 작아서 더이상 의미가 없다면
                        currentSum = it // 앞으로 새로운 양수 누적 합계를 위해 현재 합계를 갱신
                    }
                }
            }
            // 0인 경우는 부호 판단에서 생략한다.
            if (it != 0) {
                isLastPositive = it
            }
        }

        return if (currentSum < 0) { // 최종적으로 음수 합계로 끝난 경우는 비교할 필요가 없다.
            biggestSum
        } else if (biggestSum < currentSum) { // 최종합계가 여태까지의 합계최댓값보다 크다면 갱신
            currentSum
        } else {
            biggestSum
        }
    }
}