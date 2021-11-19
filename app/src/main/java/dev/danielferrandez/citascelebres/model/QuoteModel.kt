package dev.danielferrandez.citascelebres.model

import dev.danielferrandez.domain.features.quotes.models.Quote

data class QuoteModel(
    val quote: String,
    val author: String
)

fun Quote.transform(): QuoteModel = QuoteModel(quote, author)
