package net.michal.github;

import net.michal.github.commands.HelpCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    static Main instance;

    public void onEnable() {
        instance = this;

        saveDefaultConfig();
        reloadConfig();

        getCommand("pomoc").setExecutor(new HelpCommand());
    }

    public static Main getInstance() {
        return instance;
    }
}