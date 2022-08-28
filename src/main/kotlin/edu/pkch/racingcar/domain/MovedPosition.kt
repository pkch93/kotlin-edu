package edu.pkch.racingcar.domain

data class MovedPosition(
    val value: Int
) {
    override fun toString(): String {
        return (0 until value).joinToString("") { "-" }
    }
}
