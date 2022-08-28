package edu.pkch.racingcar.domain

import java.lang.IllegalArgumentException

class RacingCar(
    position: Int = 0
) {
    init {
        if (position < 0) {
            throw IllegalArgumentException("자동차의 위치는 0 미만이 될 수 없습니다.")
        }
    }

    private val position = Position(position)

    internal fun move(canMove: Boolean): MovedPosition {
        return position.move(canMove)
    }
}