package jp.ac.it_college.std.s21023.news_manager.infrastructure.database.repository

import jp.ac.it_college.std.s21023.news_manager.domain.model.NewsWithCategoryModel
import jp.ac.it_college.std.s21023.news_manager.domain.repository.NewsRepository
import jp.ac.it_college.std.s21023.news_manager.infrastructure.database.mapper.NewsWithCategoryMapper
import jp.ac.it_college.std.s21023.news_manager.infrastructure.database.mapper.select
import jp.ac.it_college.std.s21023.news_manager.infrastructure.database.record.NewsWithCategoryRecord

class NewsRepositoryImpl (
    private val newsWithCategoryMapper: NewsWithCategoryMapper
) : NewsRepository {
    override fun findAllwithCategory(): List<NewsWithCategoryModel> {
        return newsWithCategoryMapper.select().map { toModel(it)}
    }

    private fun toModel(record: NewsWithCategoryRecord): NewsWithCategoryModel {
        val news = News(

        )
    }
}