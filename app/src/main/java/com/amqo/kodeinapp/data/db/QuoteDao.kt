package com.amqo.kodeinapp.data.db

import androidx.lifecycle.LiveData
import com.amqo.kodeinapp.data.model.Quote

interface QuoteDao {

    fun addQuote(quote: Quote)

    fun getQuotes(): LiveData<List<Quote>>
}