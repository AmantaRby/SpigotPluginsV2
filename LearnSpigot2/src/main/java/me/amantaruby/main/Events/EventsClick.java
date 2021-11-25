package me.amantaruby.main.Events;

import me.amantaruby.main.commands.GUICommands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EventsClick implements Listener {


    @EventHandler
    public void clickEvent(InventoryClickEvent e){
        if(e.getInventory().getTitle().equalsIgnoreCase(ChatColor.AQUA + "" + ChatColor.BOLD + "Custom GUI")){
            Player p = (Player) e.getWhoClicked();
            switch (e.getCurrentItem().getType()){
                case TNT:
                    p.closeInventory();
                    p.setHealth(0.0);
                    break;
                case BREAD:
                    p.closeInventory();
                    p.setFoodLevel(20);
                    break;
                case DIAMOND_SWORD:
                    p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
                    break;
            }

            e.setCancelled(true);
        }

        if(e.getInventory().getTitle().equalsIgnoreCase(ChatColor.YELLOW + "" + "Server Selector")){
            e.setCancelled(true);
        }

    }
}












