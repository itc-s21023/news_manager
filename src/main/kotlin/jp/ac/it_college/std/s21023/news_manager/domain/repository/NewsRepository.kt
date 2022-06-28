package jp.ac.it_college.std.s21023.news_manager.domain.repository

import jp.ac.it_college.std.s21023.news_manager.domain.model.NewsWithCategoryModel

interface NewsRepository {
    fun findAllwithCategory(): List<NewsWithCategoryModel>

    fun findWithCategory(id: Long): NewsWithCategoryModel?
}