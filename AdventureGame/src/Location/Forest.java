package Location;

import Main.Player;

public class Forest extends BattleLocation{

    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "Firewood",3);
    }
}
