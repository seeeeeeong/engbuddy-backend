package com.engbuddy.backend.entity.table

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import org.jetbrains.exposed.sql.kotlin.datetime.time

object UserSettings : LongIdTable("user_settings") {
    val userId = reference("user_id", Users).uniqueIndex()
    val aiFriendName = varchar("ai_friend_name", 50).default("Alex")
    val dailyMessageCount = integer("daily_message_count").default(5)
    val doNotDisturbStart = time("do_not_disturb_start").nullable()
    val doNotDisturbEnd = time("do_not_disturb_end").nullable()
    val pushNotificationsEnabled = bool("push_notifications_enabled").default(true)
    val voiceMessagesEnabled = bool("voice_messages_enabled").default(true)
    val createdAt = datetime("created_at")
    val updatedAt = datetime("updated_at")
}
