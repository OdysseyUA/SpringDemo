package com.journaldev.java.dependencyinjection.service;

public class EmailServiceImplI implements IMessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send email
        System.out.println("Email sent to " + rec + " with Message=" + msg);
    }

}