package pl.nowakprojects.chapter2_2stereo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.nowakprojects.chapter2_2stereo.CompactDisc;

/**
 * Created by Mateusz on 11.04.2017.
 */
@Configuration
@ComponentScan(basePackageClasses = CompactDisc.class)
public class CDPlayerConfig {

}
