package com.spring.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc{
    private String title;
    private String artist;
    private List<String> tracks;

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("playing :"+getTitle()+" Artist:"+getArtist());
    }
}
