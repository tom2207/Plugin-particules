// 
// Decompiled by Procyon v0.5.36
// 

package fr.sintlewe.particules.evants;

import org.bukkit.event.EventHandler;
import fr.sintlewe.particules.models.Effects;
import fr.sintlewe.particules.models.ParticuleData;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import fr.sintlewe.particules.models.GUI;

public class ClickEvent
{
    private GUI menu;
    
    public ClickEvent() {
        this.menu = new GUI();
    }
    
    @EventHandler
    public void onClick(final InventoryClickEvent event) {
        if (!event.getInventory().equals(this.menu.getInventory())) {
            return;
        }
        final Player player = (Player)event.getWhoClicked();
        event.setCancelled(true);
        if (event.getView().getType() == InventoryType.PLAYER) {
            return;
        }
        final ParticuleData particle = new ParticuleData(player.getUniqueId());
        if (particle.hasID()) {
            particle.endTask();
            particle.removeID();
        }
        final Effects particules = new Effects(player);
        switch (event.getSlot()) {
            case 3: {
                particules.startTotem();
                player.closeInventory();
                player.updateInventory();
            }
        }
    }
}
