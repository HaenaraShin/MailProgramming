package dev.haenara.mailprogramming.usecase

import Solution200106

class UseCase200106(args: Array<String>) : UseCase<Array<Pair<Int, Int>>, Array<Pair<Int, Int>>>(args) {
    override val solution = Solution200106()
    override val sampleInput = arrayOf(Pair(2,4), Pair(1,5), Pair(7,9))
    override val description = ""
    override fun parseInput(args: Array<String>) = TODO()
    override fun inputToString(input: Array<Pair<Int, Int>>) = input.joinToString(separator = ", ")
    override fun outputToString(output: Array<Pair<Int, Int>>) = output.joinToString(separator = ", ")
}
