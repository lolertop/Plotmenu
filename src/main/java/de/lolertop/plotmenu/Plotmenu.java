package de.lolertop.plotmenu;

import de.lolertop.plotmenu.command.CMD_plot;
import de.lolertop.plotmenu.event.InventarPlotmenu;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plotmenu extends JavaPlugin {

    public static String prefix = "§aPlotmenu §8| §7";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§7------------------------------");
        Bukkit.getConsoleSender().sendMessage("§7Name: §c§lPlotmenu");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7Plugin: §aOnline");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7Es gibt Fehler schreib mir mein discord: lolertop#9891");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7Author: §clolertop");
        Bukkit.getConsoleSender().sendMessage("§7------------------------------");

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new InventarPlotmenu() , this);

        getCommand("p").setExecutor(new CMD_plot());
        getCommand("plot").setExecutor(new CMD_plot());
        getCommand("plotmenu").setExecutor(new CMD_plot());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
