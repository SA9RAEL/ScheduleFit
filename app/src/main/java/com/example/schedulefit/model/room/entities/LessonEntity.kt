package com.example.schedulefit.model.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LessonEntity (
    @PrimaryKey(autoGenerate = true)
    val lessonId: Int = 0,
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
)
