/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2022-06-22T16:39:43.317869977+09:00
 */
package jp.ac.it_college.std.s21023.news_manager.infrastructure.database.record

import java.time.LocalDateTime

data class News(
    var id: Long? = null,
    var title: String? = null,
    var categoryId: Long? = null,
    var publishAt: LocalDateTime? = null,
    var createAt: LocalDateTime? = null,
    var userId: Long? = null,
    var body: String? = null
)