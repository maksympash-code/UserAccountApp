package com.example.useraccountapp.data.factapi

import com.example.useraccountapp.domain.models.Fact

fun FactDto.toDomainFact(): Fact = Fact (
    id = id ?: "",
    text = text ?: "",
    source = source,
    sourceUrl = sourceUrl,
    language = language,
    permalink = permalink ?: "",
)