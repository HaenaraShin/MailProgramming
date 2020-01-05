package dev.haenara.mailprogramming.usecase

class UseCaseFactory {

    fun createUsecase(args: Array<String>): UseCase<*, *> {
        if (args.isNotEmpty()) {
            when (args[0]) {
                "20190721" -> return UseCase190721(restOfArgs(args))
                "20190728" -> return UseCase190728(restOfArgs(args))
                "20190801" -> return UseCase190801(restOfArgs(args))
                "20190804" -> return UseCase190804(restOfArgs(args))
                "20190811" -> return UseCase190811(restOfArgs(args))
                "20191201" -> return UseCase191201(restOfArgs(args))
                "20191208" -> return UseCase191208(restOfArgs(args))
                "20191215" -> return UseCase191215(restOfArgs(args))
                "20191222" -> return UseCase191222(restOfArgs(args))
                "20191229" -> return UseCase191229(restOfArgs(args))
            }
        }
        throw InvaildProgramArgumentException()
    }

    private fun restOfArgs(args: Array<String>) = args.takeLast(args.size - 1).toTypedArray()
}


class InvaildProgramArgumentException : Exception("Invalid arguments.")