package com.example.schedulefit.model.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schedulefit.presentation.models.TrainerPresentation

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

fun TrainerEntity.map(): TrainerPresentation {
    return TrainerPresentation(
        id = this.trainerId,
        trainerDescription = this.trainerDescription,
        fullName = this.fullName,
        imageUrl = this.imageUrl,
        imageUrlMedium = this.imageUrlMedium,
        imageUrlSmall = this.imageUrlSmall,
        lastName = this.lastName,
        trainerName = this.trainerName,
        position = this.position
    )
}
