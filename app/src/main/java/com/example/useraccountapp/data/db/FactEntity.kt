package com.example.useraccountapp.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FactsTable")
data class FactEntity(

    @PrimaryKey
    @ColumnInfo(name = "type")
    val type: String,

    @ColumnInfo(name = "id")
    val id: String,

    @ColumnInfo(name = "text")
    val text: String,

    @ColumnInfo(name = "source")
    val source: String?,

    @ColumnInfo(name = "source_url")
    val sourceUrl: String?,

    @ColumnInfo(name = "language")
    val language: String?,

    @ColumnInfo(name = "permalink")
    val permalink: String,

    @ColumnInfo(name = "fetched_at")
    val fetchedAt: Long,
)