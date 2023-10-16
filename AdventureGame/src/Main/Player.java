package Main;
import Characters.*;

import java.util.Scanner;


public class Player {
    private int damage,health,money,selectChar,ogHealth;
    private String name,charName;
    public Scanner scan = new Scanner(System.in);
    private final Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        GameCharacter[] charList = {new Samurai(),new Knigth(),new Archer()};

        System.out.println("--------------------------------");
        for (GameCharacter gameChar: charList) {
            System.out.println("Karakter: " +  gameChar.getName()  + " Hasar: " + gameChar.getDamage() + "Sağlık: " + gameChar.getHealth() + "Para: " + gameChar.getMoney());
        }
        System.out.println("--------------------------------");
        System.out.print("Lütfen oynamak istediğiniz karakteri (Samuray:1, Şövayle:2, Okçu:3) seçiniz: ");
        selectChar = scan.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(charList[0]);
                break;
            case 2:
                initPlayer(charList[1]);
                break;
            case 3:
                initPlayer(charList[2]);
                break;
            default:
                initPlayer(charList[1]);
        }
    }

    public void initPlayer(GameCharacter gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
        this.setOgHealth(gameChar.getHealth());
    }

    public void printPlayerInfo(){
        System.out.println("Silahınız: " + this.getInventory().getWeapon().getName() + " Hasar: " + this.getDamage()+ " Zırhınız: " + this.getInventory().getArmor().getName() + "Bloklama: " + this.getInventory().getArmor().getBlock() + " Sağlık: " + this.getHealth() + " Para: " + this.getMoney());

    }

    public int getTotalDamage(){
        return getDamage() + this.getInventory().getWeapon().getDamage();
    }

    public int getOgHealth() {
        return ogHealth;
    }

    public void setOgHealth(int ogHealth) {
        this.ogHealth = ogHealth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getSelectChar() {
        return selectChar;
    }

    public void setSelectChar(int selectChar) {
        this.selectChar = selectChar;
    }


    public Inventory getInventory() {
        return inventory;
    }
}
