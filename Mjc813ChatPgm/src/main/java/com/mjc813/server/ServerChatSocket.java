package com.mjc813.server;

import com.mjc813.user.ChatUser;
import lombok.AllArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@AllArgsConstructor
public class ServerChatSocket extends Thread {
    private ChatUser chatUser;

    @Override
    public void run() {
        BufferedReader br = null;
        try {
            while(true) {
                br = new BufferedReader(new InputStreamReader(this.chatUser.getSocket().getInputStream()));
                String msg = br.readLine();
                System.out.println(String.format("%s : %s", this.chatUser.getName(), msg));
            }
        } catch (IOException e) {
        System.out.println(this.chatUser.getName() + " 이 접속을 끊었습니다.");
    } finally {
            try {
                br.close();
            } catch (Exception ex) {

            }
        }
        }
}
