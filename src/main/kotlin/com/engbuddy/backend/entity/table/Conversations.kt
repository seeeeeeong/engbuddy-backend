package com.engbuddy.backend.entity.table

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import com.engbuddy.backend.entity.enums.ConversationStatus

object Conversations : LongIdTable("conversations") {
    val userId = reference("user_id", Users)
    val aiPersonaName = varchar("ai_persona_name", 50).default("Alex")
    val status = enumerationByName("status", 20, ConversationStatus::class).default(ConversationStatus.ACTIVE)
    val lastMessageAt = datetime("last_message_at").nullable()
    val createdAt = datetime("created_at")
    val updatedAt = datetime("updated_at")
}
