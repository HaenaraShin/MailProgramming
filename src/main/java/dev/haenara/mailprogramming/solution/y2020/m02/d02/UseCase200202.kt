package dev.haenara.mailprogramming.solution.y2020.m02.d02

import dev.haenara.mailprogramming.solution.UseCase

class UseCase200202(args: Array<String>) : UseCase<Array<Int>, Int>(args) {
    override val solution = Solution200202()
    override val sampleInput = arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, -4)
    override val description = " * 매일프로그래밍 2020. 02. 02\n" +
            " * 정수 배열이 주어졌을 때, 합이 최대가 되는 부분 배열의 합을 구하시오.\n" +
            " * 단, 부분 배열의 원소들은 연속된 원소들로 구성되어야 합니다.\n" +
            " *\n" +
            " * Input: [-2, 1, -3, 4, -1, 2, 1, -5, -4]\n" +
            " * Output: 6 (부분 배열은 [4, -1, 2, 1])\n" +
            "\n" +
            " * Input: [-8, -3, -6, -2, -5, -4]\n" +
            " * Output: -2 (부분 배열은 [-2])\n" +
            " *\n" +
            " * 풀이\n" +
            " * 연속된 양수끼리와 연속된 음수끼리 합쳐서 합계끼리 비교해나가며 계산해나간다.\n" +
            " * 따라서 연속되는 양수 또는 음수가 나올 땐 누적하여 합산하고\n" +
            " * 양수 또는 음수가 연속되지 않고 부호가 바뀐 경우에 이전까지 누적된 합계를 비교해나가는 식으로 계산한다.\n" +
            " * 연속으로 양수가 나오다가 음수가 나올 때 이전까지의 양수 합계를 가지고 이전까지의 가장 큰 양수의 합보다 큰지 비교한다.\n" +
            " * 양수의 합이 다음에 나오는 음수의 합보다 더 크다면 이후에 나오는 양수와 무조건 합치는 쪽이 더 크기 때문에\n" +
            " * 양수의 합과 음수의 합을 합쳐서 약간 작은 양수로써 이후에 나오는 양수의 합에 더해지도록 한다.\n" +
            " * 양수의 합보다 다음에 나오는 음수의 합이 더 크다면 이후에 양수가 나오더라도 영향이 없기 때문에\n" +
            " * 그 때를 기준으로 가장 큰 양수의 합인지 비교만 하고 새로운 양수의 합계를 더한다.\n" +
            " * 예외적으로 0이 나올때는 무시하고, 음수만 나올 때는 개별로 최대값인지 비교한다."
    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Int) = "$output"
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
