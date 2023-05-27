package com.example.schedulefit.di

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.example.schedulefit.model.room.ScheduleDatabase
import com.example.schedulefit.network.ScheduleApiService
import com.example.schedulefit.presentation.viewmodel.ScheduleViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.multibindings.IntoMap
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

const val BASE_URL = "https://olimpia.fitnesskit-admin.ru/"

@Module
abstract class AllModules {

    companion object {
        @Provides
        @Reusable
        fun httpLoggingInterceptor() = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        @Provides
        @Reusable
        fun provideHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
            return OkHttpClient.Builder()
                .addInterceptor(
                    httpLoggingInterceptor
                )
                .build()
        }

        @Provides
        @Reusable
        fun provideRetrofit(httpClient: OkHttpClient): ScheduleApiService = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(
                httpClient
            )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ScheduleApiService::class.java)

        @Singleton
        @Provides
        fun provideDb(context: Context): ScheduleDatabase =
            Room.databaseBuilder(context, ScheduleDatabase::class.java, ScheduleDatabase.DB_NAME)
                .build()
    }

    @Binds
    @[IntoMap ViewModelKey(ScheduleViewModel::class)]
    abstract fun bindScheduleViewModel(viewModel: ScheduleViewModel): ViewModel
}