package com.example.learningmanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;


@Entity
@Table(name = "message")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int msgId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "senderId")

    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receiverId")
    private User receiverId;

    private  String content;

    private Timestamp timestamp;

    public Messages() {
    }

    public Messages(int msgId, User user, User receiverId, String content, Timestamp timestamp) {
        this.msgId = msgId;
        this.user = user;
        this.receiverId = receiverId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUsers() {
        return receiverId;
    }

    public void setReceiverId(User receiverId) {
        this.receiverId = receiverId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
