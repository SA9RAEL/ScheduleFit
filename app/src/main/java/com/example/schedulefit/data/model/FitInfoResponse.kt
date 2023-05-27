package com.example.schedulefit.data.model

import com.google.gson.annotations.SerializedName

data class FitInfoResponse(
    @SerializedName("lessons")
    val lessons: List<LessonResponse>,
    @SerializedName("option")
    val option: OptionResponse,
    @SerializedName("tabs")
    val tabs: List<TabResponse>,
    @SerializedName("trainers")
    val trainers: List<TrainerResponse>
)