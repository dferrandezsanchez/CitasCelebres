package dev.danielferrandez.citascelebres.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.danielferrandez.citascelebres.model.QuoteModel
import dev.danielferrandez.citascelebres.model.transform
import dev.danielferrandez.domain.features.quotes.useCases.GetQuoteUseCase

class MainViewModel(
    private val getQuoteUseCase: GetQuoteUseCase
) : ViewModel() {

    private val _quote = MutableLiveData<QuoteModel?>()
    val quote: LiveData<QuoteModel?> = _quote

    fun getQuote() {
        _quote.value = getQuoteUseCase()?.transform()
    }

}