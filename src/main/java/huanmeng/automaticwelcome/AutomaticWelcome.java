package huanmeng.automaticwelcome;
import huanmeng.automaticwelcome.commands.AutomaticWelcomeCommands;
import huanmeng.automaticwelcome.events.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class AutomaticWelcome extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("插件正在加载");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerJoinEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerBedEnterEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerBedLeaveEvent(),this);
        getServer().getPluginManager().registerEvents(new AsyncPlayerChatEvent(),this);
        getServer().getPluginManager().registerEvents(new PaintedEggShell(),this);
        Objects.requireNonNull(getCommand("automatic")).setExecutor(new AutomaticWelcomeCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("插件正在关闭");
        System.out.println("插件成功关闭");
    }
}
