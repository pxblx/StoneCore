package es.stoneland.stonecore;

import es.stoneland.stonecore.commands.TestCommand;
import es.stoneland.stonecore.listeners.JoinListener;
import es.stoneland.stonecore.listeners.QuitListener;
import org.bukkit.plugin.java.JavaPlugin;

public class StoneCore extends JavaPlugin {

    public static StoneCore instance;

    @Override
    public void onEnable() {
        instance = this;
        getCommand("test").setExecutor(new TestCommand());
        getServer().getPluginManager().registerEvents(new JoinListener(instance), instance);
        getServer().getPluginManager().registerEvents(new QuitListener(instance), instance);
        getLogger().info("StoneCore activado correctamente.");
    }

    @Override
    public void onDisable() {
        getLogger().info("StoneCore desactivado correctamente.");
    }
}
