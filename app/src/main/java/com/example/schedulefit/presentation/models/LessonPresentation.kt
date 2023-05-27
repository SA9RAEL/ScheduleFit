package com.example.schedulefit.presentation.models

import com.example.schedulefit.presentation.ListPresentationModel

data class LessonPresentation(
    override val id: Int,
    val appointmentId: String,
    val availableSlots: Int,
    val clientRecorded: Boolean,
    val coachId: String,
    val color: String,
    val commercial: Boolean,
    val date: String,
    val lessonDescription: String,
    val endTime: String,
    val isCancelled: Boolean,
    val lessonName: String,
    val place: String,
    val serviceId: String,
    val startTime: String,
    val tab: String,
    val lessonTabId: Int
) : ListPresentationModel