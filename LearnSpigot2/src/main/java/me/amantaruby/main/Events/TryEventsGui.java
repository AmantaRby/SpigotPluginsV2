//package me.amantaruby.main.Events;
//
//import org.bukkit.Bukkit;
//import org.bukkit.ChatColor;
//import org.bukkit.Material;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//import org.bukkit.event.EventHandler;
//import org.bukkit.event.Listener;
//import org.bukkit.event.inventory.InventoryClickEvent;
//import org.bukkit.event.inventory.InventoryDragEvent;
//import org.bukkit.inventory.Inventory;
//import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.meta.ItemMeta;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class TryEventsGui implements Listener, CommandExecutor {
//
//    private final Inventory inv;
//    private Player p;
//
//    public TryEventsGui() {
//        inv = Bukkit.createInventory(p,9,"Example");
//
//
//    }
//
//    public void initialItems(){
//        inv.addItem(createGuiItem(Material.DIAMOND_SWORD, "Example Sword", "§aFirst line of the lore", "§bSecond line of the lore"));
//        inv.addItem(createGuiItem(Material.IRON_HELMET, "§bExample Helmet", "§aFirst line of the lore", "§bSecond line of the lore"));
//        ItemStack suicide = new ItemStack(Material.TNT);
//        ItemStack feed = new ItemStack(Material.BREAD);
//        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
//    }
//
//    protected ItemStack createGuiItem(final Material material, final String name, final String... lore){
//        final ItemStack item = new ItemStack(material, 1);
//        final ItemMeta meta = item.getItemMeta();
//
//        ItemStack suicide = new ItemStack(Material.TNT);
//        ItemStack feed = new ItemStack(Material.BREAD);
//        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
//        ItemMeta suicide_meta = suicide.getItemMeta();
//        suicide_meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Suicide");
//
//        ArrayList<String> suicide_lore = new ArrayList<>();
//        suicide_lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Kill Yourslef");
//        suicide_meta.setLore(suicide_lore);
//        suicide.setItemMeta(suicide_meta);
//
//        ItemStack[] menu_items = {suicide, feed, sword};
//
//        inv.setContents(menu_items);
//
//        // Set the name of the item
//        meta.setDisplayName(name);
//
//        // Set the lore of the item
//        meta.setLore(Arrays.asList(lore));
//
//        item.setItemMeta(meta);
//
//        return item;
//    }
//
//
//    @Override
//    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//        if(sender instanceof Player){
//            Player p = (Player) sender;
//
//            p.openInventory(inv);
////            add return statment, if error
//        }
//
//        return false;
//    }
//
//    @EventHandler
//    public void onInventoryClick(final InventoryClickEvent e) {
//        if (e.getInventory() != inv) return;
//
//        e.setCancelled(true);
//
//        final ItemStack clickedItem = e.getCurrentItem();
//
//        // verify current item is not null
//        if (clickedItem == null || clickedItem.getType().isAir()) return;
//
//        final Player p = (Player) e.getWhoClicked();
//
//        // Using slots click is a best option for your inventory click's
//        p.sendMessage("You clicked at slot " + e.getRawSlot());
//    }
//    @EventHandler
//    void onInventoryClick(final InventoryDragEvent event){
//        if(event.getInventory().equals(inv)){
//            event.setCancelled(true);
//        }
//    }
//}
//
//
//
//
//
//
//
