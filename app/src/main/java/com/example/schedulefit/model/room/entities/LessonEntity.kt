package com.example.schedulefit.model.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schedulefit.presentation.models.LessonPresentation

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

fun LessonEntity.map(): LessonPresentation {
    return LessonPresentation(
        id = this.lessonId,
        appointmentId = this.appointmentId,
        availableSlots = this.availableSlots,
        clientRecorded = this.clientRecorded,
        coachId = this.coachId,
        color = this.color,
        commercial = this.commercial,
        date = this.date,
        lessonDescription = this.lessonDescription,
        endTime = this.endTime,
        isCancelled = this.isCancelled,
        lessonName = this.lessonName,
        place = this.place,
        serviceId = this.serviceId,
        startTime = this.startTime,
        tab = this.tab,
        lessonTabId = this.lessonTabId
    )
}