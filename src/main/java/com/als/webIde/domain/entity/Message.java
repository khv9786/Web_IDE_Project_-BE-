package com.als.webIde.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@Entity
@Table(name = "message")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_pk")
    private Long messagePk;

    @ManyToOne
    @JoinColumn(name = "chat_id", nullable = false)
    private Chatting chat;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Member member;

    @Column(name = "message_content", nullable = false)
    private String messageContent;

    @Column(name = "message_sendtime", nullable = false)
    private LocalDateTime messageSendTime;
}

