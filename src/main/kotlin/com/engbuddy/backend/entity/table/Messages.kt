package com.engbuddy.backend.entity.table

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import com.engbuddy.backend.entity.enums.MessageType
import com.engbuddy.backend.entity.enums.SenderType

object Messages : LongIdTable("messages") {
    val conversationId = reference("conversation_id", Conversations)
    val content = text("content")
    val messageType = enumerationByName("message_type", 20, MessageType::class).default(MessageType.TEXT)
    val senderType = enumerationByName("sender_type", 20, SenderType::class)
    val isRead = bool("is_read").default(false)
    val metadata = text("metadata").nullable()
    val createdAt = datetime("created_at")
}
