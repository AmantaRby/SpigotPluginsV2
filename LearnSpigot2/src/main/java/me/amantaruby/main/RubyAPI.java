package me.amantaruby.main;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public class RubyAPI {

    private Plugin plugin = Main.getPlugin(Main.class);

    public void gameStart(Player p, int i, Location loc){

    }

    public void gameStop(Player p, int i, Location loc){

    }

    public void gamePlayerLeave(Player p, Main plugin){
        plugin.getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "" + ChatColor.BOLD + "RubyAPI - Testing case API" + ChatColor.YELLOW + " gamePlayerLeave" + ChatColor.GRAY + "Result: " + ChatColor.GREEN + "True");
    }

    public void gamePlayerJoin(Player p){

        p.sendMessage(ChatColor.GRAY + "" + ChatColor.BOLD + "RubyAPI - Testing case API" + ChatColor.YELLOW + " gamePlayerLeave" + ChatColor.GRAY + "Result: " + ChatColor.GREEN + "True");
    }

    public void gamePlayerLeave(Player p) {
        plugin.getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "" + ChatColor.BOLD + "RubyAPI - Testing case API" + ChatColor.YELLOW + " gamePlayerLeave" + ChatColor.GRAY + "Result: " + ChatColor.GREEN + "True");
    }
}
