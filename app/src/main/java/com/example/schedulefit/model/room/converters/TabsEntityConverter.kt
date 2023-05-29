package com.example.schedulefit.model.room.converters

import androidx.room.TypeConverter
import com.example.schedulefit.model.room.entities.TabEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TabsEntityConverter {
    @TypeConverter
    fun fromListOfTabsEntityToJson(list: List<TabEntity>?): String? = Gson().toJson(list)

    @TypeConverter
    fun fromStringToListOfTabEntity(json: String?): List<TabEntity>? {
        val type = object : TypeToken<List<TabEntity>>() {}.type
        return Gson().fromJson(json, type)
    }
}