package es.stoneland.stonecore;

import es.stoneland.stonecore.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class StoneCore extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("test").setExecutor(new TestCommand());
        getLogger().info("StoneCore activado.");
    }

    @Override
    public void onDisable() {
        getLogger().info("StoneCore desactivado.");
    }
}
