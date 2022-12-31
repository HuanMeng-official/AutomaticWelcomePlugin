package huanmeng.mengpluginx.Worlds;

import huanmeng.mengpluginx.MengPluginX;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class DirtyWords implements Listener {
    Plugin plugin = huanmeng.mengpluginx.MengPluginX.getPlugin(huanmeng.mengpluginx.MengPluginX.class);

    private static final String[] list = {"sb", "傻逼", "几把", "他妈", "你妈死了", "操你妈", "脑瘫", "fuck", "神经病", "屎", "你妈", "我操", "日你妈", "操逼"};

    @EventHandler
    public void DirtyWords(AsyncPlayerChatEvent say) {
        for(String i: list){
            if(say.getMessage().contains(i)){
                say.setCancelled(plugin.getConfig().getBoolean("PlayChatEvent"));
                say.getPlayer().sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));
                return;
            }
        }
    }
}
