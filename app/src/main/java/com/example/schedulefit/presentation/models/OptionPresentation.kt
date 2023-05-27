package com.example.schedulefit.presentation.models

import com.example.schedulefit.presentation.ListPresentationModel

data class OptionPresentation(
    override val id: Int,
    val clubName: String,
    val linkAndroid: String,
    val linkIos: String,
    val primaryColor: String,
    val secondaryColor: String
) : ListPresentationModel