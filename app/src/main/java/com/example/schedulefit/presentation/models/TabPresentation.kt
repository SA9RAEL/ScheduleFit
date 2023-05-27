package com.example.schedulefit.presentation.models

import com.example.schedulefit.presentation.ListPresentationModel

data class TabPresentation(
    override val id: Int,
    val tabName: String
) : ListPresentationModel