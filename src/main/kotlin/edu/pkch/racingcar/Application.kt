package edu.pkch.racingcar

import edu.pkch.racingcar.application.RacingGamePlayer
import edu.pkch.racingcar.view.inputCars
import edu.pkch.racingcar.view.inputRound
import edu.pkch.racingcar.view.printResult

fun main() {
    val carNames = inputCars()
    val totalRounds = inputRound()

    val result = RacingGamePlayer(carNames, totalRounds).play()

    printResult(result)
}