package com.amqo.kodeinapp.ui.quotes

import androidx.lifecycle.ViewModel
import com.amqo.kodeinapp.data.model.Quote
import com.amqo.kodeinapp.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun addQuote(quote : Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuotes()
}
