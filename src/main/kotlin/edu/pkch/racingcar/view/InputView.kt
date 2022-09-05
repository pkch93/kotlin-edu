package edu.pkch.racingcar.view

fun inputCars(): List<String> {
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표를 기준으로 구분)")
    return try {
        readLine()!!.split(",")
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
                inputRound()
            }
            else -> throw e
        }
    }
}
