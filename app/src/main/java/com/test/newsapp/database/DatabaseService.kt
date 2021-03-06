package com.test.newsapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.test.newsapp.data.model.Article
import com.test.newsapp.data.model.SearchTerm

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
@Database(entities = [Article::class, SearchTerm::class], exportSchema = false, version = 1)
abstract class DatabaseService : RoomDatabase() {

    abstract fun getArticleDao(): ArticleDao

}
