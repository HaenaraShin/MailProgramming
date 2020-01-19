package dev.haenara.mailprogramming.solution.y2019.m12.d15

import dev.haenara.mailprogramming.solution.UseCase

class UseCase191215(args: Array<String>) : UseCase<Array<Int>, Array<Int>>(args) {
    override val solution = Solution191215()
    override val sampleInput = arrayOf(0, -3, 5, -4, -2, 3, 1, 0)
    override val description = " * 매일프로그래밍 2019. 12. 16\n" +
            " * 정수 배열이 주어졌을 때, 왼쪽과 오른쪽의 합이 같은 값이 되는 위치를 찾으시오.\n" +
            " * 즉, A라는 배열이 있다면 A[0] + … + A[i - 1]과 A[i + 1] + … + A[n]이 같은 값이 되는 i의 위치가 답이 됩니다.\n" +
            " * 만약 A[1] + … + A[n]이 0이라면 0도 답이 됩니다.\n" +
            " *\n" +
            " * Input: [0, -3, 5, -4, -2, 3, 1, 0]\n" +
            " * Output: [0, 3, 7]\n" +
            " *\n" +
            " * 풀이 :\n" +
            " * 전체를 오른쪽 합계(rightSum)에 넣어놓은 다음 한개씩 빼서 왼쪽 합계(leftSum)에 넣어가면서 진행한다.\n" +
            " * 왼쪽 합계(leftSum)와 오른쪽 합계(rightSum)가 같으면 정답에 추가한다."

    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Array<Int>) = output.joinToString(separator = ", ")
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
