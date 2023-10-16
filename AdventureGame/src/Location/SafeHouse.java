package Location;

import Main.Player;

public class SafeHouse extends NormalLocation{

    public SafeHouse(Player p) {
        super(p, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz. Canınız yenilendi !");
        this.getPlayer().setHealth(this.getPlayer().getOgHealth());
        return true;
    }
}
