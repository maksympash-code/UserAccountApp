package com.example.useraccountapp.domain.usecases

import com.example.useraccountapp.domain.models.UserProfile
import com.example.useraccountapp.domain.repository.UserProfileRepository

class GetUserProfileUseCase(
    private val repository: UserProfileRepository
) {
    suspend operator fun invoke(): UserProfile = repository.getUserProfile()
}