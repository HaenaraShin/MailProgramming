/**
 * 매일프로그래밍 2019. 12. 01
 * 정수 배열이 주어졌을 때, 배열 안에서 곱이 최대가 되는 두 정수를 찾으시오.
 * Input: [-10, -3, 5, 6, -2]
 * Output: [-10, -3] 또는 [5, 6]
 *
 * 풀이 :
 * 곱이 최대가 되는 두 정수는 양수 중에 제일 큰 값 두개의 곱 또는 음수 중에 가장 작은 값 두개의 곱일 수 밖에 없다.
 * 따라서 양수 중에 제일 큰 값 두개 값과 음수 중에 제일 작은 값을 찾고 곱한 다음 비교하여 더 큰 값을 출력하면 된다.
 */
fun main(args: Array<String>) {
    Solution().solution(arrayOf(-10, -3, 5, 6, -2)).forEach {
        print("$it ")
    }
}
class Solution {
    fun solution(list: Array<Int>) : Array<Int> {
        var negativeSmallest1 = 0
        var negativeSmallest2 = 0
        var positiveBiggest1 = 0
        var positiveBiggest2 = 0

        list.forEach {
            if (it > 0) {
                if (it > positiveBiggest1) {
                    positiveBiggest2 = positiveBiggest1
                    positiveBiggest1 = it
                } else if (it > positiveBiggest2) {
                    positiveBiggest2 = it
                }
            } else {
                if (it < negativeSmallest1) {
                    negativeSmallest2 = negativeSmallest1
                    negativeSmallest1 = it
                } else if (it < negativeSmallest2) {
                    negativeSmallest2 = it
                }
            }
        }

        return if (positiveBiggest1 * positiveBiggest1 > negativeSmallest1 * negativeSmallest2) {
            arrayOf(positiveBiggest1, positiveBiggest2)
        } else {
            arrayOf(negativeSmallest1, negativeSmallest2)
        }
    }
}