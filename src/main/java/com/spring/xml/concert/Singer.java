package com.spring.xml.concert;

public class Singer implements Performance{


    @Override
    public void perform() {
        System.out.println("singing !!!");
    }
}
