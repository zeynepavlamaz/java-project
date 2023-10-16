package Characters;

import Main.Items;

public class Armor extends Items {
    private int id, block,price;
    private String name;

    public Armor(int id, int block, int price, String name) {
        this.id = id;
        this.block = block;
        this.price = price;
        this.name = name;
    }

    public static Armor[] armors(){
        Armor[] armors = new Armor[3];
        armors[0] = new Armor(1, 2, 20, "Hafif");
        armors[1] = new Armor(2, 4, 35, "Orta");
        armors[2] = new Armor(3, 8, 70, "Ağır");

        return armors;
    }

    public static Armor getArmorObjById(int id){
        for (Armor a: Armor.armors()){
            if (a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
