package com.amqo.kodeinapp.data.repository

import androidx.lifecycle.LiveData
import com.amqo.kodeinapp.data.model.Quote

interface QuoteRepository {

    fun addQuote(quote: Quote)

    fun getQuotes(): LiveData<List<Quote>>
}