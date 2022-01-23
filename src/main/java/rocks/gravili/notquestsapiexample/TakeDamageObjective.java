package rocks.gravili.notquestsapiexample;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import rocks.gravili.notquests.paper.NotQuests;
import rocks.gravili.notquests.paper.structs.ActiveObjective;
import rocks.gravili.notquests.paper.structs.objectives.Objective;

public class TakeDamageObjective extends Objective {
    private final NotQuests main;

    public TakeDamageObjective(NotQuests main) {
        super(main);
        this.main = main;
    }

    @Override
    public String getObjectiveTaskDescription(Player player) {
        return null;
    }

    @Override
    public void save(FileConfiguration fileConfiguration, String initialPath) {

    }

    @Override
    public void load(FileConfiguration fileConfiguration, String initialPath) {

    }

    @Override
    public void onObjectiveUnlock(ActiveObjective activeObjective, boolean unlockedDuringPluginStartupQuestLoadingProcess) {

    }

    @Override
    public void onObjectiveCompleteOrLock(ActiveObjective activeObjective, boolean lockedOrCompletedDuringPluginStartupQuestLoadingProcess, boolean completed) {

    }
}
