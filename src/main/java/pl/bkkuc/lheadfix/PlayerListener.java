package pl.bkkuc.lheadfix;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e){
        if(e.getItem() == null || e.getItem().getType() == Material.AIR) return;

        ItemStack item = e.getItem();
        if(item.getType() == Material.PLAYER_HEAD){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e){
        if(e.getBlock().getType() == Material.PLAYER_HEAD) e.setCancelled(true);
    }
}
