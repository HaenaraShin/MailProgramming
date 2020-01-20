package dev.haenara.mailprogramming.solution.y2019.m12.d29

import dev.haenara.mailprogramming.solution.UseCase

class UseCase200119(args: Array<String>) : UseCase<Array<Int>, Array<Int>>(args) {
    override val solution = Solution200119()
    override val sampleInput = arrayOf(3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4)
    override val description = " * 매일프로그래밍 2020. 01. 19\n" +
            " * 가장 긴 바이토닉 부분 배열 문제(Longest Bitonic Subarray Problem)는 주어진 배열에서 우선 값이 증가했다가\n" +
            " * 그 후 감소하는 원소들의 집합 중 가장 긴 부분 배열을 찾는 문제입니다.\n" +
            " * 배열이 주어졌을 때, 가장 긴 바이토닉 부분 배열을 찾으시오.\n" +
            " * 단, 증가만 하거나 감소만 하는 부분 배열도 답이 될 수 있습니다.\n" +
            " *\n" +
            " * Input: [3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4]\n" +
            " * Output: [4, 5, 9, 10, 8, 5, 3]\n" +
            " *\n" +
            " * Input: [1, 2, 3, 4, 5]\n" +
            " * Output: [1, 2, 3, 4, 5]\n" +
            " *\n" +
            " * Input: [5, 4, 3, 2, 1]\n" +
            " * Output: [5, 4, 3, 2, 1]\n" +
            " * 단 이 문제는 O(N)으로 풀어야 한다.!\n" +
            " *\n" +
            " * 풀이 :\n" +
            " * 변화량을 비교하여 임시 ArrayList에 값을 넣어가며 가장 긴 ArrayList 1개만을 기억하고 있는다.\n" +
            " * 변화량이 같거나 이전변화량과 비교하여 증감하다 감소하는경우는 임시 ArrayList에 추가한다.\n" +
            " * 반대로 감소하다 증가하는 경우에는 이전 마지막값을 포항하여 새로운 ArrayList 만들고 그 안에 넣는다.\n" +
            " * 시행마다 임시 ArrayList가 가장 긴 1개의 ArrayList보다 긴지 비교하여 길다면 업데이트한다."
    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Array<Int>) = output.joinToString(separator = ", ")
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
