package jp.ac.it_college.std.s21023.news_manager.domain.model

data class NewsWithCategoryModel(
    val news: NewsModel,
    val category: CategoryModel?
){
    val isCategory: Boolean
    get() = category != null
}
