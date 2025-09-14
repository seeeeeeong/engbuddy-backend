package com.engbuddy.backend.entity.dao

import com.engbuddy.backend.entity.table.UserSettings
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class UserSettingsEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<UserSettingsEntity>(UserSettings)

    var userId by UserSettings.userId
    var aiFriendName by UserSettings.aiFriendName
    var dailyMessageCount by UserSettings.dailyMessageCount
    var doNotDisturbStart by UserSettings.doNotDisturbStart
    var doNotDisturbEnd by UserSettings.doNotDisturbEnd
    var pushNotificationsEnabled by UserSettings.pushNotificationsEnabled
    var voiceMessagesEnabled by UserSettings.voiceMessagesEnabled
    var createdAt by UserSettings.createdAt
    var updatedAt by UserSettings.updatedAt

    var user by UserEntity referencedOn UserSettings.userId
}
