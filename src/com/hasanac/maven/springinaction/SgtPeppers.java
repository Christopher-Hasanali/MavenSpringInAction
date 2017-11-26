package com.hasanac.maven.springinaction;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Some band name";
    private String artist = "Some artist name";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
