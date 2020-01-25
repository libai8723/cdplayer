package io.github.libai8723;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    // Page 40. Assuming that one
    // and only one bean matches, that bean will be wired in.
    // 假设有且仅有一个bean满足的时候，这个bean就会被wired in
    // 当有多个beans都满足匹配的时候，Spring会抛出异常的
    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play() {
        this.cd.play();
    }
}
