package com.engbuddy.backend.entity.dao

import com.engbuddy.backend.entity.enums.UserStatus
import com.engbuddy.backend.entity.table.Conversations
import com.engbuddy.backend.entity.table.UserSettings
import com.engbuddy.backend.entity.table.Users
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class UserEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<UserEntity>(Users)

    var email by Users.email
    var nickname by Users.nickname
    var englishLevel by Users.englishLevel
    var deviceToken by Users.deviceToken
    var status by Users.status
    var createdAt by Users.createdAt
    var updatedAt by Users.updatedAt

    val conversations by ConversationEntity referrersOn Conversations.userId
    val settings by UserSettingsEntity optionalBackReferencedOn UserSettings.userId

}
