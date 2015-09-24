package gg.uhc.firstjoinfixer;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class FirstJoinListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void on(PlayerJoinEvent event) {
        if (event.getPlayer().hasPlayedBefore()) return;

        // teleport to exact location of spawn on first join
        Player player = event.getPlayer();

        player.teleport(player.getWorld().getSpawnLocation());
    }
}
