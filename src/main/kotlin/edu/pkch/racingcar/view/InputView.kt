package edu.pkch.racingcar.view

fun inputCars(): Int {
    println("자동차 대수는 몇 대 인가요?")
    return try {
        readLine()!!.toInt()
    } catch(e: Exception) {
        when (e) {
            is NumberFormatException, is NullPointerException -> {
                println("입력 형식이 잘못되었습니다. 숫자로 입력해주세요.")
                inputCars()
            }
            else -> throw e
        }
    }
}

fun inputRound(): Int {
    println("시도할 회수는 몇 회 인가요?")
    return try {
        readLine()!!.toInt()
    } catch(e: Exception) {
        when (e) {
            is NumberFormatException, is NullPointerException -> {
                println("입력 형식이 잘못되었습니다. 숫자로 입력해주세요.")
                inputCars()
            }
            else -> throw e
        }
    }
}
