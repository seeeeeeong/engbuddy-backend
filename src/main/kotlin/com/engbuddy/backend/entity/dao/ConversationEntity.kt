package com.engbuddy.backend.entity.dao

import com.engbuddy.backend.entity.table.Conversations
import com.engbuddy.backend.entity.table.Messages
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class ConversationEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<ConversationEntity>(Conversations)

    var user by UserEntity referencedOn Conversations.userId
    var aiPersonaName by Conversations.aiPersonaName
    var status by Conversations.status
    var lastMessageAt by Conversations.lastMessageAt
    var createdAt by Conversations.createdAt
    var updatedAt by Conversations.updatedAt

    val messages by MessageEntity referrersOn Messages.conversationId
}
