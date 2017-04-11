package pl.nowakprojects.chapter2_3stereo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.nowakprojects.chapter2_3stereo.CompactDisc;
import pl.nowakprojects.chapter2_3stereo.SgtPeppers;

/**
 * Created by Mateusz on 11.04.2017.
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    //@Bean(name="lonelyHeartsClubBand") - it's optional to set the name
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
}
