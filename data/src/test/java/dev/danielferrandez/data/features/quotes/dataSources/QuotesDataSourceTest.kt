package dev.danielferrandez.data.features.quotes.dataSources

import dev.danielferrandez.data.features.quotes.models.QuoteEntity
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkClass
import io.mockk.verify
import org.junit.jupiter.api.Test

class QuotesDataSourceTest {

    private val quoteEntity = mockk<QuoteEntity>()
    private val quotesProvider = mockkClass(QuotesProvider::class)
    private val quotesDataSource = QuotesDataSource(quotesProvider)

    @Test
    fun `On invoke getQuote from QuotesDataSource should return QuoteEntity`() {
        every { quotesProvider.getQuote() } returns quoteEntity
        val result = quotesDataSource.getQuote()
        verify { quotesProvider.getQuote() }
        assert(result != null)
        assert(result is QuoteEntity)
    }

    @Test
    fun `On invoke getQuote from QuotesDataSource should return null if provider returns null`() {
        every { quotesProvider.getQuote() } returns null
        val result = quotesDataSource.getQuote()
        verify { quotesProvider.getQuote() }
        assert(result == null)
    }

}