package edu.pkch.racingcar.domain

class RacingCarGame(
    private val racingCars: List<RacingCar>,
    private val totalRound: Int,
    private val moveDiscriminator: MoveDiscriminator
) {
    fun play(): RacingGameResult {
        val roundResults = mutableListOf<RoundResult>()

        repeat(totalRound) {
            val movedPositions = racingCars
                .map { racingCar -> racingCar.move(moveDiscriminator.discriminate()) }
                .toList()
            roundResults.add(RoundResult(movedPositions))
        }

        return RacingGameResult(roundResults)
    }
}