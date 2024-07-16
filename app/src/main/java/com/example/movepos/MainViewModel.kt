package com.example.movepos

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var position: Position by mutableStateOf(Position(12, 14, 15))

    fun onChangePosition() {
        position = position.getChangedPosition(position)
    }
}