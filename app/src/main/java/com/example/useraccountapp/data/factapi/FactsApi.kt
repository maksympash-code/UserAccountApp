package com.example.useraccountapp.data.factapi

import retrofit2.http.GET
import retrofit2.http.Query


interface FactsApi {
    @GET("api/v2/facts/random")
    suspend fun getRandomFact(
        @Query("language") language: String? = null
    ): FactDto

    @GET("api/v2/facts/today")
    suspend fun getTodayFact(
        @Query("language") language: String? = null
    ): FactDto
}