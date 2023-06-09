package com.example.schedulefit.model.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schedulefit.presentation.models.TabPresentation

@Entity
data class TabEntity(
    @PrimaryKey(autoGenerate = false)
    val tabId: Int,
    val tabName: String
)

fun TabEntity.map() : TabPresentation {
    return TabPresentation(
        id = this.tabId,
        tabName = this.tabName
    )
}
