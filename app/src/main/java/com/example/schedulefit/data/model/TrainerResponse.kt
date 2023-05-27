package com.example.schedulefit.data.model

import com.example.schedulefit.model.room.entities.TrainerEntity
import com.google.gson.annotations.SerializedName

data class TrainerResponse(
    @SerializedName("description")
    val description: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("image_url_medium")
    val imageUrlMedium: String,
    @SerializedName("image_url_small")
    val imageUrlSmall: String,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("position")
    val position: String
)

fun TrainerResponse.map(): TrainerEntity {
    return TrainerEntity(
        trainerDescription = this.description,
        fullName = this.fullName,
        trainerId = this.id.toInt(),
        imageUrl = this.imageUrl,
        imageUrlMedium = this.imageUrlMedium,
        imageUrlSmall = this.imageUrlSmall,
        lastName = this.lastName,
        trainerName = this.name,
        position = this.position
    )
}