package com.example.springboot.dependencyinjection;

public class NotificationService {
    private MessageService messageService;

    //setter injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }
}
