package pl.nowakprojects.chapter1knights;

import java.io.PrintStream;

/**
 * Created by Mateusz on 28.03.2017.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Embarking on quest to slay a dragon!");
    }
}
