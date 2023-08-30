package com.example.springboot.dependencyinjection;

public class UserController {
    private MessageService messageService;
//    private EmailService emailService = new EmailService();
//
//    public void send() {
//        emailService.sendEmail("Hello DI");
//    }

    //contrucstor injection
    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send() {
        messageService.sendMessage("Constructor Injection");
    }
}
