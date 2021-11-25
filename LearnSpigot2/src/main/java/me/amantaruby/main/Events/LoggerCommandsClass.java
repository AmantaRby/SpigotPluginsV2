package me.amantaruby.main.Events;

import me.amantaruby.main.RubyAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class LoggerCommandsClass implements Listener {

    private RubyAPI api;

    @EventHandler
    public void onLeave(PlayerJoinEvent event){
        Player p = event.getPlayer();
        api.gamePlayerJoin(p);
    }
}
