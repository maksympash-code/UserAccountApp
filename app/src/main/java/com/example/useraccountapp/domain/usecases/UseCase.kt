package com.example.useraccountapp.domain.usecases

data class UseCase(
    val login: LoginUseCase,
    val getUserProfile: GetUserProfileUseCase,
    val getTodayFact: GetTodayFactUseCase,
    val getRandomFact: GetRandomFactUseCase,
)
