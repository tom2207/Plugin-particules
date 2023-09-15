// 
// Decompiled by Procyon v0.5.36
// 

package fr.sintlewe.particules.models;

import org.bukkit.Bukkit;
import java.util.HashMap;
import java.util.UUID;
import java.util.Map;

public class ParticuleData
{
    private static Map<UUID, Integer> PARTICULES;
    private final UUID uuid;
    
    static {
        ParticuleData.PARTICULES = new HashMap<UUID, Integer>();
    }
    
    public ParticuleData(final UUID uuid) {
        this.uuid = uuid;
    }
    
    public void setID(final int id) {
        ParticuleData.PARTICULES.put(this.uuid, id);
    }
    
    public int getID() {
        return ParticuleData.PARTICULES.get(this.uuid);
    }
    
    public boolean hasID() {
        return ParticuleData.PARTICULES.containsKey(this.uuid);
    }
    
    public void removeID() {
        ParticuleData.PARTICULES.remove(this.uuid);
    }
    
    public void endTask() {
        if (this.getID() == 1) {
            return;
        }
        Bukkit.getScheduler().cancelTask(this.getID());
    }
    
    public static boolean hasFakeID(final UUID uuid) {
        return ParticuleData.PARTICULES.containsKey(uuid) && ParticuleData.PARTICULES.get(uuid) == 1;
    }
}
