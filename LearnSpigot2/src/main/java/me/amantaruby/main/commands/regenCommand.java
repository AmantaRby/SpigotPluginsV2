package me.amantaruby.main.commands;

import me.amantaruby.main.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class regenCommand implements CommandExecutor {
    private Main plugin;

    public regenCommand(Main plugin){
        this.plugin = plugin;

        plugin.getCommand("heal").setExecutor(this);
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("heal")){
            if(!(sender instanceof Player)){
                sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Only player may execute this command.");
                return true;
            }
            Player p = (Player) sender;

            if(args.length == 0){
//                if(p.getHealth() == 20 || p.getFoodLevel() == 20){
//                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "DEVELOPER_MODE" + ChatColor.GREEN + "" + ChatColor.BOLD + " /" + ChatColor.RED + "" + ChatColor.BOLD + " Failed to healing, your hearth was full.");
//                    p.setFoodLevel(20);
//                    return true;
//                } else {
//                    p.setFoodLevel(20);
//                    p.setHealth(20);
//                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "DEVELOPER_MODE" + ChatColor.GREEN + "" + ChatColor.BOLD + " /" + ChatColor.GREEN + " Success healing");
//                }

//                Alternate way
                if(p.getHealth() == 20 || (p.getFoodLevel() != 20)){
                    p.setFoodLevel(20);
                    p.setHealth(20);
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "DEVELOPER_MODE" + ChatColor.GREEN + "" + ChatColor.BOLD + " /" + ChatColor.GREEN + " Success healing");
                    return true;
                } else {
                    p.setHealth(20);
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "DEVELOPER_MODE" + ChatColor.GREEN + "" + ChatColor.BOLD + " /" + ChatColor.GREEN + " Success healing");
                }
//                if health and food is 20.
                if(p.getHealth() == 20 || p.getFoodLevel() == 20){
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "DEVELOPER_MODE" + ChatColor.GREEN + "" + ChatColor.BOLD + " /" + ChatColor.RED + "" + ChatColor.BOLD + " Failed to healing, your hearth was full.");
                    return true;
                }

                if(p.getFoodLevel() == 20){
                    return true;
                } else {
                    p.sendMessage(ChatColor.GRAY + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "Testing plugin regen alternate way works.");
                }
                if(p.getFoodLevel() == 20 || !(p.getHealth() != 20)){
                    p.setHealth(20);
                    return true;
                }

            }
        }


        return false;
    }
}
