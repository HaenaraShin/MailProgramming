package dev.haenara.mailprogramming.solution.y2020.m01.d26

import dev.haenara.mailprogramming.solution.UseCase

class UseCase200126(args: Array<String>) : UseCase<Array<Int>, Int>(args) {
    override val solution = Solution200126()
    override val sampleInput = arrayOf(2, 7, 9, 5, 1, 3, 5)
    override val description = ""

    override fun parseInput(args: Array<String>) = args.map { it.replace(",","").toInt() }.toTypedArray()
    override fun outputToString(output: Int) = "$output"
    override fun inputToString(input: Array<Int>) = input.joinToString(separator = ", ")
}
