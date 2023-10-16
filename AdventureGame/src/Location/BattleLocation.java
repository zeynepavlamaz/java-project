package Location;

import Characters.Armor;
import Main.Player;
import Tools.Weapon;

import java.util.Objects;
import java.util.Random;

public abstract class BattleLocation extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLocation(Player player, String name,Monster monster, String award,int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int randomMonsterNumber = this.randomMonster();

        System.out.println("Şuan buradasınız: " + this.getName());
        System.out.println("Dikkatli ol! Burada " + randomMonsterNumber + " tane " + this.getMonster().getName() + " yaşıyor olabilir!");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectedBehaviour = scan.next().toUpperCase();

        if (selectedBehaviour.equals("S")){
            if (combat(randomMonsterNumber)){
                System.out.println(this.getName() + "daki" + " tüm düşmanları yendiniz!");
                switch (this.award){
                    case "Food":
                        this.getPlayer().getInventory().setFood(true);
                        System.out.println("Yemek ödülünü kazandınız!");
                        break;
                    case "Water":
                        this.getPlayer().getInventory().setWater(true);
                        System.out.println("Su ödülünü kazandınız!");
                        break;
                    case "Firewood":
                        this.getPlayer().getInventory().setFirewood(true);
                        System.out.println("Odun kömürü ödülünü kazandınız!");
                        break;

                }
                return true;
            }
        }

        if (this.getPlayer().getHealth()<=0){
            System.out.println("*************");
            System.out.println("ÖLDÜNÜZ!");
            return false;
        }

        return true;
    }

    public boolean combat(int monsterNumber){
        for (int i = 1; i<= monsterNumber; i++){
            if (this.getName().equals("Zindan")){
                this.monster = new Snake();
            }else {
                this.getMonster().setHealth(this.getMonster().getDefaultHealth());
            }
            playerStats();
            monsterStats(i);
            boolean firstEncounter = true;

            while (this.getPlayer().getHealth() > 0 &&  this.getMonster().getHealth() > 0){
                if (firstEncounter && isFirstHitMonster()){
                    System.out.println();
                    System.out.println("Canavar size vurdu!");
                    System.out.println();
                    int takenDamage =this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                    if (takenDamage < 0){
                        takenDamage = 0;
                    }
                    int newHealth = this.getPlayer().getHealth() - takenDamage;
                    this.getPlayer().setHealth(newHealth);
                    afterHit();

                }
                firstEncounter = false;
                System.out.print("<V>ur veya <K>aç : ");
                String selectCombat = scan.next().toUpperCase();

                if (selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz!");
                    this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();

                    if (this.getMonster().getHealth() > 0){
                        System.out.println();
                        System.out.println("Canavar size vurdu!");
                        int takenDamage =this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (takenDamage < 0){
                            takenDamage = 0;
                        }
                        int newHealth = this.getPlayer().getHealth() - takenDamage;
                        this.getPlayer().setHealth(newHealth);
                        afterHit();
                    }else{
                        if (this.getName().equals("Zindan")){
                            rewardFromSnake();
                        }
                        firstEncounter = true;
                    }
                }else {
                    return false;
                }
            }

            if (this.monster.getHealth() < this.getPlayer().getHealth()){
                System.out.println("Düşmanı Yendiniz!");
                // eğer yılansa burayı elle para kazandınız demesin eşya kazandınız desin tabi eğer kazandıysa ve o silahı istiyor musunuz istemiyor musunuz diye de sordur çünkü belki adamda daha iyisi var
                System.out.println(this.monster.getPrize() + " para kazandınız!");
                int newMoney = this.getPlayer().getMoney() + this.getMonster().getPrize();
                this.getPlayer().setMoney(newMoney);
                System.out.println("Güncel paranız: " + this.getPlayer().getMoney());
            }else {
                return false;
            }
        }

        return true ;
    }

    public void rewardFromSnake(){
        String reward = Dungeon.whichGonnaGet();
        String answer;
        switch (reward){
            case "Yok":
                System.out.println("Bu yılandan hiçbir şey bulamadın!");
                break;
            case "Tüfek":
                System.out.print("Bu yılandan tüfek kazandın! Bu tüfeği istiyor musun? İstiyorsan Y istemiyorsan N yaz: ");
                answer = scan.next().toUpperCase();
                if (answer.equals("Y")){
                    Weapon weapon = Weapon.getWeaponObjById(3);
                    this.getPlayer().getInventory().setWeapon(weapon);
                    System.out.println("Artık bir tüfeğin var!");
                }else {
                    System.out.println("Tamam, eski silahın duruyor!");
                }
                break;
            case "Kılıç":
                System.out.print("Bu yılandan kılıç kazandın! Bu kılıcı istiyor musun? İstiyorsan Y istemiyorsan N yaz: ");
                answer = scan.next().toUpperCase();
                if (answer.equals("Y")){
                    Weapon weapon = Weapon.getWeaponObjById(2);
                    this.getPlayer().getInventory().setWeapon(weapon);
                    System.out.println("Artık bir kılıcın var!");
                }else {
                    System.out.println("Tamam, eski silahın duruyor!");
                }
                break;
            case "Tabanca":
                System.out.print("Bu yılandan tabanca kazandın! Bu tabancayı istiyor musun? İstiyorsan Y istemiyorsan N yaz: ");
                answer = scan.next().toUpperCase();
                if (answer.equals("Y")){
                    Weapon weapon = Weapon.getWeaponObjById(1);
                    this.getPlayer().getInventory().setWeapon(weapon);
                    System.out.println("Artık bir tabancan var!");
                }else {
                    System.out.println("Tamam, eski silahın duruyor!");
                }
                break;
            case "Weapon Yok":
                System.out.println("Weapon gelmedi bir sorun var!");
                break;
            case "Ağır Zırh":
                System.out.print("Bu yılandan ağır zırh kazandın! Bu ağır zırhı istiyor musun? İstiyorsan Y istemiyorsan N yaz: ");
                answer = scan.next().toUpperCase();
                if (answer.equals("Y")){
                    Armor armor = Armor.getArmorObjById(3);
                    this.getPlayer().getInventory().setArmor(armor);
                    System.out.println("Artık bir ağır zırhın var!");
                }else {
                    System.out.println("Tamam, eski zırhın duruyor!");
                }
                break;
            case "Orta Zırh":
                System.out.print("Bu yılandan orta zırh kazandın! Bu orta zırhı istiyor musun? İstiyorsan Y istemiyorsan N yaz: ");
                answer = scan.next().toUpperCase();
                if (answer.equals("Y")){
                    Armor armor = Armor.getArmorObjById(2);
                    this.getPlayer().getInventory().setArmor(armor);
                    System.out.println("Artık bir orta zırhın var!");
                }else {
                    System.out.println("Tamam, eski zırhın duruyor!");
                }
                break;
            case "Hafif Zırh":
                System.out.print("Bu yılandan hafif zırh kazandın! Bu hafif zırhı istiyor musun? İstiyorsan Y istemiyorsan N yaz: ");
                answer = scan.next().toUpperCase();
                if (answer.equals("Y")){
                    Armor armor = Armor.getArmorObjById(1);
                    this.getPlayer().getInventory().setArmor(armor);
                    System.out.println("Artık bir hafif zırhın var!");
                }else {
                    System.out.println("Tamam, eski zırhın duruyor!");
                }
                break;
            case "Armor Yok":
                System.out.println("Armor gelmedi bir sorun var!!");
                break;
            case "10":
                System.out.println("Bu yılandan 10 altın kazandın!");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                break;
            case "5":
                System.out.println("Bu yılandan 5 altın kazandın!");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
                break;
            case "1":
                System.out.println("Bu yılandan 1 altın kazandın!");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
                break;
            case "0":

                break;
        }
    }

    public boolean isFirstHitMonster(){
        int randNumber = (int) (0 + Math.random() * 100);
        int indicatorNumber  = 50;

        if (randNumber < indicatorNumber){
            return true;
        }else {
            return false;

        }
    }

    public void afterHit(){
        System.out.println("Canınız: " + this.getPlayer().getHealth());
        System.out.println("Canavarın canı: " + monster.getHealth());
    }

    public void playerStats(){
        System.out.println("Oyuncu değerleri: ");
        System.out.println("Sağlık: " + this.getPlayer().getHealth());
        System.out.println("Hasar: " + this.getPlayer().getTotalDamage());
        System.out.println("Blok: " + this.getPlayer().getInventory().getArmor().getBlock());
    }

    public void monsterStats(int i){
        System.out.println(i + "." + " Düşmanın değerleri: ");
        System.out.println("Sağlık: " + this.getMonster().getHealth());
        System.out.println("Hasar: " + this.getMonster().getDamage());
        System.out.println("Ödül: " + this.getMonster().getPrize());
    }

    public int randomMonster(){
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1;
    }


    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
