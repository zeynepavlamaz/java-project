package Location;

import Characters.Armor;
import Main.Items;
import Tools.Weapon;

public class Snake extends Monster{

    public Snake() {
        super(4,howMuchDamage(), 7, "Yılan", 0);
    }

    public static int howMuchDamage(){
        return (int) (1 + Math.random() * 6);
    }
}
