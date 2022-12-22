package huanmeng.automaticwelcome;
import huanmeng.automaticwelcome.commands.*;
import huanmeng.automaticwelcome.events.*;
import huanmeng.automaticwelcome.painteggshell.*;
import huanmeng.automaticwelcome.says.*;
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
        getServer().getPluginManager().registerEvents(new PaintedEggShell(),this);
        getServer().getPluginManager().registerEvents(new DirtyWords(),this);
        getServer().getPluginManager().registerEvents(new StemWords(),this);
        Objects.requireNonNull(getCommand("automatic")).setExecutor(new AutomaticWelcomeCommands());
        Objects.requireNonNull(getCommand("gm0")).setExecutor(new SetSurvival());
        Objects.requireNonNull(getCommand("gm1")).setExecutor(new SetCreative());
        Objects.requireNonNull(getCommand("gm2")).setExecutor(new SetAdventure());
        Objects.requireNonNull(getCommand("gm3")).setExecutor(new SetSpectator());
        Objects.requireNonNull(getCommand("tps")).setExecutor(new GetServerTPS());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("插件正在关闭");
        System.out.println("插件成功关闭");
    }
}
