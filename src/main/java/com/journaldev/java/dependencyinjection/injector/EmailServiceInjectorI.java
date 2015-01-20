package com.journaldev.java.dependencyinjection.injector;

import com.journaldev.java.dependencyinjection.consumer.IConsumer;
import com.journaldev.java.dependencyinjection.consumer.MyDIApplication;
import com.journaldev.java.dependencyinjection.service.EmailServiceImplI;

public class EmailServiceInjectorI implements IMessageServiceInjector {

    @Override
    public IConsumer getConsumer() {
        return new MyDIApplication(new EmailServiceImplI());
    }

}