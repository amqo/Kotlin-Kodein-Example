package com.amqo.kodeinapp.data.db

class DatabaseFakeImpl : Database {

    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}