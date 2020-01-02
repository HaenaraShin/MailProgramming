package dev.haenara.mailprogramming.usecase

import dev.haenara.mailprogramming.solution.y2019.aug.Solution190811

class UseCase190811(args: Array<String>) : UseCase<Pair<String, String>, String>(args) {
    override val solution = Solution190811()
    override val sampleInput = Pair("", "")
    override val description = "* 연결 리스트로 표현된 두 정수 A 와 B 가 있습니다. A 와 B 를 더한 결과를 연결 리스트로 리턴하시오.\n" +
            " * Given two integers represented as linked lists, return a linked list that is a sum of the two given linked lists.\n" +
            " *\n" +
            " * Input: 1->2->3, 1->2->3 // 321 + 321\n" +
            " * Output: 2->4->6 // 642\n" +
            " *\n" +
            " * Input: 1->5->6, 0->0->4 // 651 + 400\n" +
            " * Output: 1->5->0->1 // 1051\n" +
            " *\n" +
            " * 풀이\n" +
            " * 링크드리스트를 사용하는 대신 배열로 풀었으나, 순차적으로 더해나가므로 어느쪽이든 상관 없다.\n" +
            " * N자리수의 자연수 합이므로 A1->A2->... , B1->B2->... 을 더하는 경우\n" +
            " * An+Bn+(n-1)항의 받아올림(carrier) 으로 표현가능하다.\n" +
            " * 따라서 이전 carrier만 기억하고 있다면 A와B와 덧셈없이 3차 배열로 값을 구할 수 있다."

    override fun parseInput(args: Array<String>): Pair<String, String> {
        return if (args.isEmpty()) {
            throw InvaildProgramArgumentException()
        } else if (args[0].trim().endsWith(",")){
            Pair(args[0].substringBefore(","), args[1])
        } else if (args.size == 1 && args[0].contains(",")){
            args[0].split(",").let{
                Pair(it[0], it[1])
            }
        } else if (args.size > 1 && args[0].contains(",").not()){
            Pair(args[0], args[1])
        } else {
            throw InvaildProgramArgumentException()
        }
    }

    override fun inputToString(input: Pair<String, String>) = "${input.first} , ${input.second}"
    override fun outputToString(output: String) = output
}
