package dev.haenara.mailprogramming.solution.y2019.m08.d01

import dev.haenara.mailprogramming.solution.UseCase
import dev.haenara.mailprogramming.solution.y2019.m08.d01.Solution190801

class UseCase190801(args: Array<String>) : UseCase<String, String>(args) {
    override val solution = Solution190801()
    override val sampleInput = "banana"
    override val description = " * 매일프로그래밍 2019. 08. 01 (페이스북 추가문제)\n" +
            " * 주어진 문자 배열의 모든 \"A\"를 \".\"으로 바꾸시오\n" +
            " * Input: \"banana\"\n" +
            " * Output: \"b.n.n.\"\n" +
            " * Input: \"aaa\"\n" +
            " * Output: \"...\"\n" +
            " *\n" +
            " * 풀이\n" +
            " * 알파벳을 전부 매핑 char배열에 넣어놓고 a와 A만 . 값을 넣어둔다음 그냥 문자열을 매핑 배열의 값을 참조한다.\n" +
            " * 굳이 이렇게 푸는 이유는 비교하는 로직을 빼서 성능을 최대한 끌어올리기 위해서다."

    override fun parseInput(args: Array<String>) = args[0]
    override fun inputToString(input: String) = input
    override fun outputToString(output: String) = output
}
