package com.spring.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPepper(){
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("Sgt Pepper's Lonely Hearts Club Band");
        blankDisc.setArtist("The Beatles");
        List<String> tracks = new ArrayList<String>();
        tracks.add("Sgt Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Firends");
        tracks.add("Luce in the Sky With Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        blankDisc.setTracks(tracks);

        return blankDisc;
    }

    @Bean
    public TrackCounter getTrackCounter(){
        return new TrackCounter();
    }

}
