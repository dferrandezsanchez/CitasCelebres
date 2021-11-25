package dev.danielferrandez.domain.features.quotes.useCases

import dev.danielferrandez.domain.features.quotes.IQuoteRepository
import dev.danielferrandez.domain.features.quotes.models.Quote
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkClass
import io.mockk.verify
import org.junit.jupiter.api.Test


class GetQuoteUseCaseTest {

    private val quoteRepository = mockkClass(IQuoteRepository::class)
    private val getQuoteUseCase = GetQuoteUseCase(quoteRepository)

    private val mockedQuote = mockk<Quote>()

    @Test
    fun `On invoke from GetQuoteUseCase should return Quote`() {
        every { quoteRepository.getQuote() } returns mockedQuote
        val result = getQuoteUseCase()
        verify { quoteRepository.getQuote() }
        assert(result != null)
        assert(result is Quote)
    }

    @Test
    fun `On invoke from GetQuoteUseCase should return null`() {
        every { quoteRepository.getQuote() } returns null
        val result = getQuoteUseCase()
        verify { quoteRepository.getQuote() }
        assert(result == null)
    }

}