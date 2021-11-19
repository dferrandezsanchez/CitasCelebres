package dev.danielferrandez.data.features.quotes.dataSources

import dev.danielferrandez.data.features.quotes.models.QuoteEntity
import kotlin.random.Random

class QuotesDataSource {

    fun getQuote(): QuoteEntity? {
        val quoteMap = mapOf(
            1 to QuoteEntity(
                "A veces podemos pasarnos años sin vivir en absoluto, y de pronto toda nuestra vida se concentra en un solo instante.",
                "Oscar Wilde (1854-1900)"
            ),
            2 to QuoteEntity(
                "No pidáis a Dios que os de una carga apta para vuestros hombros; pedidle unos hombros aptos para soportar vuestras cargas.",
                "Phillips Brooks (1835-1893)"
            ),
            3 to QuoteEntity(
                "Un hombre ha de mantener su amistad en continua reparación.",
                "Henry Fielding (1707-1754)"
            ),
            4 to QuoteEntity(
                "Unirse es el comienzo; estar juntos es el progreso; trabajar juntos es el éxito.",
                "Henry Ford (1863-1947)"
            ),
            5 to QuoteEntity(
                "Todos los cambios, aun los más ansiados, llevan consigo cierta melancolía.",
                "Anatole France (1844-1924)"
            ),

            ).withDefault { QuoteEntity("", "") }
        return quoteMap[Random.nextInt(1, quoteMap.size)]

    }

}