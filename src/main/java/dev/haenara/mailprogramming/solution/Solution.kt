package dev.haenara.mailprogramming.solution

interface Solution<in Input, out Output> {
    fun solution(input: Input) : Output
}