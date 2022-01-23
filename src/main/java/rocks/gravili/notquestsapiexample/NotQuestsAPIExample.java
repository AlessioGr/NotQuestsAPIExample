package rocks.gravili.notquestsapiexample;

import org.bukkit.plugin.java.JavaPlugin;
import rocks.gravili.notquests.paper.NotQuests;

public final class NotQuestsAPIExample extends JavaPlugin {

    private NotQuests notQuestsInstance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        notQuestsInstance = NotQuests.getInstance();
        if(notQuestsInstance != null) { //For Spigot compatibility
            notQuestsInstance.getVariablesManager().registerVariable("FoodLevel", FoodLevelVariable.class);
            notQuestsInstance.getObjectiveManager().registerObjective("TakeDamage", TakeDamageObjective.class);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
