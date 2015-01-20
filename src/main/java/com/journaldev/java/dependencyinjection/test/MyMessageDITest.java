package com.journaldev.java.dependencyinjection.test;

import com.journaldev.java.dependencyinjection.consumer.IConsumer;
import com.journaldev.java.dependencyinjection.injector.EmailServiceInjectorI;
import com.journaldev.java.dependencyinjection.injector.IMessageServiceInjector;
import com.journaldev.java.dependencyinjection.injector.SMSServiceInjectorI;

public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Odyssey";
        String email = "odyssey@abc.com";
        String phone = "4088888888";

        IMessageServiceInjector injector = null;
        IConsumer app = null;

        //Send email
        injector = new EmailServiceInjectorI();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjectorI();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }

}