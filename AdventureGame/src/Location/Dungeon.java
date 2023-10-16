package Location;

import Main.Player;

public class Dungeon extends BattleLocation{

    public Dungeon(Player player) {
        super(player, "Zindan", new Snake(), "Para", 5);
    }


    public static String whichGonnaGet(){
        int number = whatGonnaGet();

        switch (number){
            case 0:
                return "Yok";
            case 1:
                return whichWeapon();
            case 2:
                return whichArmor();
            case 3:
                return String.valueOf(howMuchMoney());
            default:
                return "Default";
        }
    }

    public static int whatGonnaGet(){
        int randNumber = (int) (0 + Math.random() * 100);
        if (randNumber < 15){
            return 1;
        }else if (randNumber < 30){
            return 2;
        } else if (randNumber < 55) {
            return 3;
        } else if (randNumber <= 100) {
            return 0;
        }

        return 0;
    }

    public static int howMuchMoney(){
        int randNumber = (int) (0 + Math.random() * 100);

        if (randNumber < 20){
            return 10;
        } else if (randNumber < 50) {
            return 5;
        } else if (randNumber <= 100) {
            return 1;
        }

        return 0;
    }

    public static String whichWeapon(){
        int randNumber = (int) (0 + Math.random() * 100);

        if (randNumber < 20){
            return "Tüfek";
        } else if (randNumber < 50) {
            return "Kılıç";
        } else if (randNumber <= 100) {
            return "Tabanca";
        }

        return "Weapon Yok";
    }

    public static String  whichArmor(){
        int randNumber = (int) (0 + Math.random() * 100);

        if (randNumber < 20){
            return "Ağır Zırh";
        } else if (randNumber < 50) {
            return "Orta Zırh";
        } else if (randNumber <= 100) {
            return "Hafif Zırh";
        }

        return "Armor Yok";
    }
}
