package edu.pkch.racingcar.domain

import kotlin.random.Random

object RandomMoveDiscriminator: MoveDiscriminator {
    override fun discriminate(): Boolean {
        return Random.nextInt(10) >= 4
    }
}