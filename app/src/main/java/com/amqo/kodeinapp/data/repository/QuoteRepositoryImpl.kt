package com.amqo.kodeinapp.data.repository

import com.amqo.kodeinapp.data.db.QuoteDao
import com.amqo.kodeinapp.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao) : QuoteRepository {

    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}