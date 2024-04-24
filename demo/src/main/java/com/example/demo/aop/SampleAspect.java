package com.example.demo.aop;/*
 * @author -Suraj Tiwari
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Aspect: Aspect is a class for AOP where we create pointcuts and advices
 * Advice: Every method inside Aspect class is advice
 * pointcuts: Expression which decide when the aop will be injected
 * joinPoints: join point is a point where advice  can be applied
 *
 */

@Aspect
@Component
public class SampleAspect {
    @Before(value = "execution( * com.example.demo.controller.ServiceA.serviceA())")
    public void beforeMethod(){
        System.out.println("Before calling controller method");

    }
    @After(value = "execution(* com.example.demo.controller.ServiceA.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        System.out.println("After calling controller method:"+joinPoint.getSignature() );

    }

    @AfterReturning(value = "execution(* com.example.demo.controller.ServiceA.*(..))",returning = "string")
    public void AfterReturningMethod(JoinPoint joinPoint,String string){
        System.out.println(" AfterReturningMethod controller method:"+joinPoint.getSignature()+": Returned String"+string );

    }

    @AfterThrowing(value = "execution(* com.example.demo.controller.ServiceA.*(..))",throwing = "exception")
    public void AfterThrowingMethod(JoinPoint joinPoint,Exception exception){
        System.out.println("AfterThrowingMethod calling controller method:"+joinPoint.getSignature()+": Returned Exception"+exception );

    }
}
