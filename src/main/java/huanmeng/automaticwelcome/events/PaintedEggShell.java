package huanmeng.automaticwelcome.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class PaintedEggShell implements Listener {
    Plugin plugin = huanmeng.automaticwelcome.AutomaticWelcome.getPlugin(huanmeng.automaticwelcome.AutomaticWelcome.class);
    @EventHandler
    public void PaintedEggShell(AsyncPlayerChatEvent egg){
        if (egg.getMessage().contains(Objects.requireNonNull(plugin.getConfig().getString("PaintEggWord-1")))) {
            Player egg1 = egg.getPlayer();
            egg1.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("EggCharacters") + ChatColor.WHITE + plugin.getConfig().getString("PEgg-one"));
        }
        if (egg.getMessage().contains(Objects.requireNonNull(plugin.getConfig().getString("PaintEggWord-2")))) {
            Player egg2 = egg.getPlayer();
            egg2.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("EggCharacters") + ChatColor.WHITE + plugin.getConfig().getString("PEgg-two"));
        }
    }
}
