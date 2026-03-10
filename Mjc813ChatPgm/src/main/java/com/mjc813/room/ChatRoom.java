package com.mjc813.room;

import com.mjc813.user.ChatUser;

import java.util.LinkedList;
import java.util.List;

public class ChatRoom {
    private static Long lastRoomId = 1L;
    private final Long roomId;
    private final List<ChatUser> users;

    public ChatRoom() {
        this.users = new LinkedList<>();
        this.roomId = lastRoomId++;
    }

    public List<ChatUser> getAllUsers() {
        return this.users;
    }

    public Long getRoomId() {
        return this.roomId;
    }
}
