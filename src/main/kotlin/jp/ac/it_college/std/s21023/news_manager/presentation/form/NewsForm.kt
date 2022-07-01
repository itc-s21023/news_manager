package jp.ac.it_college.std.s21023.news_manager.presentation.form

import jp.ac.it_college.std.s21023.news_manager.domain.model.NewsWithCategoryModel
import jp.ac.it_college.std.s21023.news_manager.infrastructure.database.record.Category
import java.sql.Timestamp
import java.time.LocalDateTime

data class GetNewsListResponse(val newsList: List<NewsInfo>)

data class NewsInfo(
    val title: String,
    val body: String,
    val categoryId: Long,
    val publishAt: Timestamp
) {
    constructor(model: NewsWithCategoryModel) : this(
        model.news.title!!, model.news.body!!, model.news.categoryId!!, model.news.publishAt!!
    )
}

data class GetNewsDetailResponse(
    val id: Long,
    val title: String,
    val userId: Long
) {
    constructor(model: NewsWithCategoryModel) : this(
        model.news.id!!,
        model.news.title!!,
        model.news.userId!!
    )
}

data class CategoryInfo(
    val id: Long,
    val name: String
) {
    constructor(category: Category) : this(category.id!!, category.name!!)
}

data class RegisterNewsRequest(
    val categoryId: Long,
    val title: String,
    val body: String,
    val publishAt: LocalDateTime
)

data class RegisterCategoryRequest(
    val name: String
)

data class UpdateCategoryRequest(
    val id: Long,
    val name: String
)