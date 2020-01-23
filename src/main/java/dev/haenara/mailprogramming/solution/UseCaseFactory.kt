package dev.haenara.mailprogramming.solution

import java.lang.reflect.Constructor

class UseCaseFactory {

    fun createUsecase(args: Array<String>): UseCase<*, *> {
        if (args.isNotEmpty()) {
            return create(args[0], restOfArgs(args))
        }
        throw InvaildProgramArgumentException()
    }

    private fun restOfArgs(args: Array<String>) = args.takeLast(args.size - 1).toTypedArray()

    val PACKAGE = "dev.haenara.mailprogramming.solution"
    private fun create(date : String, parameter: Array<String>) : UseCase<*, *> {
        return try {
            createEntity(
                Class.forName("${getPackageName(date)}.UseCase${date.substring(2)}").constructors[0], parameter
            ) as UseCase<*, *>
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
            throw InvaildProgramArgumentException()
        }
    }

    private fun getPackageName(date: String) : String {
        return "${PACKAGE}.y${date.substring(0,4)}.m${date.substring(4,6)}.d${date.substring(6,8)}"
    }
    private fun <T> createEntity(constructor: Constructor<T>, parameter: Array<String>) : T {
        return constructor.newInstance(parameter)
    }

}


class InvaildProgramArgumentException : Exception("Invalid arguments.")