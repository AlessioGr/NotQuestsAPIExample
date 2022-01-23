package rocks.gravili.notquestsapiexample;

import org.bukkit.entity.Player;
import rocks.gravili.notquests.paper.NotQuests;
import rocks.gravili.notquests.paper.structs.variables.Variable;

import java.util.List;

public class FoodLevelVariable extends Variable<Integer> {
    private final NotQuests main;

    public FoodLevelVariable(NotQuests main) {
        super(main);
        this.main = main;
        setCanSetValue(true);
    }

    @Override
    public Integer getValue(Player player, Object... objects) {
        return player.getFoodLevel();
    }

    @Override
    public boolean setValueInternally(Integer integer, Player player, Object... objects) {
        player.setFoodLevel(integer);
        return true;
    }

    @Override
    public List<String> getPossibleValues(Player player, Object... objects) {
        return null;
    }

    @Override
    public String getPlural() {
        return "Food level";
    }

    @Override
    public String getSingular() {
        return "Food levels";
    }
}
