package com.amqo.kodeinapp

import android.app.Application
import com.amqo.kodeinapp.data.db.Database
import com.amqo.kodeinapp.data.db.DatabaseFakeImpl
import com.amqo.kodeinapp.data.db.QuoteDao
import com.amqo.kodeinapp.data.repository.QuoteRepository
import com.amqo.kodeinapp.data.repository.QuoteRepositoryImpl
import com.amqo.kodeinapp.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein.Companion.lazy
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication : Application(), KodeinAware {

    override val kodein = lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}