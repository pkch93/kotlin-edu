package edu.pkch.racingcar.view

import edu.pkch.racingcar.domain.MovedPosition

fun printResult(result: List<List<MovedPosition>>) {
    println("실행 결과")

    result.forEach {
        it.forEach {
            movedPosition ->  println(movedPosition)
        }
        println()
    }
}