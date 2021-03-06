package org.odyssey.javabrains28.PointcutsAndWildcardExpressions.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    // for exactly one class
    //@Before("execution(public String org.odyssey.javabrains28.PointcutsAndWildcardExpressions.model.Circle.getName())")

    //@Before("execution(public String get*(..))")
    //@Before("execution(public * org.odyssey.javabrains28.PointcutsAndWildcardExpressions.model.*.get*(..))")

    //@Before("execution(* get*())")
    @Before("allGetters()")
    public void LoggingAdvice() {
        System.out.println("Advice run. Get Method called.");
    }

    //@Before("execution(* get*())")
    @Before("allGetters()")
    public void secondAdvice() {
        System.out.println("Second Advice executed.");
    }


    @Pointcut("execution(* get*())")
    public void allGetters() {}
}
