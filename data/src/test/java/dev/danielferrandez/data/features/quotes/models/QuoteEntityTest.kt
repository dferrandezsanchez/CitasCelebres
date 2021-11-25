package dev.danielferrandez.data.features.quotes.models

import dev.danielferrandez.domain.features.quotes.models.Quote
import org.junit.jupiter.api.Test

class QuoteEntityTest {

    companion object {
        internal const val FAKE_AUTH = "FAKE_AUTH"
        internal const val FAKE_QUOTE = "FAKE_QUOTE"
    }

    private val quoteEntity = QuoteEntity(
        quote = FAKE_QUOTE,
        author = FAKE_AUTH
    )

    @Test
    fun `On invoke transform from QuoteEntity should return Quote`() {
        val result = quoteEntity.transform()
        assert(result is Quote)
        assert(
            result.quote == FAKE_QUOTE &&
                    result.author == FAKE_AUTH
        )
    }


}