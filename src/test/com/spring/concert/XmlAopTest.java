package com.spring.concert;


import com.spring.xml.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:audienceconfig.xml")
public class XmlAopTest {

    @Autowired
    private Performance singer;

    @Test
    public void testXmlAop(){
        singer.perform();
    }


}
