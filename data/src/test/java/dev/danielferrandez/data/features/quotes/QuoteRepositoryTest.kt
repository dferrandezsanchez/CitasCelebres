package dev.danielferrandez.data.features.quotes

import dev.danielferrandez.data.features.quotes.dataSources.QuotesDataSource
import dev.danielferrandez.data.features.quotes.models.QuoteEntity
import dev.danielferrandez.domain.features.quotes.models.Quote
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkClass
import io.mockk.verify
import org.junit.jupiter.api.Test

class QuoteRepositoryTest {


    private val quotesDataSource = mockkClass(QuotesDataSource::class)
    private val quoteRepository = QuoteRepository(quotesDataSource)

    private val mockedQuote = mockk<Quote>()
    private val mockedQuoteEntity = mockkClass(QuoteEntity::class) {
        every { transform() } returns mockedQuote
    }

    @Test
    fun `On invoke getQuote from QuoteRepository should return Quote`() {
        every { quotesDataSource.getQuote() } returns mockedQuoteEntity
        val result = quoteRepository.getQuote()
        verify { mockedQuoteEntity.transform() }
        assert(result is Quote)
    }

    @Test
    fun `On invoke getQuote from QuoteRepository should return null`() {
        every { quotesDataSource.getQuote() } returns null
        val result = quoteRepository.getQuote()
        verify(exactly = 0) { mockedQuoteEntity.transform() }
        assert(result == null)
    }

}