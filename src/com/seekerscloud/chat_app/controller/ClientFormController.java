package com.seekerscloud.chat_app.controller;

import javafx.scene.input.MouseEvent;

public class ClientFormController {
    String clientName;

    public void initialize(){
        System.out.println("initialize");
    }

    public void setClientName(String name){
         clientName=name;
         System.out.println(clientName);
    }

    public void exitClientOnAction(MouseEvent mouseEvent) {
    }
}
