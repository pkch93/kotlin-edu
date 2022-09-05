package edu.pkch.racingcar.view

import edu.pkch.racingcar.domain.RacingGameResult

fun printResult(result: RacingGameResult) {
    println("실행 결과")

    result.roundResults.forEach {
        println(it)
        println()
    }
    println("${result.winner().joinToString(", ") { it.name }}이(가) 최종 우승했습니다.")
}