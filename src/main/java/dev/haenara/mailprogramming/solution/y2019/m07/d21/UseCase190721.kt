package dev.haenara.mailprogramming.solution.y2019.m07.d21

import dev.haenara.mailprogramming.solution.UseCase

class UseCase190721(args: Array<String>) : UseCase<Int, Array<String>>(args) {
    override val solution = Solution190721()
    override val sampleInput = 5
    override val description = " * 매일프로그래밍 2019. 07. 21\n" +
            " * 양수 K가 주어지면 K 길이의 이진법 숫자를 모두 프린트하시오. 단, 연속으로 1이 있으면 안됩니다.\n" +
            " * Given an integer K, print all binary strings of length K without consecutive 1s.\n" +
            " * Input:5\n" +
            " * output: 00000 00001 00010 00100 00101 01000 01001 01010 10000 10001 10010 10100 10101\n" +
            " *\n" +
            " * 풀이\n" +
            " * divide-and-conquer 알고리즘으로, 이전 숫자가 1인지 아닌지에 따라 나누어서 재귀적 호출을 하고 최종적으로 병합한다.\n" +
            " * 이전 자리수가 1일 경우 1은 연속으로 나오면 안되기 때문에 다음자리수는 0으로 고정한다.\n" +
            " * 이전 자리수가 0일 경우 0, 1 모두 나올 수 있기 때문에 2개의 경우의 수로 쪼개어 재귀호출한 뒤 병합한다. "

    override fun parseInput(args: Array<String>)= args[0].toInt()
    override fun inputToString(input: Int): String = "$input"
    override fun outputToString(output: Array<String>) = output.joinToString(separator = ", ")

}
