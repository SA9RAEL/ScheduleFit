package com.example.schedulefit.presentation.models

import com.example.schedulefit.presentation.ListPresentationModel

data class TrainerPresentation(
    override val id: Int,
    val trainerDescription: String,
    val fullName: String,
    val imageUrl: String,
    val imageUrlMedium: String,
    val imageUrlSmall: String,
    val lastName: String,
    val trainerName: String,
    val position: String
) : ListPresentationModel