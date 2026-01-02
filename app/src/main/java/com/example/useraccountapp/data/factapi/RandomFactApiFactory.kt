package com.example.useraccountapp.data.factapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RandomFactApiFactory {
    private const val BASE_URL: String = "https://uselessfacts.jsph.pl/"

    fun create(): RandomFactApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RandomFactApi::class.java)
    }
}
