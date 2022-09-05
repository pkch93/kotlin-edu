package edu.pkch.racingcar.domain

import java.lang.IllegalArgumentException

class RacingCar(
    internal val name: String,
    position: Int = 0
) {
    init {
        if (position < 0) {
            throw IllegalArgumentException("자동차의 위치는 0 미만이 될 수 없습니다.")
        }

        if (name.length > 5) {
            throw IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.")
        }

        if (name.isEmpty()) {
            throw IllegalArgumentException("자동차의 이름은 비어있습니다.")
        }
    }

    private val position = Position(this, position)

    internal fun move(canMove: Boolean): MovedPosition {
        return position.move(canMove)
    }
}