package dev.exponente;

import dev.exponente.commands.*;
import dev.exponente.utilities.CC;
import dev.exponente.utilities.command.CommandManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.configuration.serialization.ConfigurationSerialization;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

@Getter
public class JavaCommands extends JavaPlugin {

    private CommandManager commandManager;

    @Override
    public void onEnable() {
        this.commandManager = new CommandManager(this);
        new HelpCommand();
        getServer().getConsoleSender().sendMessage(CC.translate("&7"));
        getServer().getConsoleSender().sendMessage(CC.translate("&a Enabling your plugin"));
        getServer().getConsoleSender().sendMessage(CC.translate("&7"));
        getServer().getConsoleSender().sendMessage(CC.translate("&a Link: github.com/ExponenteDevs"));
        getServer().getConsoleSender().sendMessage(CC.translate("&7"));
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(CC.translate("&7"));
        getServer().getConsoleSender().sendMessage(CC.translate("&c Disabling your plugin"));
        getServer().getConsoleSender().sendMessage(CC.translate("&7"));
        getServer().getConsoleSender().sendMessage(CC.translate("&c Link: github.com/ExponenteDevs"));
        getServer().getConsoleSender().sendMessage(CC.translate("&7"));
    }
}