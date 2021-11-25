package me.amantaruby.main.regen;

import me.amantaruby.main.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class regenClass implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("newheal")){
            if(!(sender instanceof Player)){
                sender.sendMessage("lol, k i'll health you console, then don't strees again ok.");
                return true;
            }
            Player p = (Player) sender;

            if(args.length == 0){
                if(p.getHealth() != 20){
                    p.setHealth(p.getHealth() + 1);
                    p.setFoodLevel(p.getFoodLevel() + 1);
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "DEVELOPER_MODE " + ChatColor.GREEN + "" + ChatColor.BOLD + " / Success Healing " + ChatColor.GOLD + "" + ChatColor.BOLD + p.getName());
                    return true;
                }else {
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "DEVELOPER_MODE " + ChatColor.RED + "" + ChatColor.BOLD + " / Failed To Healing " + ChatColor.GOLD + "" + ChatColor.BOLD + p.getName());
                }

                if(p.getFoodLevel() != 20){
                    p.setFoodLevel(p.getFoodLevel() + 1);
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "DEVELOPER_MODE " + ChatColor.GREEN + "" + ChatColor.BOLD + " / Success Healing " + ChatColor.GOLD + "" + ChatColor.BOLD + p.getName());
                    return true;
                }else {
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "DEVELOPER_MODE " + ChatColor.RED + "" + ChatColor.BOLD + " / Failed To Healing " + ChatColor.GOLD + "" + ChatColor.BOLD + p.getName());
                }
                return true;
            }
        }
        return false;
    }
}
