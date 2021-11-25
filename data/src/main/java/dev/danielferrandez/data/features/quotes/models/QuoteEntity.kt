package dev.danielferrandez.data.features.quotes.models

import dev.danielferrandez.domain.features.quotes.models.Quote

data class QuoteEntity(
    val quote: String,
    val author: String
) {
    fun transform(): Quote = Quote(quote, author)
}
