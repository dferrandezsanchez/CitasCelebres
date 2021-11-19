package dev.danielferrandez.domain.features.quotes.useCases

import dev.danielferrandez.domain.features.quotes.IQuoteRepository
import dev.danielferrandez.domain.features.quotes.models.Quote

class GetQuoteUseCase(
    private val quoteRepository: IQuoteRepository
) {
    operator fun invoke(): Quote? = quoteRepository.getQuote()
}