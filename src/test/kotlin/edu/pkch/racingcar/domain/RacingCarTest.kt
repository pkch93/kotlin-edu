package edu.pkch.racingcar.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import java.lang.IllegalArgumentException

internal class RacingCarTest: StringSpec({
    "position이 0 미만인 경우 자동차를 생성할 수 없다." {
        shouldThrow<IllegalArgumentException> {
            RacingCar("name", -1)
        }
    }

    "이름이 5자를 넘어서는 경우 자동차를 생성할 수 없다." {
        shouldThrow<IllegalArgumentException> {
            RacingCar("5자초과글자")
        }
    }

    "이름이 비어있는 경우 자동차를 생성할 수 없다." {
        shouldThrow<IllegalArgumentException> {
            RacingCar("")
        }
    }
})
