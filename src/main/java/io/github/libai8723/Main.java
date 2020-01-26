package io.github.libai8723;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext("io.github.libai8723");

        MediaPlayer mp = (MediaPlayer) ctx.getBean("cdPlayer");

        mp.play();
    }
}
