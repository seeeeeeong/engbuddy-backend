package com.engbuddy.backend.entity.dao


import com.engbuddy.backend.entity.table.Messages
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class MessageEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<MessageEntity>(Messages)

    var conversation by ConversationEntity referencedOn Messages.conversationId
    var content by Messages.content
    var messageType by Messages.messageType
    var senderType by Messages.senderType
    var isRead by Messages.isRead
    var metadata by Messages.metadata
    var createdAt by Messages.createdAt
}
