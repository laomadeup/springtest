package com.spring.annotation.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(public * com.spring.annotation.concert.Performance.perform(..))")
    public void performance(){}

    @Before("com.spring.annotation.concert.Audience.performance()")
    public void silenceCellPhone(){
        System.out.println("Silencing cell phone!");
    }
    @Before("com.spring.annotation.concert.Audience.performance()")
    public void takeSeats(){
        System.out.println("taking seats!");
    }

    @AfterReturning("com.spring.annotation.concert.Audience.performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!");
    }

    @AfterThrowing("com.spring.annotation.concert.Audience.performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund!");
    }

    /*@Around("Audience.performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Silence cellPhone！");
            System.out.println("Taking seats！");
            joinPoint.proceed();
            System.out.println("CLAP CLAP！");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }*/

}
