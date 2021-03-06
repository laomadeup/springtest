package com.spring.concert;

import com.spring.annotation.concert.ConcertConfig;
import com.spring.annotation.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConcertConfig.class})
public class PerformanceTest {

    @Autowired
    private Performance dancer;

    @Test
    public void test(){
        dancer.perform();
    }
}