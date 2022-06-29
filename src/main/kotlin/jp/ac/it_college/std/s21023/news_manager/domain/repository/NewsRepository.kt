package jp.ac.it_college.std.s21023.news_manager.domain.repository

import jp.ac.it_college.std.s21023.news_manager.domain.model.NewsWithCategoryModel
import jp.ac.it_college.std.s21023.news_manager.infrastructure.database.record.News

interface NewsRepository {
    fun findAllwithCategory(): List<NewsWithCategoryModel>

    fun findWithCategory(id: Long): NewsWithCategoryModel?

    fun register(news: News)
}