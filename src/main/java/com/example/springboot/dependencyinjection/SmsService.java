package com.example.springboot.dependencyinjection;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms message: " + message);
    }
}
