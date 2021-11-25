package me.amantaruby.main.ACFly;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class ACFly implements Listener {

    @EventHandler
    public void onFly(PlayerMoveEvent event){
        Player p = event.getPlayer();

        if(p.isFlying()){
//            p.kickPlayer(ChatColor.RED + "You've been kicked bye system" + p.getName());
//            p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "LAC / " + ChatColor.RED + "" + ChatColor.BOLD + "DON'T TRYING TO FLYING OR BUG ABUSE!");
        }
    }

}
