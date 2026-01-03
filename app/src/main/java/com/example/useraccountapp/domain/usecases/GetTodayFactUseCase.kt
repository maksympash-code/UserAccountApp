package com.example.useraccountapp.domain.usecases

import com.example.useraccountapp.domain.models.Fact
import com.example.useraccountapp.domain.repository.FactRepository
import org.intellij.lang.annotations.Language

class GetTodayFactUseCase(
    private val repository: FactRepository
) {
    suspend fun invoke(language: String): Fact = repository.getTodayFact(language)
}