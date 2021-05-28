package ru.asselinux.news.repository

import ru.asselinux.news.api.RetrofitInstance
import ru.asselinux.news.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}
