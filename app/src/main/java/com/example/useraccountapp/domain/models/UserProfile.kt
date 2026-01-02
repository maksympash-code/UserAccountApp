package com.example.useraccountapp.domain.models

data class UserProfile(
    val photo_header: String,
    val avatar: String,
    val first_name: String,
    val last_name: String,
    val about: String,
    val age: Int,
    val login: String,
    val password: String
) {
    val fullName: String get() = "$first_name $last_name"
}