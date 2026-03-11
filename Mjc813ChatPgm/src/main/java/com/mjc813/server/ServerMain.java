package com.mjc813.server;

import com.mjc813.room.ChatRoom;
import com.mjc813.user.ChatUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ServerMain extends Thread implements ServerChatInterface {
    public static final String exitWord = "(3{}#quit~%#!#)(";
    public static final int port = 50813;
    private Map<Long, ChatRoom> chatRooms;
    private ServerSocket serverSocket;
    private Set<ServerChatSocket> lobby;

    public ServerMain() {
        this.chatRooms = Collections.synchronizedMap(new HashMap<Long, ChatRoom>());
        this.lobby = Collections.synchronizedSet(new HashSet<ServerChatSocket>());
        try {
            this.serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            throw new RuntimeException(e);
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

                ChatUser cu = new ChatUser(socket.getInetAddress().getHostAddress(), socket);

                ServerChatSocket scs = new ServerChatSocket(cu, this.lobby);
                scs.start();

                this.lobby.add(scs); // 접속한 사용자는 모두 로비에 추가했다.
                this.printLobby();

            } catch (IOException e) {
            }
        }
    }

    private void printLobby() {
        for ( ServerChatSocket scs : this.lobby ) {
            System.out.println(scs.getChatUser());
        }
    }

    @Override
    public void removeChatUser(ServerChatSocket scs) {
        this.lobby.remove(scs);
    }

    @Override
    public void sendAllClients(String msg) {
        for ( ServerChatSocket scs : this.lobby ) {
            scs.send(msg);
        }
    }

    public static void main(String[] args) {
        ServerMain sm = new ServerMain();
        sm.start();
    }
}