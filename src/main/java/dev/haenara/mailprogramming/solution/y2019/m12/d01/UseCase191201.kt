package dev.haenara.mailprogramming.solution.y2019.m12.d01

import Solution191201
import dev.haenara.mailprogramming.solution.UseCase

class UseCase191201(args: Array<String>) : UseCase<Array<Int>, Array<Int>>(args) {
    override val solution = Solution191201()
    override val sampleInput = arrayOf(-10, -3, 5, 6, -2)
    override val description = " * 매일프로그래밍 2019. 12. 01\n" +
            " * 정수 배열이 주어졌을 때, 배열 안에서 곱이 최대가 되는 두 정수를 찾으시오.\n" +
            " * Input: [-10, -3, 5, 6, -2]\n" +
            " * Output: [-10, -3] 또는 [5, 6]\n" +
            " *\n" +
            " * 풀이 :\n" +
            " * 곱이 최대가 되는 두 정수는 양수 중에 제일 큰 값 두개의 곱 또는 음수 중에 가장 작은 값 두개의 곱일 수 밖에 없다.\n" +
            " * 따라서 양수 중에 제일 큰 값 두개 값과 음수 중에 제일 작은 값을 찾고 곱한 다음 비교하여 더 큰 값을 출력하면 된다."

    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Array<Int>) = output.joinToString(separator = ", ")
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
