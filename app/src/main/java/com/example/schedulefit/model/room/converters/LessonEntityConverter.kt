package com.example.schedulefit.model.room.converters

import androidx.room.TypeConverter
import com.example.schedulefit.model.room.entities.LessonEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class LessonEntityConverter {
    @TypeConverter
    fun fromListOfLessonEntityToJson(list: List<LessonEntity>?): String? = Gson().toJson(list)

    @TypeConverter
    fun fromStringToListOfLessonEntity(json: String?): List<LessonEntity>? {
        val type = object : TypeToken<List<LessonEntity>>() {}.type
        return Gson().fromJson(json, type)
    }
}
