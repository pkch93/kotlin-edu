package edu.pkch.racingcar

import edu.pkch.racingcar.application.RacingGamePlayer
import edu.pkch.racingcar.view.inputCars
import edu.pkch.racingcar.view.inputRound
import edu.pkch.racingcar.view.printResult

fun main(args: Array<String>) {
    val carCount = inputCars()
    val totalRounds = inputRound()

    val result = RacingGamePlayer(carCount, totalRounds).play()

    printResult(result)
}