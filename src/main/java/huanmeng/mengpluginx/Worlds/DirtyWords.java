package huanmeng.mengpluginx.Worlds;

import huanmeng.mengpluginx.MengPluginX;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.util.ArrayList;

public class DirtyWords implements Listener {
    Plugin plugin = huanmeng.mengpluginx.MengPluginX.getPlugin(huanmeng.mengpluginx.MengPluginX.class);

    private static ArrayList<String> list = null;

    public DirtyWords(){
        File file = new File(MengPluginX.getPlugin(MengPluginX.class).getDataFolder(), "keyWords.yml");
        if(!file.exists()) return;
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        list = (ArrayList<String>) config.getList("dirty");
    }

    @EventHandler
    public void DirtyWords(AsyncPlayerChatEvent say) {
        if(list != null) {
            for (String i : list) {
                if (say.getMessage().contains(i)) {
                    say.setCancelled(plugin.getConfig().getBoolean("PlayChatEvent"));
                    say.getPlayer().sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));
                    return;
                }
            }
        }
    }
}
