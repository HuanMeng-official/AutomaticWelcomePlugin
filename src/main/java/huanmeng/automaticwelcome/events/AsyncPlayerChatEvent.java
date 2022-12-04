package huanmeng.automaticwelcome.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class AsyncPlayerChatEvent implements Listener {
    Plugin plugin = huanmeng.automaticwelcome.AutomaticWelcome.getPlugin(huanmeng.automaticwelcome.AutomaticWelcome.class);
    @EventHandler
    public void AsyncPlayerChatEvent(org.bukkit.event.player.AsyncPlayerChatEvent say){
        if (say.getMessage().contains("sb"));
        Player chatsay = say.getPlayer();
        chatsay.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));

        if (say.getMessage().contains("傻逼"));
        Player chatsay1 = say.getPlayer();
        chatsay1.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));

        if (say.getMessage().contains("几把"));
        Player chatsay2 = say.getPlayer();
        chatsay2.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));

        if (say.getMessage().contains("他妈"));
        Player chatsay3 = say.getPlayer();
        chatsay3.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));

        if (say.getMessage().contains("你妈死了"));
        Player chatsay4 = say.getPlayer();
        chatsay4.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));

        if (say.getMessage().contains("操你妈"));
        Player chatsay5 = say.getPlayer();
        chatsay5.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));

        if (say.getMessage().contains("脑瘫"));
        Player chatsay6 = say.getPlayer();
        chatsay6.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));

        if (say.getMessage().contains("fuck"));
        Player chatsay7 = say.getPlayer();
        chatsay7.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.RED + plugin.getConfig().getString("Alert"));
    }
}
