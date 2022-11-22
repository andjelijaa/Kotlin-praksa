package com.example.roomwordsample1

import android.app.Application
import com.example.roomwordsample1.data.WordRepository
import com.example.roomwordsample1.data.WordRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordApplication: Application() {
    val applicationScope= CoroutineScope(SupervisorJob())
    val database by lazy { WordRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }
}