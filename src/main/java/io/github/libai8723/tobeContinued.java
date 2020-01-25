package io.github.libai8723;

import org.springframework.stereotype.Component;

@Component
public class tobeContinued implements CompactDisc {

    private String title = "To be Continued...";
    private String artist = "Stefanie Sun Yanzi";
    public void play() {
        System.out.println("Playing" + artist + "'s " + title);
    }
}
