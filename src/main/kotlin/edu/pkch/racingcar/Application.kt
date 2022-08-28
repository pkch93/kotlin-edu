package edu.pkch.racingcar

import edu.pkch.racingcar.domain.RacingCar
import edu.pkch.racingcar.domain.RacingCarGame
import edu.pkch.racingcar.domain.RandomMoveDiscriminator
import edu.pkch.racingcar.view.inputCars
import edu.pkch.racingcar.view.inputRound
import edu.pkch.racingcar.view.printResult

fun main(args: Array<String>) {
    val carCount = inputCars()
    val totalRounds = inputRound()
    val racingCars = (0 until carCount)
        .map { RacingCar() }
        .toList()

    val racingCarGame = RacingCarGame(racingCars, totalRounds, RandomMoveDiscriminator)
    val result = racingCarGame.play()

    printResult(result)
}