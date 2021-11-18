package dev.danielferrandez.citascelebres.repository

import dev.danielferrandez.citascelebres.model.QuoteModel
import kotlin.random.Random

class QuoteRepository {

    companion object {
        internal const val MIN_RANDOM_VAL = 1
    }

    fun getQuote(): QuoteModel? {
        val quoteMap = mapOf(
            1 to QuoteModel(
                "A veces podemos pasarnos años sin vivir en absoluto, y de pronto toda nuestra vida se concentra en un solo instante.",
                "Oscar Wilde (1854-1900)"
            ),
            2 to QuoteModel(
                "No pidáis a Dios que os de una carga apta para vuestros hombros; pedidle unos hombros aptos para soportar vuestras cargas.",
                "Phillips Brooks (1835-1893)"
            ),
            3 to QuoteModel(
                "Un hombre ha de mantener su amistad en continua reparación.",
                "Henry Fielding (1707-1754)"
            ),
            4 to QuoteModel(
                "Unirse es el comienzo; estar juntos es el progreso; trabajar juntos es el éxito.",
                "Henry Ford (1863-1947)"
            ),
            5 to QuoteModel(
                "Todos los cambios, aun los más ansiados, llevan consigo cierta melancolía.",
                "Anatole France (1844-1924)"
            ),

            ).withDefault { QuoteModel("", "") }
        return quoteMap[Random.nextInt(1, quoteMap.size)]

    }

}