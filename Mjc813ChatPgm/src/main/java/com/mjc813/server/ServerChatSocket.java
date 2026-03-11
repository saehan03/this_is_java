package com.mjc813.server;

import com.mjc813.user.ChatUser;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.Set;

public class ServerChatSocket extends Thread {
    private final ChatUser chatUser;  // 비기본생성자로 객체를 받아들인다.
    private BufferedReader br;
    private BufferedWriter bw;
    private ServerChatInterface sci;
    private Set<ServerChatSocket> users;

    public ChatUser getChatUser() {
        return this.chatUser;
    }

    public ServerChatSocket(ChatUser cu, ServerChatInterface sci) throws IOException {
        this.chatUser = cu;
        this.br = new BufferedReader(new InputStreamReader(cu.getSocket().getInputStream()));
        this.bw = new BufferedWriter(new OutputStreamWriter(cu.getSocket().getOutputStream()));
        this.sci = sci;
    }

    public ServerChatSocket(ChatUser cu, Set<ChatUser> users) throws IOException {
        this.chatUser = cu;
        this.br = new BufferedReader(new InputStreamReader(cu.getSocket().getInputStream()));
        this.bw = new BufferedWriter(new OutputStreamWriter(cu.getSocket().getOutputStream()));
        this.users = users;
    }

    public void close() {
        try {
            this.bw.close();
        } catch (Exception ex) {
        }
        try {
            this.br.close();
        } catch (Exception ex) {
        }
        try {
            this.chatUser.getSocket().close();
        } catch (Exception ex) {
        }
    }

    @Override
    public void run() {
        BufferedReader br = null;
        try {
            while(true) {
                if ( this.chatUser == null
                        || this.br == null
                        || this.bw == null
                        || this.chatUser.getSocket() == null
                        || this.chatUser.getSocket().isClosed() ) {
                    break;
                }
                String msg = this.br.readLine();
                String data;
                if ( ServerMain.exitWord.equals(msg) ) {
                    data = this.chatUser.getName() + " 클라이언트가 종료 했습니다.";
                    System.out.println(data);
//			        this.sci.sendAllMessage(data);
                    this.sendAllMessage(data);
                    break;
                }
                data = String.format("%s : %s", this.chatUser.getName(), msg);
                System.out.printf(data);
//			    this.sci.sendAllMessage(data);
                this.sendAllMessage(data);
            }
        } catch (IOException e) {
            String data = this.chatUser.getName() + " 클라이언트 접속을 끊었습니다.";
            System.out.println(data);
//			this.sci.sendAllMessage(data);
            this.sendAllMessage(data);
    } finally {
            this.close();
            this.users.remove(this.chatUser);
        }
    }

    public void send(String msg) {
        try {
            this.bw.write(msg);
            this.bw.newLine();
            this.bw.flush();
        } catch (Exception ex) {
            this.close();
        }
    }
    public void sendAllMessage(String msg) {
        for ( ServerChatSocket scs : this.users ) {
            if ( !scs.equals(this) ) {
                scs.send(msg);
            }
        }
    }
}
