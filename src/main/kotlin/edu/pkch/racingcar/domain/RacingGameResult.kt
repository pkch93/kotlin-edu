package edu.pkch.racingcar.domain

data class RacingGameResult(
    val roundResults: List<RoundResult>
) {
    fun winner(): List<MovedPosition> {
        val roundResult = roundResults.last()
        val longMovedPosition = roundResult.movedPositions.maxBy { it.value }

        return roundResult.movedPositions
            .filter { it.value == longMovedPosition.value }
            .toList()
    }
}