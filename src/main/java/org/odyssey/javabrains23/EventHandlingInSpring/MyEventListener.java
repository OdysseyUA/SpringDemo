package org.odyssey.javabrains23.EventHandlingInSpring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * User: Odyssey
 * Date: 03.02.15
 * Time: 1:28
 */
@Component
public class MyEventListener implements ApplicationListener {


    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.toString());
    }
}
