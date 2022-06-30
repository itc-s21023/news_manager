package jp.ac.it_college.std.s21023.news_manager.domain.repository

import jp.ac.it_college.std.s21023.news_manager.infrastructure.database.record.Users

interface UserRepository {
    fun find(email: String) : Users?
}