package com.example.schedulefit.data.model

import com.example.schedulefit.model.room.entities.OptionEntity
import com.google.gson.annotations.SerializedName

data class OptionResponse(
    @SerializedName("club_name")
    val clubName: String,
    @SerializedName("link_android")
    val linkAndroid: String,
    @SerializedName("link_ios")
    val linkIos: String,
    @SerializedName("primary_color")
    val primaryColor: String,
    @SerializedName("secondary_color")
    val secondaryColor: String
)

fun OptionResponse.map(): OptionEntity {
    return OptionEntity(
        clubName = this.clubName,
        linkAndroid = this.linkAndroid,
        linkIos = this.linkIos,
        primaryColor = this.primaryColor,
        secondaryColor = this.secondaryColor
    )
}