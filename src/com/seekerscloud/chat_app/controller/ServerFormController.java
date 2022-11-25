package com.seekerscloud.chat_app.controller;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerFormController {

    public void initialize(){
        new Thread(()->{
            try{
                ServerSocket serverSocket = new ServerSocket(5000);
                System.out.println("Server Started");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public TextField txtMessageBox;

    public void shutdownServerOnClick(MouseEvent mouseEvent) {
    }
}
