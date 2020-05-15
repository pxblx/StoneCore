package es.stoneland.stonecore.listeners;

import es.stoneland.stonecore.StoneCore;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    private final StoneCore main;

    public QuitListener(StoneCore instance) {
        main = instance;
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        main.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + event.getPlayer().getName() + " se ha desconectado.");
    }
}
