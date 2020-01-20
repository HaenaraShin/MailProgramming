package dev.haenara.mailprogramming.solution

import dev.haenara.mailprogramming.solution.y2019.m07.d21.UseCase190721
import dev.haenara.mailprogramming.solution.y2019.m07.d28.UseCase190728
import dev.haenara.mailprogramming.solution.y2019.m08.d01.UseCase190801
import dev.haenara.mailprogramming.solution.y2019.m08.d04.UseCase190804
import dev.haenara.mailprogramming.solution.y2019.m08.d11.UseCase190811
import dev.haenara.mailprogramming.solution.y2019.m12.d01.UseCase191201
import dev.haenara.mailprogramming.solution.y2019.m12.d08.UseCase191208
import dev.haenara.mailprogramming.solution.y2019.m12.d15.UseCase191215
import dev.haenara.mailprogramming.solution.y2019.m12.d22.UseCase191222
import dev.haenara.mailprogramming.solution.y2019.m12.d29.UseCase191229
import dev.haenara.mailprogramming.solution.y2019.m12.d29.UseCase200119
import dev.haenara.mailprogramming.solution.y2020.m01.d06.UseCase200106
import dev.haenara.mailprogramming.solution.y2020.m01.d12.UseCase200112

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
                "20200106" -> return UseCase200106(restOfArgs(args))
                "20200112" -> return UseCase200112(restOfArgs(args))
                "20200119" -> return UseCase200119(restOfArgs(args))
            }
        }
        throw InvaildProgramArgumentException()
    }

    private fun restOfArgs(args: Array<String>) = args.takeLast(args.size - 1).toTypedArray()
}


class InvaildProgramArgumentException : Exception("Invalid arguments.")