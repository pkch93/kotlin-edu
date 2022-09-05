package edu.pkch.racingcar.domain

data class MovedPosition(
    val name: String,
    val value: Int
) {
    override fun toString(): String {
        val position = (0 until value).joinToString("") { "-" }
        return "${name}: $position"
    }
}
