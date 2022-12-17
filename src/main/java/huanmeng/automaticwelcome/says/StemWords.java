package huanmeng.automaticwelcome.says;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class StemWords implements Listener {
    Plugin plugin = huanmeng.automaticwelcome.AutomaticWelcome.getPlugin(huanmeng.automaticwelcome.AutomaticWelcome.class);
    @EventHandler
    public void StemWords(AsyncPlayerChatEvent say) {
        if (say.getMessage().contains("只因")){
            Player stem = say.getPlayer();
            say.setCancelled(plugin.getConfig().getBoolean("Stem"));
            stem.sendMessage(ChatColor.YELLOW +plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Stemalert"));
        }
        if (say.getMessage().contains("油饼食不食")){
            Player stem1 = say.getPlayer();
            say.setCancelled(plugin.getConfig().getBoolean("Stem"));
            stem1.sendMessage(ChatColor.YELLOW +plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Stemalert"));
        }
        if (say.getMessage().contains("蓝色妖姬")){
            Player stem2 = say.getPlayer();
            say.setCancelled(plugin.getConfig().getBoolean("Stem"));
            stem2.sendMessage(ChatColor.YELLOW +plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Stemalert"));
        }
        if (say.getMessage().contains("宇将军")){
            Player stem2 = say.getPlayer();
            say.setCancelled(plugin.getConfig().getBoolean("Stem"));
            stem2.sendMessage(ChatColor.YELLOW +plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Stemalert"));
        }
        if (say.getMessage().contains("半只狐狸")){
            Player stem2 = say.getPlayer();
            say.setCancelled(plugin.getConfig().getBoolean("Stem"));
            stem2.sendMessage(ChatColor.YELLOW +plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Stemalert"));
        }
        if (say.getMessage().contains("沈阳大街")){
            Player stem2 = say.getPlayer();
            say.setCancelled(plugin.getConfig().getBoolean("Stem"));
            stem2.sendMessage(ChatColor.YELLOW +plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Stemalert"));
        }
        if (say.getMessage().contains("jvav")){
            Player stem2 = say.getPlayer();
            say.setCancelled(plugin.getConfig().getBoolean("Stem"));
            stem2.sendMessage(ChatColor.YELLOW +plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Stemalert"));
        }
    }
}
