package com.engbuddy.backend.entity.table

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import com.engbuddy.backend.entity.enums.EnglishLevel
import com.engbuddy.backend.entity.enums.UserStatus

object Users : LongIdTable("users") {
    val email = varchar("email", 255).uniqueIndex()
    val nickname = varchar("nickname", 50)
    val englishLevel = enumerationByName("english_level", 20, EnglishLevel::class)
    val deviceToken = varchar("device_token", 500).nullable()
    val status = enumerationByName("status", 20, UserStatus::class).default(UserStatus.ACTIVE)
    val createdAt = datetime("created_at")
    val updatedAt = datetime("updated_at")
}
