package jp.ac.it_college.std.s21023.news_manager.application.service

import jp.ac.it_college.std.s21023.news_manager.domain.model.NewsWithCategoryModel
import jp.ac.it_college.std.s21023.news_manager.domain.repository.NewsRepository
import org.springframework.stereotype.Service

@Service
class NewsService(
    private val newsRepository: NewsRepository
) {
    fun getList(): List<NewsWithCategoryModel> {
        return newsRepository.findAllwithCategory()
    }
    fun getDetail(newsId: Long): NewsWithCategoryModel {
        return newsRepository.findWithCategory(newsId) ?: throw java.lang.IllegalArgumentException("存在しないニュースID: $newsId")
    }
}