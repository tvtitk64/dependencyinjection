package com.example.springboot.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        MessageService messageService = new EmailService();
        UserController userController = new UserController(messageService);
        userController.send();
    }
}
