package com.example.schedulefit.model.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TrainerEntity(
    @PrimaryKey(autoGenerate = true)
    val trainerId: Int = 0,
    val trainerDescription: String,
    val fullName: String,
    val imageUrl: String,
    val imageUrlMedium: String,
    val imageUrlSmall: String,
    val lastName: String,
    val trainerName: String,
    val position: String
)
