package pl.nowakprojects.chapter1knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Mateusz on 28.03.2017.
 */
public class KnightMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);

       // Minstrel minstrel = context.getBean(Minstrel.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }


}
