package dev.haenara.mailprogramming.solution.y2019.m12.d08

import Solution191208
import dev.haenara.mailprogramming.solution.UseCase

class UseCase191208(args: Array<String>) : UseCase<Long, Long>(args) {
    override val solution = Solution191208()
    override val sampleInput = 12L
    override val description = " * 매일프로그래밍 2019. 12. 08\n" +
            " * 피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다.\n" +
            " * 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.\n" +
            " * Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers.\n" +
            " * Given an integer N, find the sum of all even fibonacci numbers.\n" +
            " *\n" +
            " * Input: N = 12\n" +
            " * Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.\n" +
            " *\n" +
            " * 풀이 :\n" +
            " * 재귀로 풀수도 있으나, 성능을 고려하여 반복문을 이용하여 풀었다.\n" +
            " * 피보나치 수열의 합이 주어진 수보다 작은지 확인하여 짝수면 누적한다."

    override fun parseInput(args: Array<String>) = args[0].toLong()
    override fun outputToString(output: Long) = "$output"
    override fun inputToString(input: Long) = "$input"
}
