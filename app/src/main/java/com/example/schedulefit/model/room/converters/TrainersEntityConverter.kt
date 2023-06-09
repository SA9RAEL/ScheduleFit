package com.example.schedulefit.model.room.converters

import androidx.room.TypeConverter
import com.example.schedulefit.model.room.entities.TrainerEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TrainersEntityConverter {
    @TypeConverter
    fun fromListOfTrainerEntityToJson(list: List<TrainerEntity>?): String? = Gson().toJson(list)

    @TypeConverter
    fun fromStringToListOfTrainerEntity(json: String?): List<TrainerEntity>? {
        val type = object : TypeToken<List<TrainerEntity>>() {}.type
        return Gson().fromJson(json, type)
    }
}