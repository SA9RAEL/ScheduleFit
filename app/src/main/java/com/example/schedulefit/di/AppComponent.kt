package com.example.schedulefit.di

import android.content.Context
import com.example.schedulefit.presentation.ScheduleFragment
import dagger.BindsInstance
import dagger.Component

@Component(modules = [AllModules::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun withContext(context: Context): Builder

        fun build(): AppComponent
    }

    fun inject(fragment: ScheduleFragment)

}