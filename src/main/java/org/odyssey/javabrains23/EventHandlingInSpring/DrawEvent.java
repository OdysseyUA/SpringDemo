package org.odyssey.javabrains23.EventHandlingInSpring;

import org.springframework.context.ApplicationEvent;

/**
 * User: Odyssey
 * Date: 03.02.15
 * Time: 1:33
 */
public class DrawEvent extends ApplicationEvent {

    public DrawEvent(Object source) {
        super(source);

    }

    public String toString() {
        return "Draw Event occured!";
    }

}
