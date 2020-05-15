package es.stoneland.stonecore.listeners;

import es.stoneland.stonecore.StoneCore;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    private final StoneCore main;

    public JoinListener(StoneCore instance) {
        main = instance;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        main.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + event.getPlayer().getName() + " se ha conectado.");
    }
}
