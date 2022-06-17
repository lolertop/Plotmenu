package de.lolertop.plotmenu.event;

import de.lolertop.plotmenu.Plotmenu;
import de.lolertop.plotmenu.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class InventarPlotmenu implements Listener {

    @EventHandler
    public void onInventory(InventoryClickEvent e) {
        Inventory inventory = Bukkit.createInventory(null, 45, "§2Biome");
        Inventory inventory1 = Bukkit.createInventory(null, 45, "§3Flags");
        Inventory inventory2 = Bukkit.createInventory(null, 27, "§cPlotverwalten");
        Inventory inventory3 = Bukkit.createInventory(null, 27, "§4Admin");
        if (e.getCurrentItem() == null) return;
        if (e.getView().getTitle() == "§a§lPlotmenu") {
            Player p = (Player) e.getWhoClicked();
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                    case "§2Biome":
                        inventory.setItem(0, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(1, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(2, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(3, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(4, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(5, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(6, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(7, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(8, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(9, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(10, (new ItemBuilder(Material.JUNGLE_LOG)).setDisplayname("§2§lJungle").build());
                        inventory.setItem(11, (new ItemBuilder(Material.GRASS)).setDisplayname("§a§lEbene").build());
                        inventory.setItem(12, (new ItemBuilder(Material.NETHERRACK)).setDisplayname("§c§lNether").build());
                        inventory.setItem(13, (new ItemBuilder(Material.SAND)).setDisplayname("§6§lWüste").build());
                        inventory.setItem(14, (new ItemBuilder(Material.COARSE_DIRT)).setDisplayname("§7§lTaiger").build());
                        inventory.setItem(15, (new ItemBuilder(Material.ICE)).setDisplayname("§f§lIce").build());
                        inventory.setItem(16, (new ItemBuilder(Material.BIRCH_LOG)).setDisplayname("§b§lBirken Wald").build());
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
                        inventory.setItem(27, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(28, (new ItemBuilder(Material.LILY_PAD)).setDisplayname("§a§lSumpf").build());
                        inventory.setItem(29, (new ItemBuilder(Material.RED_MUSHROOM)).setDisplayname("§4§lPilz Inseln").build());
                        inventory.setItem(30, (new ItemBuilder(Material.TROPICAL_FISH)).setDisplayname("§9§lOzean").build());
                        inventory.setItem(31, (new ItemBuilder(Material.SUGAR_CANE)).setDisplayname("§6Strand").build());
                        inventory.setItem(32, (new ItemBuilder(Material.ACACIA_LOG)).setDisplayname("§5Savanna").build());
                        inventory.setItem(33, (new ItemBuilder(Material.EMERALD)).setDisplayname("§8§lExtreme Berge").build());
                        inventory.setItem(34, (new ItemBuilder(Material.OAK_LOG)).setDisplayname("§2§lWald").build());
                        inventory.setItem(35, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(36, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(37, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(38, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(39, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(40, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(41, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(42, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(43, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory.setItem(44, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        p.openInventory(inventory);
                        p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 4.0F, 4.0F);
                        break;
                    case "§cPlotverwalten":
                        inventory2.setItem(0, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(1, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(2, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(3, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(4, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(5, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(6, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(7, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(8, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(9, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(10, (new ItemBuilder(Material.REDSTONE_BLOCK)).setDisplayname("§4Lösche dein Grundstück").build());
                        inventory2.setItem(11, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(12, (new ItemBuilder(Material.REDSTONE)).setDisplayname("§cLeere dein Grundstück").build());
                        inventory2.setItem(13, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(14, (new ItemBuilder(Material.GRASS_BLOCK)).setDisplayname("§aClaim ein Grundstück").build());
                        inventory2.setItem(15, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(16, (new ItemBuilder(Material.GREEN_GLAZED_TERRACOTTA)).setDisplayname("§2Claim dir ein random Grundstück").build());
                        inventory2.setItem(17, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(18, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(19, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(20, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(21, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(22, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(23, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(24, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(25, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory2.setItem(26, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        p.openInventory(inventory2);
                        p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 4.0F, 4.0F);
                        break;
                    case "§3Flags":
                        inventory1.setItem(0, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(1, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(2, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(3, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(4, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(5, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(6, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(7, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(8, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(9, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(10, (new ItemBuilder(Material.DIAMOND_SWORD)).setDisplayname("§aPVP an").build());
                        inventory1.setItem(11, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(12, (new ItemBuilder(Material.CHEST)).setDisplayname("§aRedstone-truhe an").build());
                        inventory1.setItem(13, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(14, (new ItemBuilder(Material.TNT)).setDisplayname("§aTNT an").build());
                        inventory1.setItem(15, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(16, (new ItemBuilder(Material.GRAY_GLAZED_TERRACOTTA)).setDisplayname("§aNachichten an").build());
                        inventory1.setItem(17, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(18, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(19, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(20, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(21, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(22, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(23, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(24, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(25, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(26, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(27, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(28, (new ItemBuilder(Material.STONE_SWORD)).setDisplayname("§cPVP aus").build());
                        inventory1.setItem(29, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(30, (new ItemBuilder(Material.CHEST)).setDisplayname("§cRedstone-truhe aus").build());
                        inventory1.setItem(31, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(32, (new ItemBuilder(Material.TNT)).setDisplayname("§cTNT aus").build());
                        inventory1.setItem(33, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(34, (new ItemBuilder(Material.GRAY_GLAZED_TERRACOTTA)).setDisplayname("§cNachichten aus").build());
                        inventory1.setItem(35, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(36, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(37, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(38, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(39, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(40, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(41, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(42, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(43, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory1.setItem(44, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        p.openInventory(inventory1);
                        p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 4.0F, 4.0F);
                        break;
                    case "§4Admin":
                        inventory3.setItem(0, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(1, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(2, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(3, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(4, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(5, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(6, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(7, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(8, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(9, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(10, (new ItemBuilder(Material.IRON_SWORD)).setDisplayname("§2Merge denn Grundstück").build());
                        inventory3.setItem(11, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(12, (new ItemBuilder(Material.REDSTONE_BLOCK)).setDisplayname("§4Setzt dich als Owner vom Grundstück").build());
                        inventory3.setItem(13, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(14, (new ItemBuilder(Material.BARRIER)).setDisplayname("§c§lKOMMT NOCH").build());
                        inventory3.setItem(15, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(16, (new ItemBuilder(Material.BARRIER)).setDisplayname("§c§lKOMMT NOCH").build());
                        inventory3.setItem(17, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(18, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(19, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(20, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(21, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(22, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(23, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(24, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(25, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        inventory3.setItem(26, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        p.openInventory(inventory3);
                        p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 4.0F, 4.0F);
                        break;
                }
            }
        }
    }

    @EventHandler
    public void onInventory1(InventoryClickEvent e) {
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§4Admin") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                        case "§4Setzt dich als Owner vom Grundstück":
                            p.performCommand("plots merge");
                            p.sendMessage(Plotmenu.prefix + "§7Du hast nun diese Grundstück gemergst");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                        case "§2Merge denn Grundstück":
                            p.performCommand("plots setowner " + p.getName());
                            p.sendMessage(Plotmenu.prefix + "§7Du hast nun denn Grundstück");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInventory2(InventoryClickEvent e) {
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§cWillst du wirklich ein random Grundstück") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                        case "§2Ja ich will ein random Grundstück":
                            p.performCommand("plots auto");
                            p.sendMessage(Plotmenu.prefix + "§7Du hast nun ein random Grundstück");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInventory3(InventoryClickEvent e) {
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§2Biome") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                        case "§6Strand":
                            p.performCommand("plots setbiome beach");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Strand biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§b§lBirken Wald":
                            p.performCommand("plots setbiome birch_forest");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Birken Wald biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§8§lExtreme Berge":
                            p.performCommand("plots setbiome stone_shore");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Extreme Berge biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§7§lTaiger":
                            p.performCommand("plots setbiome taiga");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Taiger biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§6§lWüste":
                            p.performCommand("plots setbiome Desert");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Wüste biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§2§lJungle":
                            break;
                        case "§5Savanna":
                            p.performCommand("plots setbiome savanna");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Savanna biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§9§lOzean":
                            p.performCommand("plots setbiome deep_ozean");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Ozean biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§f§lIce":
                            p.performCommand("plots setbiome ice_spikes");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Ice biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§2§lWald":
                            p.performCommand("plots setbiome dark_forest");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Wald biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§4§lPilz Inseln":
                            p.performCommand("plots setbiome mushroom_field_shore");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Pilz Inseln biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§c§lNether":
                            p.performCommand("plots setbiome nether_wastes");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Nether biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§a§lEbene":
                            p.performCommand("plots setbiome plains");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Ebene biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                        case "§a§lSumpf":
                            p.performCommand("plots setbiome swamp");
                            p.sendMessage(Plotmenu.prefix + "§7Dein Grundstück wurde zu Sumpf biom geandert");
                            p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 4.0F, 4.0F);
                            break;
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInventory4(InventoryClickEvent e) {
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§cWillst du wirklich diesen Grundstück Claimen") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                        case "§2Ja ich will diesen Grundstück Claimen":
                            p.performCommand("plots claim");
                            p.sendMessage(Plotmenu.prefix + "§7Du hast nun diesen Grundstück");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInventory5(InventoryClickEvent e) {
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§cWillst du wirklich dein Grundstück clearen") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                        case "§2Ja ich will mein Grundstück Leeren":
                            p.performCommand("plots clear confirm");
                            p.sendMessage(Plotmenu.prefix + "§7Du hast nun dein Grundstück geleert");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInventory6(InventoryClickEvent e) {
        Inventory inventory3 = Bukkit.createInventory(null, 9, "§cWillst du wirklich dein Grundstück löschen");
        Inventory inventory4 = Bukkit.createInventory(null, 9, "§cWillst du wirklich dein Grundstück clearen");
        Inventory inventory5 = Bukkit.createInventory(null, 9, "§cWillst du wirklich diesen Grundstück Claimen");
        Inventory inventory6 = Bukkit.createInventory(null, 9, "§cWillst du wirklich ein random Grundstück");
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§cPlotverwalten") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                        case "§4Lösche dein Grundstück":
                            inventory3.setItem(0, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory3.setItem(1, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory3.setItem(2, (new ItemBuilder(Material.REDSTONE_BLOCK)).setDisplayname("§cNein ich werde mein Grundstück nicht Löschen").build());
                            inventory3.setItem(3, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory3.setItem(4, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory3.setItem(5, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory3.setItem(6, (new ItemBuilder(Material.EMERALD_BLOCK)).setDisplayname("§2Ja ich will mein Grundstück Löschen").build());
                            inventory3.setItem(7, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory3.setItem(8, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            p.openInventory(inventory3);
                            break;
                        case "§cLeere dein Grundstück":
                            inventory4.setItem(0, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory4.setItem(1, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory4.setItem(2, (new ItemBuilder(Material.REDSTONE_BLOCK)).setDisplayname("§cNein ich werde mein Grundstück nicht Leeren").build());
                            inventory4.setItem(3, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory4.setItem(4, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory4.setItem(5, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory4.setItem(6, (new ItemBuilder(Material.EMERALD_BLOCK)).setDisplayname("§2Ja ich will mein Grundstück Leeren").build());
                            inventory4.setItem(7, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory4.setItem(8, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            p.openInventory(inventory4);
                            break;
                        case "§aClaim ein Grundstück":
                            inventory5.setItem(0, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory5.setItem(1, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory5.setItem(2, (new ItemBuilder(Material.REDSTONE_BLOCK)).setDisplayname("§cNein ich will diesen Grundstück nicht Claimen").build());
                            inventory5.setItem(3, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory5.setItem(4, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory5.setItem(5, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory5.setItem(6, (new ItemBuilder(Material.EMERALD_BLOCK)).setDisplayname("§2Ja ich will diesen Grundstück Claimen").build());
                            inventory5.setItem(7, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory5.setItem(8, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            p.openInventory(inventory5);
                            break;
                        case "§2Claim dir ein random Grundstück":
                            inventory6.setItem(0, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory6.setItem(1, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory6.setItem(2, (new ItemBuilder(Material.REDSTONE_BLOCK)).setDisplayname("§cNein ich will kein random Grundstück").build());
                            inventory6.setItem(3, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory6.setItem(4, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory6.setItem(5, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory6.setItem(6, (new ItemBuilder(Material.EMERALD_BLOCK)).setDisplayname("§2Ja ich will ein random Grundstück").build());
                            inventory6.setItem(7, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            inventory6.setItem(8, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            p.openInventory(inventory6);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInventor7(InventoryClickEvent e) {
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§3Flags") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {

                        case "§aTNT aus":
                            p.performCommand("plots flag add explosion false");
                            p.sendMessage(Plotmenu.prefix + "§cTnT ist nun bei dein Grundstück aus");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                        case "§cRedstone-truhe aus":
                            p.performCommand("plots flag add pvp false");
                            p.sendMessage(Plotmenu.prefix + "§cRedstone-truhen ist nun bei dein Grundstück aus");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                        case "§cPVP aus":
                            p.performCommand("plots flag add pvp false");
                            p.sendMessage(Plotmenu.prefix + "§cPVP ist nun bei dein Grundstück aus");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                        case "§aNachichten aus":
                            p.performCommand("plots flag add notify-enter false");
                            p.performCommand("plots flag add notify-leave false");
                            p.sendMessage(Plotmenu.prefix + "§cNachichten ist nun bei dein Grundstück aus");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                        case "§aRedstone-truhe an":
                            p.performCommand("plots flag add pvp true");
                            p.sendMessage(Plotmenu.prefix + "§2Redstone-truhen ist nun bei dein Grundstück an");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                        case "§aPVP an":
                            p.performCommand("plots flag add pvp true");
                            p.sendMessage(Plotmenu.prefix + "§2PVP ist nun bei dein Grundstück an");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                        case "§aTNT an":
                            p.performCommand("plots flag add explosion true");
                            p.sendMessage(Plotmenu.prefix + "§2TnT ist nun bei dein Grundstück an");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                        case "§aNachichten an":
                            p.performCommand("plots flag add notify-enter true");
                            p.performCommand("plots flag add notify-leave true");
                            p.sendMessage(Plotmenu.prefix + "§2Nachichten ist nun bei dein Grundstück an");
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_HURT, 4.0F, 4.0F);
                            break;
                    }
                }
            }
        }
    }
}