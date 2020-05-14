package es.stoneland.stonecore.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage(ChatColor.YELLOW + "Funciona. Comando ejecutado por " + player.getName() + ".");
        } else {
            ConsoleCommandSender console = (ConsoleCommandSender) commandSender;
            console.sendMessage(ChatColor.YELLOW + "Funciona. Comando ejecutado por la consola.");
        }
        return true;
    }
}
