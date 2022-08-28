package edu.pkch.racingcar.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class RacingCarGameTest: StringSpec({
    "자동차 경주 게임을 진행한다." {
        val sut = RacingCarGame(
            listOf(RacingCar(), RacingCar(), RacingCar()),
            3,
            StaticMoveDiscriminator(
                listOf(
                    true, false, false,
                    true, true, false,
                    true, true, true
                )
            )
        )

        val actual = sut.play()

        actual shouldBe listOf(
            listOf(MovedPosition(1), MovedPosition(0), MovedPosition(0)),
            listOf(MovedPosition(2), MovedPosition(1), MovedPosition(0)),
            listOf(MovedPosition(3), MovedPosition(2), MovedPosition(1))
        )
    }
}) {
    private class StaticMoveDiscriminator(
        val staticValues: List<Boolean>,
    ): MoveDiscriminator {
        var current = 0

        override fun discriminate(): Boolean {
            return staticValues[current++]
        }
    }
}
