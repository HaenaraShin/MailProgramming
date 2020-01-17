package dev.haenara.mailprogramming.solution

abstract class UseCase<Input, Output>(val args: Array<String>) {
    abstract fun parseInput(args: Array<String>): Input
    abstract fun inputToString(input: Input): String
    abstract fun outputToString(output: Output): String
    abstract val solution: Solution<Input, Output>
    abstract val sampleInput: Input
    abstract val description: String

    fun execute() {
        val input = if (args.isNotEmpty()) {
            parseInput(args)
        } else {
            sampleInput
        }
        val output = outputToString(solution.solution(input))
        println("$description\n")
        println("예제 입력 : ${inputToString(input)}")
        println("예제 출력 : $output")
    }
}