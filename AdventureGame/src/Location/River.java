package Location;

import Main.Player;

public class River extends BattleLocation{
    public River(Player player) {
        super(player, "Nehir", new Bear(), "Water",2);
    }
}
