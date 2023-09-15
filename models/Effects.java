// 
// Decompiled by Procyon v0.5.36
// 

package fr.sintlewe.particules.models;

import org.bukkit.plugin.Plugin;
import org.bukkit.Particle;
import org.bukkit.Location;
import fr.sintlewe.particules.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Effects
{
    private int taskID;
    private final Player player;
    
    public Effects(final Player player) {
        this.player = player;
    }
    
    public void startTotem() {
        this.taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin)Main.getPlugin((Class)Main.class), (Runnable)new Runnable() {
            double var = 0.0;
            Location loc;
            Location first;
            Location second;
            ParticuleData particle = new ParticuleData(Effects.this.player.getUniqueId());
            
            @Override
            public void run() {
                if (!this.particle.hasID()) {
                    this.particle.setID(Effects.this.taskID);
                }
                this.var += 0.19634954084936207;
                this.loc = Effects.this.player.getLocation();
                this.first = this.loc.clone().add(Math.cos(this.var), Math.sin(this.var) + 1.0, Math.sin(this.var));
                this.second = this.loc.clone().add(Math.cos(this.var + 3.141592653589793), Math.sin(this.var) + 1.0, Math.sin(this.var + 3.141592653589793));
                Effects.this.player.getWorld().spawnParticle(Particle.TOTEM, this.first, 0);
                Effects.this.player.getWorld().spawnParticle(Particle.TOTEM, this.second, 0);
            }
        }, 0L, 1L);
    }
}
