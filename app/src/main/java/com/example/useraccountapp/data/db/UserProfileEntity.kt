package com.example.useraccountapp.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserProfileTable")
data class UserProfileEntity(
    @PrimaryKey
    val id: Int = 0,

    @ColumnInfo(name = "photo_header")
    val photoHeader: String,

    @ColumnInfo(name = "avatar")
    val avatar: String,

    @ColumnInfo(name = "first_name")
    val firstName: String,

    @ColumnInfo(name = "last_name")
    val lastName: String,

    @ColumnInfo(name = "about")
    val about: String,

    @ColumnInfo(name = "age")
    val age: Int,

    @ColumnInfo(name = "login")
    val login: String,

    @ColumnInfo(name = "password")
    val password: String
)