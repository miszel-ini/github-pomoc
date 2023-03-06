package net.michal.github.commands;

import net.michal.github.Main;
import net.michal.github.helper.ChatHelper;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {

    protected Main instance;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player = (Player) sender;

        ChatHelper.sendChatMessages(player, instance.getConfig().getStringList("pomoc"));

        return false;
    }
}
