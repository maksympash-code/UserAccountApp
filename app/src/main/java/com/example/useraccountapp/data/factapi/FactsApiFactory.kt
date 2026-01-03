package com.example.useraccountapp.data.factapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object FactsApiFactory {
    private const val BASE_URL: String = "https://uselessfacts.jsph.pl/"

    fun create(): FactsApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FactsApi::class.java)
    }
}
