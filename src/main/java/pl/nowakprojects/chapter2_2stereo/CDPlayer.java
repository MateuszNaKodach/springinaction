package pl.nowakprojects.chapter2_2stereo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Mateusz on 11.04.2017.
 */
@Component
public class CDPlayer implements MediaPlayer{

    private CompactDisc cd;

    @Autowired //@Inject - is the almost the same
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
