package com.spring.annotation.concert;

public class Dancer implements Performance {
    @Override
    public void perform() {
        System.out.println("dancing !!!");
    }
}
