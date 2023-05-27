package com.example.schedulefit.model.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TabEntity(
    @PrimaryKey(autoGenerate = false)
    val tabId: Int,
    val tabName: String
)
