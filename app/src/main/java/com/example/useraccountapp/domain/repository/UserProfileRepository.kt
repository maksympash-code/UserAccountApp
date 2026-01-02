package com.example.useraccountapp.domain.repository

import com.example.useraccountapp.domain.models.UserProfile

interface UserProfileRepository {
    suspend fun getUserProfile(): UserProfile
}