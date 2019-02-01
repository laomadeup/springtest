package com.spring.concert;

import com.spring.soundsystem.CompactDisc;
import com.spring.soundsystem.TrackCounter;
import com.spring.soundsystem.TrackCounterConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TrackCounterConfig.class})
public class TrackCounterTest {

    //public final StandardOutputStreamLog log = new StandardOutStreamLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter trackCounter;


    @Test
    public void testTrackCounter(){
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(7);
        cd.playTrack(7);

        trackCounter.getPlayCount(1);
    }

}
