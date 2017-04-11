package pl.nowakprojects.chapter2_3stereo;

import org.springframework.stereotype.Component;

/**
 * Created by Mateusz on 11.04.2017.
 */
@Component
//@Component("sgtPeppers") //default name
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatels";

    @Override
    public void play() {
        System.out.println("Odtwarzam utwór " + title + " artysty: " + artist);
    }
}
