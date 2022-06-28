package jp.ac.it_college.std.s21023.news_manager.domain.model

import java.sql.Timestamp

data class NewsModel(
    val id: Long? = null,
    val title: String? = null,
    val body: String? = null,
    val categoryId: Long? = null,
    val userId: Long? = null,
    val createAt: Timestamp? = null,
    val publishAt: Timestamp? = null
)
