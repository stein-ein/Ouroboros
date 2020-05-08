package listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import sedexlives.LivesUser;
import sedexlives.SedexLives;

public class PlayerQuit implements Listener {

    private SedexLives plugin = SedexLives.getSedexLives();

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        LivesUser user = new LivesUser(plugin, event.getPlayer());

        if (user.isToggledOff())
            user.setToggledOff(false);
    }

}
