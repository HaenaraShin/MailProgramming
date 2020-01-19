package dev.haenara.mailprogramming.solution.y2019.m12.d29

import dev.haenara.mailprogramming.solution.UseCase

class UseCase191229(args: Array<String>) : UseCase<Array<Int>, Array<Int>>(args) {
    override val solution = Solution191229()
    override val sampleInput = arrayOf(6, 0, 8, 2, 3, 0, 4, 0, 1)
    override val description = " * 매일프로그래밍 2019. 12. 29\n" +
            " * 정수 배열이 주어졌을 때, 배열 내의 모든 0을 배열의 뒷부분으로 옮기시오.\n" +
            " * 단, 0을 제외한 원소들의 순서는 유지되어야 합니다.\n" +
            " * Input: [6, 0, 8, 2, 3, 0, 4, 0, 1]\n" +
            " * Output: [6, 8, 2, 3, 4, 1, 0, 0, 0]\n" +
            " *\n" +
            " * 풀이 :\n" +
            " * 앞에서부터 0을 제외하고 숫자가 들어갈 자리를 기억해두었다가\n" +
            " * 0이 아닌 다른 숫자가 나오면 그 값에다가 값을 넣어준다.\n" +
            " * 그리고 뒤쪽에 가서 나머지 0을 채워넣을만큼 0이 모이면 나머지는 0을 넣는다.\n" +
            " * 시간복잡도, 공간복잡도 모두 O(n)"
    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Array<Int>) = output.joinToString(separator = ", ")
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
