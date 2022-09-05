package edu.pkch.racingcar.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class RacingCarGameTest: StringSpec({
    "자동차 경주 게임을 진행한다." {
        val sut = RacingCarGame(
            listOf(RacingCar("name1"), RacingCar("name2"), RacingCar("name3")),
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
            listOf(MovedPosition("name1", 1), MovedPosition("name2", 0), MovedPosition("name3", 0)),
            listOf(MovedPosition("name1", 2), MovedPosition("name2", 1), MovedPosition("name3", 0)),
            listOf(MovedPosition("name1", 3), MovedPosition("name2", 2), MovedPosition("name3", 1))
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
