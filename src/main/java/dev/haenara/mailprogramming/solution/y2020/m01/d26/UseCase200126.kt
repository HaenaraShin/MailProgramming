package dev.haenara.mailprogramming.solution.y2020.m01.d26

import dev.haenara.mailprogramming.solution.UseCase

class UseCase200126(args: Array<String>) : UseCase<Array<Int>, Int>(args) {
    override val solution = Solution200126()
    override val sampleInput = arrayOf(2, 7, 9, 5, 1, 3, 5)
    override val description = " * 매일프로그래밍 2020. 01. 26\n" +
            " * 정수 배열이 주어졌을 때, 오른쪽 원소가 왼쪽 원소보다 더 큰 경우 중 두 원소의 차가 최대가 되는 값을 찾으시오.\n" +
            " * Input: [2, 7, 9, 5, 1, 3, 5]\n" +
            " * Output: 7 (원소 2와 9)\n" +
            " *\n" +
            " * 풀이\n" +
            " * 문제의 조건대로 만약 두 원소의 차가 최대가 되는 경우는 둘중의 하나의 원소가 최소값 또는 최대값일 수밖에 없다.\n" +
            " * 따라서 최소값이 나오는 경우와 최댓값이 나오는 경우를 찾아서 차이값을 갱신해나가면서\n" +
            " * 결과적으로 최대 차이값이 결정되는 순간을 찾는다.\n" +
            " * 단 최소값이 좌측에 있어야 하므로, 새로운 최소값이 나오는 경우부터 새로 비교하면 된다."

    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Int) = "$output"
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
