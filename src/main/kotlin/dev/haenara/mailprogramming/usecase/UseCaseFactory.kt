package dev.haenara.mailprogramming.usecase

class UseCaseFactory {

    fun createUsecase(args: Array<String>): UseCase<*, *> {
        if (args.isNotEmpty()) {
            when (args[0]) {
                "20191201" -> return UseCase191201(restOfArgs(args))
                "20191208" -> return UseCase191208(restOfArgs(args))
            }
        }
        throw InvaildProgramArgumentException()
    }

    private fun restOfArgs(args: Array<String>) = args.takeLast(args.size - 1).toTypedArray()
}


class InvaildProgramArgumentException : Exception("Invalid arguments.")