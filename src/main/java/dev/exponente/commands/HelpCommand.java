package dev.exponente.objects.staff.commands;

import org.bukkit.command.CommandExecutor;
import dev.exponente.utilities.CC;
import dev.exponente.utilities.command.BaseCommand;
import dev.exponente.utilities.command.Command;
import dev.exponente.utilities.command.CommandArgs;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class HelpCommand extends BaseCommand {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

    @Command(name = "java")
    @Override
    public void onCommand(CommandArgs cmd) {
        Player player = cmd.getPlayer();
        if (cmd.getSender() instanceof Player) {
                player.sendMessage(CC.translate("&7&m---------------------------------------------"));
                player.sendMessage(CC.translate(""));
                player.sendMessage(CC.translate(" &f/help &7- &fServer information"));
                player.sendMessage(CC.translate(" &fChange this at HelpCommand.java"));
                player.sendMessage(CC.translate(""));
                player.sendMessage(CC.translate("&7&m---------------------------------------------"));
                return;
            }
        }
    }