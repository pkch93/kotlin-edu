package edu.pkch.racingcar.application

import edu.pkch.racingcar.domain.MovedPosition
import edu.pkch.racingcar.domain.RacingCar
import edu.pkch.racingcar.domain.RacingCarGame
import edu.pkch.racingcar.domain.RandomMoveDiscriminator

class RacingGamePlayer(
    carCount: Int,
    totalRound: Int
) {
    private val racingCarGame: RacingCarGame

    init {
        val racingCars = (0 until carCount)
            .map { RacingCar() }
            .toList()
        racingCarGame = RacingCarGame(racingCars, totalRound, RandomMoveDiscriminator)
    }

    fun play(): List<List<MovedPosition>> {
        return racingCarGame.play()
    }
}