package dev.haenara.mailprogramming.usecase

import dev.haenara.mailprogramming.solution.y2019.jul.Solution190728

class UseCase190728(args: Array<String>) : UseCase<String, ArrayList<String>>(args) {
    override val solution = Solution190728()
    override val sampleInput = "ABC"
    override val description = " * 매일프로그래밍 2019. 07. 28\n" +
            " * 문자배열이 주어지면, 주어진 문자로 만들수 있는 모든 문자배열 조합을 프린트 하시오.\n" +
            " * Given a string, print all permutations of characters in the string.\n" +
            " * input: ABC\n" +
            " * output: ABC ACB BAC BCA CBA CAB\n" +
            " *\n" +
            " * 풀이\n" +
            " * divide-and-conquer 알고리즘으로 재귀적으로 경우의수를 만들어 나간다.\n" +
            " * 매 시행마다 문자열 중에 한글자씩 뽑아서 앞의 문자열로 만든 뒤 나머지 문자열을 인자로 들고가서\n" +
            " * 최종적으로 앞의 문자열(parent)와 나머지 문자열(substring)을 조합하여 경우의 수를 하나씩 재귀적으로 만든다.\n" +
            " * 단 AAA와 같이 중복된 글자가 안에 들어있을 경우, 중복된 글자는 경우의수를 나누어서는 안되기 때문에\n" +
            " * 매 시행마다 모든 글자를 뽑아내는 것이 아닌, 중복을 제거한 경우의 수 중에서 뽑아내고 문자열로 구성한다."

    override fun parseInput(args: Array<String>)= args[0]
    override fun inputToString(input: String) = input
    override fun outputToString(output: ArrayList<String>) = output.joinToString(separator = " ")
}
