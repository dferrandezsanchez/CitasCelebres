package dev.danielferrandez.data.features.quotes.dataSources

import dev.danielferrandez.data.features.quotes.models.QuoteEntity
import java.util.stream.Stream
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class QuotesProviderTest {

    companion object {
        @JvmStatic
        fun validInts(): Stream<Int> = Stream.of(
            1,
            2,
            3,
            4,
            5
        )
        internal const val OUT_SCOPE_NUM = 6
    }

    private val quotesProvider = QuotesProvider()

    @Test
    fun `On invoke getQuote from QuotesProvider should return QuonteEntity`(){
        val result = quotesProvider.getQuote()
        assert(result is QuoteEntity)
    }

    @Test
    fun `On invoke getRandomQuote from QuotesProvider should return null on invalid Scope`(){
        val result = quotesProvider.getRandomQuote(OUT_SCOPE_NUM)
        assert(result == null)
    }

    @ParameterizedTest(name = "On invoke getRandomQuote from QuotesProvider should return QuoteEntity for value \"{0}\"")
    @MethodSource("validInts")
    fun `On invoke getQuote from QuotesProvider should return QuoteEntity on valid Scope`(
        randomInt: Int
    ) {
        val result = quotesProvider.getRandomQuote(randomInt)
        assert(result != null)
        assert((result as QuoteEntity).quote.isNotEmpty() && result.author.isNotEmpty())

    }


}