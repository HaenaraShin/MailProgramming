package dev.haenara.mailprogramming.solution.y2019.dec

import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2019. 12. 29
 * 정수 배열이 주어졌을 때, 배열 내의 모든 0을 배열의 뒷부분으로 옮기시오.
 * 단, 0을 제외한 원소들의 순서는 유지되어야 합니다.
 * Input: [6, 0, 8, 2, 3, 0, 4, 0, 1]
 * Output: [6, 8, 2, 3, 4, 1, 0, 0, 0]
 *
 * 풀이 :
 * 앞에서부터 0을 제외하고 숫자가 들어갈 자리를 기억해두었다가
 * 0이 아닌 다른 숫자가 나오면 그 값에다가 값을 넣어준다.
 * 그리고 뒤쪽에 가서 나머지 0을 채워넣을만큼 0이 모이면 나머지는 0을 넣는다.
 * 시간복잡도, 공간복잡도 모두 O(n)
 */

class Solution191229 : Solution<Array<Int>, Array<Int>>{
    override fun solution(input: Array<Int>): Array<Int> {
        val output = input.copyOf()
        var zeroCnt = 0
        var position = 0
        for ((index, value) in output.withIndex()) {
            if (value != 0) {
                output[position++] = value
            } else {
              zeroCnt++
            }
            if (output.size - index - 1 <= zeroCnt) {
                output[index] = 0
            }
        }
        return output
    }
}