package dev.haenara.mailprogramming.solution.y2020.m03.d29

import dev.haenara.mailprogramming.solution.UseCase

class UseCase200329(args: Array<String>) : UseCase<Array<Int>, Array<Int>>(args) {
    override val solution = Solution200329()
    override val sampleInput = arrayOf(-3, 1, -3, 4, -1, 2, 1, -5, 4)
    override val description = " * 매일프로그래밍 2020. 03. 29\n" +
            " * 순환 정수 배열이 주어졌을 때, 합이 최대가 되는 부분 배열을 구하시오.\n" +
            " * \n" +
            " * Input: [2, 1, -5, 4, -3, 1, -3, 4, -1]\n" +
            " * Output: 부분 배열 [4, -1, 2, 1], 합 6\n" +
            " * Input: [-3, 1, -3, 4, -1, 2, 1, -5, 4]\n" +
            " * Output: 부분 배열 [4, -1, 2, 1], 합 6\n" +
            " * \n" +
            " * 풀이 :\n" +
            " * 입력배열이 2번 반복되는 배열이라 가정하고 2월 9일 문제와 동일하게 풀 수 있다.\n" +
            " * 단 양수만 있을 경우 전체 배열의 길이를 넘어갈 수 있으므로 입력 길이보다 길면 자른다."
    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Array<Int>) = output.joinToString(separator = ", ")
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
