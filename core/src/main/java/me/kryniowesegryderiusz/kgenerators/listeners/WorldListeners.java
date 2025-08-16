package me.kryniowesegryderiusz.kgenerators.listeners;

import me.kryniowesegryderiusz.kgenerators.Main;
import org.bukkit.Chunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldUnloadEvent;

public class WorldListeners implements Listener {
    @EventHandler
    public void onWorldUnload(WorldUnloadEvent e) {
        for(Chunk chunk : e.getWorld().getLoadedChunks()) {
            Main.getPlacedGenerators().unloadChunk(chunk);
        }
    }
}
