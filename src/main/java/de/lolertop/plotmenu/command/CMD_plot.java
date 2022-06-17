package de.lolertop.plotmenu.command;

import de.lolertop.plotmenu.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class CMD_plot implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        Inventory inventory = Bukkit.createInventory(null , 9*3 , "§a§lPlotmenu");
        if (args.length == 0) {
            inventory.setItem(0, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(1, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(2, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(3, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(4, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(5, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(6, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(7, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            if (p.hasPermission("Citybuild.admin")) {
                inventory.setItem(8, (new ItemBuilder(Material.EMERALD_BLOCK)).setDisplayname("§4Admin").build());
            } else {
                inventory.setItem(8, (new ItemBuilder(Material.EMERALD_BLOCK)).setDisplayname("§cAuthor: §6loler§etop").build());
            }

            inventory.setItem(9, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(10, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(11, (new ItemBuilder(Material.BOOK)).setDisplayname("§2Biome").build());
            inventory.setItem(12, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(13, (new ItemBuilder(Material.ANVIL)).setDisplayname("§cPlotverwalten").build());
            inventory.setItem(14, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(15, (new ItemBuilder(Material.BEACON)).setDisplayname("§3Flags").build());
            inventory.setItem(16, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(17, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(18, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(19, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(20, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(21, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(22, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(23, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(24, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(25, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            inventory.setItem(26, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
            p.openInventory(inventory);
            p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BREAK, 4.0F, 4.0F);
        }
        return false;
    }
}
