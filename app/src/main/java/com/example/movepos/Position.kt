package com.example.movepos

data class Position(
    val x: Int,
    val y: Int,
    val z: Int,
) {
    fun getChangedPosition(position: Position): Position {
        return Position(
            x = position.x + 5,
            y = position.y + 5,
            z = position.z + 5,
        )
    }
}