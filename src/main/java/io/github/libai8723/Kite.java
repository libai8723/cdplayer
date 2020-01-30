package io.github.libai8723;

import org.springframework.stereotype.Component;

@Component
public class Kite implements CompactDisc {
    private String title = "Kite";
    private String artist = "Stefanie Sun Yanzi";

    @Override
    public void play() {
        System.out.println("Playing " + artist + "'s " + title);
    }

}
