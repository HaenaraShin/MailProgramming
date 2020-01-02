package dev.haenara.mailprogramming.usecase

import dev.haenara.mailprogramming.solution.y2019.dec.Solution191222

class UseCase191222(args: Array<String>) : UseCase<Array<Int>, Int>(args) {
    override val solution = Solution191222()
    override val sampleInput = arrayOf(2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2)
    override val description = " * 매일프로그래밍 2019. 12. 15\n" +
            " * 중복된 원소가 있는 정수 배열이 주어졌을 때, 주요 원소를 찾으시오.\n" +
            " * 주요 원소는 배열 크기의 반을 초과하여 등장하는 원소입니다.\n" +
            " * Input: [2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2]\n" +
            " * Output: 2"

    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Int) = "$output"
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
