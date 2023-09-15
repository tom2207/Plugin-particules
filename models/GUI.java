// 
// Decompiled by Procyon v0.5.36
// 

package fr.sintlewe.particules.models;

import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.inventory.Inventory;

public class GUI
{
    private static Inventory INV;
    
    public void register() {
        final Inventory inv = Bukkit.createInventory((InventoryHolder)null, 9, new StringBuilder().append(ChatColor.AQUA).append(ChatColor.BOLD).append("Particules").toString());
        ItemStack item = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Totem Particules");
        item.setItemMeta(meta);
        inv.setItem(3, item);
        item = new ItemStack(Material.CAMPFIRE);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Fire Particules");
        item.setItemMeta(meta);
        inv.setItem(5, item);
        this.setInventory(inv);
    }
    
    public Inventory getInventory() {
        return GUI.INV;
    }
    
    private void setInventory(final Inventory inv) {
        GUI.INV = inv;
    }
    
    public void openInventory(final Player player) {
        player.openInventory(GUI.INV);
    }
}
