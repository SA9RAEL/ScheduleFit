package com.example.schedulefit

import android.app.Application
import com.example.schedulefit.di.AppComponent
import com.example.schedulefit.di.DaggerAppComponent

class FitApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().withContext(this).build()
    }
}