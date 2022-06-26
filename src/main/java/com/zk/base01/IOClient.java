package com.zk.base01;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @Classname IOClient
 * @Description
 * @Date 2022/6/25 21:40
 * @Created by brain
 */
public class IOClient {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();
    }
}
