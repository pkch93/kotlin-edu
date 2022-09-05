package edu.pkch.racingcar.application

import edu.pkch.racingcar.domain.MovedPosition
import edu.pkch.racingcar.domain.RacingCar
import edu.pkch.racingcar.domain.RacingCarGame
import edu.pkch.racingcar.domain.RandomMoveDiscriminator

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

    fun play(): List<List<MovedPosition>> {
        return racingCarGame.play()
    }
}