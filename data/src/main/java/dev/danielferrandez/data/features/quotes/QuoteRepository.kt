package dev.danielferrandez.data.features.quotes

import dev.danielferrandez.data.features.quotes.dataSources.QuotesDataSource
import dev.danielferrandez.data.features.quotes.models.transform
import dev.danielferrandez.domain.features.quotes.IQuoteRepository
import dev.danielferrandez.domain.features.quotes.models.Quote

class QuoteRepository(
    private val quotesDataSource: QuotesDataSource
) : IQuoteRepository {
    override fun getQuote(): Quote? =
        quotesDataSource.getQuote()?.transform()
}