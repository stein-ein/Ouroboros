package com.github.salihbasicm.sedexlives.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import com.github.salihbasicm.sedexlives.LivesUser;
import com.github.salihbasicm.sedexlives.SedexLives;

public class PlayerQuit implements Listener {

    private SedexLives plugin;

    public PlayerQuit(SedexLives plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        LivesUser user = new LivesUser(plugin, event.getPlayer());

        if (user.isToggledOff())
            user.setToggledOff(false);
    }

}
