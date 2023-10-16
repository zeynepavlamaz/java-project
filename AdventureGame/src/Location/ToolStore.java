package Location;

import Characters.Archer;
import Characters.Armor;
import Main.Player;
import Tools.Weapon;

import java.util.Scanner;

public class ToolStore extends NormalLocation{
    public ToolStore(Player p) {
        super(p, "Mağaza");
    }
    protected Scanner scan = new Scanner(System.in);

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz!");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminiz: ");
            int selectTool = scan.nextInt();
            while (selectTool < 1 || selectTool > 3){
                System.out.print("Geçersiz bir değer girdiniz lütfen tekrar giriniz: ");
                selectTool = scan.nextInt();
            }

            switch (selectTool){
                case 1:
                    printWeapon();
                    break;
                case 2:
                    printArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz!");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }


    public void printArmor(){
        System.out.println("---------- Zırhlar ----------");
        System.out.println();
        for (Armor a: Armor.armors()) {
            System.out.println("ID: " + a.getId() + " " + a.getName() + " Fiyat: " + a.getPrice() + " Blok: " + a.getBlock());
        }

        System.out.println("0 - Çıkış yap!");

        buyArmor();

    }

    public void buyArmor(){
        System.out.print("Almak istediğiniz zırhı seçiniz: ");
        int armorChoose = scan.nextInt();

        while (armorChoose < 0 || armorChoose > Armor.armors().length){
            System.out.print("Geçersiz bir değer girdiniz lütfen tekrar giriniz: ");
            armorChoose = scan.nextInt();
        }
        if (armorChoose != 0){
            Armor selectedArmor = Armor.getArmorObjById(armorChoose);
            if (selectedArmor != null){
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır!");
                }else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız! Bakiyenizden " + selectedArmor.getPrice() + " miktarında para alındı!");
                    int newMoney = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(newMoney);
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);

                }
            }
        }
    }


    public void printWeapon(){
        System.out.println("---------- Silahlar ----------");
        System.out.println();
        for (Weapon w: Weapon.weapons()) {
            System.out.println("ID: " + w.getId() + " " + w.getName() + " Fiyat: " + w.getPrice() + " Hasar: " + w.getDamage());
        }
        System.out.println("0 - Çıkış yap!");
        buyWeapon();

    }

    public void buyWeapon(){
        System.out.print("Almak istediğiniz silahı seçiniz: ");
        int weaponChoose = scan.nextInt();

        while (weaponChoose < 0 || weaponChoose > Weapon.weapons().length){
            System.out.print("Geçersiz bir değer girdiniz lütfen tekrar giriniz: ");
            weaponChoose = scan.nextInt();
        }

        if (weaponChoose != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(weaponChoose);
            if (selectedWeapon != null){
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır!");
                }else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız! Bakiyenizden " + selectedWeapon.getPrice() + " miktarında para alındı!");
                    int newMoney = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(newMoney);
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                }
            }
        }
    }
}
