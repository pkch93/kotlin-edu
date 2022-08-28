package edu.pkch.racingcar.domain

internal class Position(
    private var value: Int = 0
) {
    internal fun move(canMove: Boolean): MovedPosition {
        canMove.let { if(it) { value += 1 } }
        return MovedPosition(value)
    }
}