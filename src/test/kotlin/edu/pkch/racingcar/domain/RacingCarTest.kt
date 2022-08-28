package edu.pkch.racingcar.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import java.lang.IllegalArgumentException

internal class RacingCarTest: StringSpec({
    "position이 0 미만인 경우 자동차를 생성할 수 없다." {
        shouldThrow<IllegalArgumentException> {
            RacingCar(-1)
        }
    }
})
