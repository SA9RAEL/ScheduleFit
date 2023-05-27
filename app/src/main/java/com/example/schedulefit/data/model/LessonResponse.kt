package com.example.schedulefit.data.model

import com.example.schedulefit.model.room.entities.LessonEntity
import com.google.gson.annotations.SerializedName

data class LessonResponse(
    @SerializedName("appointment_id")
    val appointmentId: String,
    @SerializedName("available_slots")
    val availableSlots: Int,
    @SerializedName("client_recorded")
    val clientRecorded: Boolean,
    @SerializedName("coach_id")
    val coachId: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("commercial")
    val commercial: Boolean,
    @SerializedName("date")
    val date: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("endTime")
    val endTime: String,
    @SerializedName("is_cancelled")
    val isCancelled: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("place")
    val place: String,
    @SerializedName("service_id")
    val serviceId: String,
    @SerializedName("startTime")
    val startTime: String,
    @SerializedName("tab")
    val tab: String,
    @SerializedName("tab_id")
    val tabId: Int
)

fun LessonResponse.map(): LessonEntity {
    return LessonEntity(
        appointmentId = this.appointmentId,
        availableSlots = this.availableSlots,
        clientRecorded = this.clientRecorded,
        coachId = this.coachId,
        color = this.color,
        commercial = this.commercial,
        date = this.date,
        lessonDescription = this.description,
        endTime = this.endTime,
        isCancelled = this.isCancelled,
        lessonName = this.name,
        place = this.place,
        serviceId = this.serviceId,
        startTime = this.startTime,
        tab = this.tab,
        lessonTabId = this.tabId
    )
}