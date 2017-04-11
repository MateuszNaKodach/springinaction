package pl.nowakprojects.chapter1knights;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.PrintStream;

/**
 * Created by Mateusz on 28.03.2017.
 */
@Aspect
public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream){
        this.printStream = printStream;
    }

    @Pointcut("execution(* * .embarkOnQuest())")
    public void knightEmbarkOnQuest(){};

    @Before("knightEmbarkOnQuest()")
    public void singBeforeQuest(){
        printStream.println("Tra la la: Jakiż rycerz jest dzielny!");
    }

    @After("knightEmbarkOnQuest()")
    public void singAfterQuest(){
        printStream.println("Hip hip hura: Dzielny rycerz wypełnił misję!!");
    }
}
