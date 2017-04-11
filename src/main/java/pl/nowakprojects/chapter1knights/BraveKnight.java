package pl.nowakprojects.chapter1knights;

/**
 * Created by Mateusz on 26.03.2017.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
