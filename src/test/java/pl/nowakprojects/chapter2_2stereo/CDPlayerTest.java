package pl.nowakprojects.chapter2_2stereo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.nowakprojects.chapter2_2stereo.config.CDPlayerConfig;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Mateusz on 11.04.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog logger = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer mediaPlayer;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void playTest(){
        mediaPlayer.play();
        assertEquals("Odtwarzam utwór Sgt. Pepper's Lonely Hearts Club Band artysty: The Beatels",logger.getLog());
    }

}
