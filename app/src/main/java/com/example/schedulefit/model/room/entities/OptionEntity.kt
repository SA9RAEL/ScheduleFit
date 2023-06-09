package com.example.schedulefit.model.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schedulefit.presentation.models.OptionPresentation

@Entity
data class OptionEntity (
    @PrimaryKey(autoGenerate = true)
    val optionId: Int = 0,
    val clubName: String,
    val linkAndroid: String,
    val linkIos: String,
    val primaryColor: String,
    val secondaryColor: String
)

fun OptionEntity.map() : OptionPresentation {
    return OptionPresentation(
        id = this.optionId,
        clubName = this.clubName,
        linkAndroid = this.linkAndroid,
        linkIos = this.linkIos,
        primaryColor = this.primaryColor,
        secondaryColor = this.secondaryColor
    )
}