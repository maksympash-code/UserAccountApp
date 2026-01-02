package com.example.useraccountapp.data.factapi

import retrofit2.http.GET


interface RandomFactApi {
    @GET("api/v2/facts/random")
    suspend fun getRandomFact(): FactDto
}