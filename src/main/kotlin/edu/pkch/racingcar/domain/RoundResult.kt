package edu.pkch.racingcar.domain

data class RoundResult(
    val movedPositions: List<MovedPosition>
) {
    override fun toString(): String {
        return movedPositions.joinToString("\n") { it.toString() }
    }
}