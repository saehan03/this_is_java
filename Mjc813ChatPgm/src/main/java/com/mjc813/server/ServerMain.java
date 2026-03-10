package com.mjc813.server;

import com.mjc813.room.ChatRoom;
import com.mjc813.user.ChatUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ServerMain extends Thread {
    private Map<Long, ChatRoom> chatRooms;
    private ServerSocket serverSocket;
    private Set<ChatUser> lobby;

    public ServerMain() {
        this.chatRooms = Collections.synchronizedMap(new HashMap<Long, ChatRoom>());
        this.lobby = Collections.synchronizedSet(new HashSet<ChatUser>());
        try {
            this.serverSocket = new ServerSocket(50813);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (this.serverSocket.isClosed()) {
                    break;
                }
                Socket socket = this.serverSocket.accept();

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String userName = br.readLine();
                ChatUser cu = new ChatUser(userName, socket);
                this.lobby.add(cu);
                try {
                    br.close();
                } catch (IOException ie) {
                }
            } catch (IOException e) {
            }
            ServerChatSocket scs = new ServerChatSocket(cu);
            scs.start();
        } catch (Exception ex) {
            
        }
    }


    public static void main(String[] args) {
        ServerMain sm = new ServerMain();
    }
}