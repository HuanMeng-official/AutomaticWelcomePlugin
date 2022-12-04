package huanmeng.automaticwelcome;
import huanmeng.automaticwelcome.events.PlayerBedEnterEvent;
import huanmeng.automaticwelcome.events.PlayerBedLeaveEvent;
import huanmeng.automaticwelcome.events.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutomaticWelcome extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[Automatic welcome]正在加载");
        System.out.println("[Automatic welcome]版本: 1.3");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerJoinEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerBedEnterEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerBedLeaveEvent(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Automatic welcome]正在关闭");
        System.out.println("[Automatic welcome]成功关闭");
    }
}
