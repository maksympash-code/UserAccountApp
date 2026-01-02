package com.example.useraccountapp.data.profileapi


import com.google.gson.annotations.SerializedName

data class UserProfileDto(
    @SerializedName("about")
    val about: String?,
    @SerializedName("age")
    val age: Int?,
    @SerializedName("avatar")
    val avatar: String?,
    @SerializedName("first_name")
    val firstName: String?,
    @SerializedName("last_name")
    val lastName: String?,
    @SerializedName("login")
    val login: String?,
    @SerializedName("password")
    val password: String?,
    @SerializedName("photo_header")
    val photoHeader: String?
)