// 
// Decompiled by Procyon v0.5.36
// 

package fr.sintlewe.particules.commands;

import org.bukkit.inventory.Inventory;
import fr.sintlewe.particules.models.GUI;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class Trail implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!label.equalsIgnoreCase("particules")) {
            return false;
        }
        if (!(sender instanceof Player)) {
            sender.sendMessage("Vous ne povez pas fait cela !");
            return true;
        }
        final Player player = (Player)sender;
        final GUI gui = new GUI();
        player.openInventory((Inventory)player);
        return true;
    }
}
