package dev.haenara.mailprogramming.usecase

import dev.haenara.mailprogramming.solution.y2019.aug.Solution190804

class UseCase190804(args: Array<String>) : UseCase<Array<Int>, Array<Int>>(args) {
    override val solution = Solution190804()
    override val sampleInput = arrayOf(0, 1, 2, 2, 0, 0, 0, 1)
    override val description = " * 매일프로그래밍 2019. 08. 04\n" +
            " * 0, 1, 2로 이루어진 배열을 가장 효율적으로 정렬 하시오. 시간복잡도 O(n).\n" +
            " * Given an array consisting of 0, 1 and 2s, sort this array.\n" +
            " * Input: [0, 1, 2, 2, 0, 0, 0, 1]\n" +
            " * Output: [0, 0, 0, 0, 1, 1, 2, 2]\n" +
            " * \n" +
            " * 풀이\n" +
            " * 퀵소트마냥 양쪽에서 진행하면서 0과 2로만 채워진 정렬된 배열을 우선 만든다.\n" +
            " * 즉 좌측피벗이 2를 찾을때까지, 우측피벗이 0을 찾을때까지 진행하면서 정렬 되지 않은 0과 2를 찾으면 바꿔서 정렬하는 식이다.\n" +
            " * 최종적으로 좌측에는 0만, 우측에는 2만 모조리 채워넣고 정렬이 끝난 뒤 1의 갯수만큼 중간에 삽입한다."

    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Array<Int>) = output.joinToString(separator = ", ")
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
