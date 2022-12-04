package huanmeng.automaticwelcome.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class PlayerJoinEvent implements Listener {
    Plugin plugin = huanmeng.automaticwelcome.AutomaticWelcome.getPlugin(huanmeng.automaticwelcome.AutomaticWelcome.class);
    @EventHandler
    public void PlayerJoinEvent(org.bukkit.event.player.PlayerJoinEvent join){
        Player player = join.getPlayer();
        player.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Tips"));
    }
}
