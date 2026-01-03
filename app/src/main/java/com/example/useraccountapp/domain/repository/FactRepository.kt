package com.example.useraccountapp.domain.repository

import com.example.useraccountapp.domain.models.Fact

interface FactRepository {
    suspend fun getTodayFact(language: String?): Fact
    suspend fun getRandomFact(language: String?): Fact
}