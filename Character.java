package PreGame;

import java.util.ArrayList;

public class Character {
    private static ArrayList charList = new ArrayList();

    String name;
    int healthPoints;
    int magicalPoints;
    int level;
    int strenght;
    int luck;
    int magic;
    int physicalDefense;
    int magicalDefense;



    public Character(String name, int strenght, int luck, int magic){
        this.name = name;
        this.healthPoints = strenght * 3;
        this.magicalPoints = magic;
        this.level = 1;
        this.strenght = strenght;
        this.luck = luck;
        this.magic = magic;
        this.physicalDefense = strenght * 2;
        this.magicalDefense = magic * 2;
        charList.add(this);
    }
}
