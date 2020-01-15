import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2020. 01. 12
 * 정수 배열이 주어졌을 때, 배열의 원소의 값을 자신을 제외한 다른 원소들의 곱으로 변경하시오.
 * 단, 나누기 연산은 수행하지 않습니다.
 *
 * * 단 이문제는 O(N)으로 풀어야 한다는 추가 조건이 있다.
 *
 * Input: [1, 2, 3, 4, 5]
 * Output: [120, 60, 40, 30, 24]
 *
 * Input: [5, 3, 4, 2, 6, 8]
 * Output: [1152, 1920, 1440, 2880, 960, 720]
 *
 * 풀이 :
 * 두개의 배열을 만드는데
 * 앞에서부터 마지막 원소를 제외하고 하나씩 곱한 배열과
 * 뒤에서부터 첫번째 원소를 제외하고 하나씩 곱한 배열 두가지를 만든다.
 * 예를 들어 [1, 2, 3, 4, 5] 예제인 경우
 * 첫번째 배열은 [1(초기값), 1,     1*2, 1*2*3, 1*2*3*4]
 * 두번째 배열은 [5*4*3*2, 5*4*3, 5*4, 5,     1(초기값)]
 * 이런식으로 계단식으로 어긋나게 배열을 두개 만든 다음 순서대로 곱하면 된다.
 */

class Solution200112 : Solution<IntArray, LongArray> {
    override fun solution(input: IntArray)
            = multiplyArray(getArrayFromStart(input), getArrayFromEnd(input))

    /**
     * 앞에서부터 마지막 원소를 제외하고 하나씩 곱한 배열
     */
    private fun getArrayFromStart(input : IntArray) : LongArray{
        val toReturn = LongArray(input.size)
        var sum = 1L
        toReturn[0] = sum
        for (i in 0 until input.size-1) {
            sum *= input[i].toLong()
            toReturn[i+1] = sum
        }
        return toReturn
    }


    /**
     * 뒤에서부터 첫번째 원소를 제외하고 하나씩 곱한 배열
     */
    private fun getArrayFromEnd(input : IntArray) : LongArray{
        val toReturn = LongArray(input.size)
        var sum = 1L
        toReturn[input.lastIndex] = sum
        for (i in 0 until input.size-1) {
            sum *= input[input.size- i - 1].toLong()
            toReturn[input.size- i - 2] = sum
        }
        return toReturn
    }

    /**
     * 배열 두가지를 곱한 결과
     */
    private fun multiplyArray(array1: LongArray, array2: LongArray) : LongArray {
        val toReturn = LongArray(array1.size)
        for (i in 0..array1.lastIndex) {
            toReturn[i] = array1[i] * array2[i]
        }
        return toReturn
    }


}