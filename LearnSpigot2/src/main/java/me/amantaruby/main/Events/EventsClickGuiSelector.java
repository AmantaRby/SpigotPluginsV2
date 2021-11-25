package me.amantaruby.main.Events;

import me.amantaruby.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class EventsClickGuiSelector implements Listener {

    private Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        Player p = event.getPlayer();
        Action action = event.getAction();
        Block block = event.getClickedBlock();

        if(action.equals(Action.RIGHT_CLICK_AIR)){
            if(p.getInventory().getItemInHand().getType() == Material.COMPASS){

                Inventory inv;

                p.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Testing work compass detection Action.");
                plugin.getServer().getConsoleSender().sendMessage("someone has opened the GUI");

//                this.plugin.getLogger().info("TEST");
//                this.plugin.getLogger().info("case-work");

                Inventory GUI = Bukkit.createInventory(p,54, ChatColor.YELLOW + "" + "Server Selector");

                ItemStack suicide = new ItemStack(Material.TNT);
                ItemStack feed = new ItemStack(Material.BREAD);
                ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
                ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE);
                ItemStack FireballAllServer = new ItemStack(Material.DIAMOND_SWORD);

//              ------------------------------------------------------------------------------------------------
                ItemMeta FireballAllServerMETA = FireballAllServer.getItemMeta();
                FireballAllServerMETA.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "All Servers");
                FireballAllServer.setItemMeta(FireballAllServerMETA);

                ItemMeta glassMeta = glass.getItemMeta();
                glassMeta.setDisplayName(ChatColor.RED + "Custom Name");
                glass.setItemMeta(glassMeta);

                ItemMeta suicide_meta = suicide.getItemMeta();
                suicide_meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Suicide");

                ItemMeta glass_meta = glass.getItemMeta();
                glass_meta.setDisplayName("TESTING");

//              ------------------ARRAY LIST TNT-------------------------------------
                ArrayList<String> suicide_lore = new ArrayList<>();
                suicide_lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Kill Yourslef");
                suicide_meta.setLore(suicide_lore);
                suicide.setItemMeta(suicide_meta);

                //              ------------------LORE_GLASS_ARRAY_LIST-------------------------------------
                ArrayList<String> glass_lore = new ArrayList<>();
                glass_lore.add("TESTING_LORE");
                glass_meta.setLore(glass_lore);
                glass.setItemMeta(glass_meta);

                //              ------------------FIREBALL_ALL_SERVER-------------------------------------
                ArrayList<String> fireball_lore = new ArrayList<>();
                fireball_lore.add(ChatColor.GRAY + "" + ChatColor.BOLD + "Show all servers");
                FireballAllServerMETA.setLore(fireball_lore);
                FireballAllServer.setItemMeta(FireballAllServerMETA);

//                ItemStack[] menu_items = {feed, suicide, sword, glass};

//                GUI.setItem(2, suicide);
                GUI.setItem(1,glass);
                GUI.setItem(10,glass);
                GUI.setItem(19,glass);
                GUI.setItem(28,glass);
                GUI.setItem(37,glass);
                GUI.setItem(46,glass);
//                GUI.setContents(menu_items);
                GUI.setItem(0, FireballAllServer);
                p.openInventory(GUI);


            }
        }
        if(action.equals(Action.RIGHT_CLICK_BLOCK)){
            if(p.getInventory().getItemInHand().getType() == Material.COMPASS){
                p.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Testing work compass detection Action | Left click Block: " + ChatColor.RED + "" + ChatColor.BOLD + "" + block.getType().toString().toUpperCase());
            }
        }
    }
}
