package com.mjc813.server;

import com.mjc813.user.ChatUser;

public interface ServerChatInterface {
    void removeChatUser(ServerChatSocket cu);
    void sendAllClients(String msg);
}
