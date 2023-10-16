package Location;

import Main.Player;

public abstract class NormalLocation extends Location{

    public NormalLocation(Player p, String name){
        super(p , name);

    }


    @Override
    public boolean onLocation() {
        return true;
    }
}
