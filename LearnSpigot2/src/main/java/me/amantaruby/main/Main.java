package me.amantaruby.main;

import me.amantaruby.main.Events.EventsClass;
//import me.amantaruby.main.Events.EventsClick;
//import me.amantaruby.main.Events.TryEventsGui;
import me.amantaruby.main.Events.EventsClick;
import me.amantaruby.main.Events.EventsClickGuiSelector;
import me.amantaruby.main.commands.FlyCommands;
import me.amantaruby.main.commands.GUICommands;
import me.amantaruby.main.commands.regenCommand;
import me.amantaruby.main.regen.regenClass;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public RubyAPI rubyAPI;

    @Override
    public void onEnable() {
        // Plugin startup logic
        rubyAPI = new RubyAPI();
        getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "---LearnSpigot Plugin Has" + ChatColor.GREEN + " Enabled" + ChatColor.BLUE + "---");
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
        new FlyCommands(this);
        new regenCommand(this);
        getCommand("gui").setExecutor(new GUICommands());
//        getCommand("trygui").setExecutor(new TryEventsGui());
        getServer().getPluginManager().registerEvents(new EventsClick(), this);
//        getServer().getPluginManager().registerEvents(new TryEventsGui(), this);
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
        getServer().getPluginManager().registerEvents(new EventsClickGuiSelector(), this);
//        new EventsClickGuiSelector(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "---LearnSpigot Plugin Was" + ChatColor.RED + " DISABLED" + ChatColor.BLUE + "---");

    }


}



















