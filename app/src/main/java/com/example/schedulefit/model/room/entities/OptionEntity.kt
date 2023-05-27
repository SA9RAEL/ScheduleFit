package com.example.schedulefit.model.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class OptionEntity (
    @PrimaryKey(autoGenerate = true)
    val optionId: Int = 0,
    val clubName: String,
    val linkAndroid: String,
    val linkIos: String,
    val primaryColor: String,
    val secondaryColor: String
)