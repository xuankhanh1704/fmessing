package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "conversation_members")
public class ConversationMember {
    @EmbeddedId
    private ConversationMemberId id;

    @MapsId("conversationId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "conversation_id", nullable = false)
    private Conversation conversation;

    @ColumnDefault("'MEMBER'")
    @Column(name = "role", length = 30)
    private String role;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "joined_at", nullable = false)
    private Instant joinedAt;

    @Column(name = "left_at")
    private Instant leftAt;

    @Column(name = "last_read_message_id")
    private Long lastReadMessageId;

    @ColumnDefault("false")
    @Column(name = "is_muted", nullable = false)
    private Boolean isMuted = false;

}