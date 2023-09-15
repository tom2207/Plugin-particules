// 
// Decompiled by Procyon v0.5.36
// 

package fr.sintlewe.particules.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.command.CommandExecutor;
import fr.sintlewe.particules.commands.Trail;
import org.bukkit.plugin.Plugin;
import fr.sintlewe.particules.evants.ClickEvent;
import org.bukkit.event.Listener;
import fr.sintlewe.particules.models.GUI;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public void onEnable() {
        final GUI menu = new GUI();
        menu.register();
        final PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents((Listener)new ClickEvent(), (Plugin)this);
        this.getCommand("particules").setExecutor((CommandExecutor)new Trail());
    }
    
    public void onDisable() {
    }
}
