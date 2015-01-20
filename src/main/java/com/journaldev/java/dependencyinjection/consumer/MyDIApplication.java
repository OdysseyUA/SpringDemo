package com.journaldev.java.dependencyinjection.consumer;

import com.journaldev.java.dependencyinjection.service.IMessageService;

public class MyDIApplication implements IConsumer {

    private IMessageService service;

    public MyDIApplication(IMessageService svc){
        this.service=svc;
    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}