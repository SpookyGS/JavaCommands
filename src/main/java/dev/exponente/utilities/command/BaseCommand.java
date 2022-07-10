package dev.exponente.utilities.command;

import dev.exponente.JavaCommands;
import org.bukkit.command.CommandSender;

public abstract class BaseCommand {

    public BaseCommand() {
        StaffMode.get().getCommandManager().registerCommands(this);
    }

    public abstract boolean onCommand(CommandSender sender, Command command, String label, String[] args);

    public abstract void onCommand(CommandArgs command);
}
