package com.example.Practice22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender sender;
    @Value("${email.address}")
    private String emailAddress;

    @Async
    public void sendMessage() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailAddress);
        message.setTo("");
        message.setSubject("");
        message.setText("");
        sender.send(message);
    }

}
