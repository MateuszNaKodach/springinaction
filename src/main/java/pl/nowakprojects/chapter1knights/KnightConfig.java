package pl.nowakprojects.chapter1knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.PrintStream;

/**
 * Created by Mateusz on 28.03.2017.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(printStream());
    }

    @Bean
    Minstrel minstrel(){
        return new Minstrel(printStream());
    }

    @Bean
    public PrintStream printStream(){
        return System.out;
    }
}
