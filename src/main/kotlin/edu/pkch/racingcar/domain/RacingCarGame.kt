package edu.pkch.racingcar.domain

class RacingCarGame(
    private val racingCars: List<RacingCar>,
    private val totalRound: Int,
    private val moveDiscriminator: MoveDiscriminator
) {
    fun play(): List<List<MovedPosition>> {
        val result = mutableListOf<List<MovedPosition>>()

        repeat(totalRound) {
            val movedPositions: List<MovedPosition> = racingCars.map {
                    racingCar -> racingCar.move(moveDiscriminator.discriminate())
            }
            result.add(movedPositions)
        }

        return result
    }
}