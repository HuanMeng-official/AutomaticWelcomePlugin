package huanmeng.mengpluginx.Worlds;

import huanmeng.mengpluginx.MengPluginX;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class StemWords implements Listener {
    Plugin plugin = MengPluginX.getPlugin(MengPluginX.class);

    private static final String[] list = {"只因", "油饼食不食", "蓝色妖姬", "宇将军", "半只狐狸", "沈阳大街", "jvav", "jave"};

    @EventHandler
    public void StemWords(AsyncPlayerChatEvent say) {
        for(String i: list){
            if(say.getMessage().contains(i)){
                say.setCancelled(plugin.getConfig().getBoolean("Stem"));
                say.getPlayer().sendMessage(ChatColor.YELLOW +plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Stemalert"));
                return;
            }
        }
    }
}
