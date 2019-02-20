package com.spring.xml.concert;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

    public void performance(){}

    public void silenceCellPhone(){
        System.out.println("Silencing cell phone!");
    }
    public void takeSeats(){
        System.out.println("taking seats!");
    }

    public void applause(){
        System.out.println("CLAP CLAP CLAP!");
    }

    public void demandRefund(){
        System.out.println("Demanding a refund!");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Silence cellPhone！");
            System.out.println("Taking seats！");
            joinPoint.proceed();
            System.out.println("CLAP CLAP！");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
