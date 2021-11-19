package dev.danielferrandez.domain.features.quotes

import dev.danielferrandez.domain.features.quotes.models.Quote

interface IQuoteRepository {
    fun getQuote(): Quote?
}
