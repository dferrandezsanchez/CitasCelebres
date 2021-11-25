package dev.danielferrandez.data.features.quotes.dataSources

import dev.danielferrandez.data.features.quotes.models.QuoteEntity

class QuotesDataSource(
    private val quotesProvider: QuotesProvider
) {

    fun getQuote(): QuoteEntity? {
        return quotesProvider.getQuote()
    }

}