package edu.pkch.racingcar.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class PositionTest : StringSpec({

    "위치 이동 여부가 true라면 1 이동시킨다." {
        val racingCar = RacingCar("name")
        val sut = Position(racingCar)

        val actual = sut.move(true)

        actual shouldBe MovedPosition(racingCar.name, 1)
    }

    "위치 이동 여부가 false라면 이동하지 않는다." {
        val racingCar = RacingCar("name")
        val sut = Position(racingCar)

        val actual = sut.move(false)

        actual shouldBe MovedPosition(racingCar.name, 0)
    }
})