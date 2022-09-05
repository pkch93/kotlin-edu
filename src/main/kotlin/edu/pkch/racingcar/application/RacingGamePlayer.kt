package edu.pkch.racingcar.application

import edu.pkch.racingcar.domain.*

class RacingGamePlayer(
    carNames: List<String>,
    totalRound: Int
) {
    private val racingCarGame: RacingCarGame

    init {
        val racingCars = carNames
            .map { RacingCar(it) }
            .toList()
        racingCarGame = RacingCarGame(racingCars, totalRound, RandomMoveDiscriminator)
    }

    fun play(): RacingGameResult {
        return racingCarGame.play()
    }
}