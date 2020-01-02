package dev.haenara.mailprogramming

import dev.haenara.mailprogramming.usecase.UseCaseFactory

fun main(args: Array<String>) {
    MailProgrammingMain().launchMain(args)
}

class MailProgrammingMain {
    fun launchMain(args: Array<String>) {
        UseCaseFactory().createUsecase(args).execute()
    }
}