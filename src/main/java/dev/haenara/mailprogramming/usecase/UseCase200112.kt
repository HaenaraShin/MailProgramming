package dev.haenara.mailprogramming.usecase

import Solution200112

class UseCase200112(args: Array<String>) : UseCase<IntArray, LongArray>(args) {
    override val solution = Solution200112()
    override val sampleInput = intArrayOf(1, 2, 3, 4, 5)
    override val description = " * 매일프로그래밍 2020. 01. 06\n" +
            " * 정수 배열이 주어졌을 때, 배열의 원소의 값을 자신을 제외한 다른 원소들의 곱으로 변경하시오.\n" +
            " * 단, 나누기 연산은 수행하지 않습니다.\n" +
            " *\n" +
            " * * 단 이문제는 O(N)으로 풀어야 한다는 추가 조건이 있다.\n" +
            " *\n" +
            " * Input: [1, 2, 3, 4, 5]\n" +
            " * Output: [120, 60, 40, 30, 24]\n" +
            " *\n" +
            " * Input: [5, 3, 4, 2, 6, 8]\n" +
            " * Output: [1152, 1920, 1440, 2880, 960, 720]\n" +
            " *\n" +
            " * 풀이 :\n" +
            " * 두개의 배열을 만드는데\n" +
            " * 앞에서부터 마지막 원소를 제외하고 하나씩 곱한 배열과\n" +
            " * 뒤에서부터 첫번째 원소를 제외하고 하나씩 곱한 배열 두가지를 만든다.\n" +
            " * 예를 들어 [1, 2, 3, 4, 5] 예제인 경우\n" +
            " * 첫번째 배열은 [1(초기값), 1,     1*2, 1*2*3, 1*2*3*4]\n" +
            " * 두번째 배열은 [5*4*3*2, 5*4*3, 5*4, 5,     1(초기값)]\n" +
            " * 이런식으로 계단식으로 어긋나게 배열을 두개 만든 다음 순서대로 곱하면 된다."
    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toIntArray()
    override fun outputToString(output: LongArray) = output.joinToString(separator = ", ")
    override fun inputToString(input: IntArray) = input.joinToString(separator = ", ")
}
