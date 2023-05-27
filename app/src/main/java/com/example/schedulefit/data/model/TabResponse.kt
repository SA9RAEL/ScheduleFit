package com.example.schedulefit.data.model

import com.example.schedulefit.model.room.entities.TabEntity
import com.google.gson.annotations.SerializedName

data class TabResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)

fun TabResponse.map(): TabEntity {
    return TabEntity(
        tabId = this.id,
        tabName = this.name
    )
}