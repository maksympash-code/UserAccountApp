package com.example.useraccountapp.domain.repository

import com.example.useraccountapp.domain.models.Fact

interface FactRepository {
    fun getFactByKeyword(keyword: String): Fact
    fun getRandomFact(): Fact
}