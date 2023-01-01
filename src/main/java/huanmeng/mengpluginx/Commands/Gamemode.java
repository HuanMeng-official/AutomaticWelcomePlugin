package huanmeng.mengpluginx.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("mpx.huanmeng.op")){
            Player player = (Player) sender;
            switch (label){
                case "gm0":
                    ((Player) sender).setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.YELLOW + "[幻梦娘]" + ChatColor.WHITE + "已将您的游戏模式更换为生存");
                    break;
                case "gm1":
                    ((Player) sender).setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.YELLOW + "[幻梦娘]" + ChatColor.WHITE + "已将您的游戏模式更换为创造");
                    break;
                case "gm2":
                    ((Player) sender).setGameMode(GameMode.ADVENTURE);
                    player.sendMessage(ChatColor.YELLOW + "[幻梦娘]" + ChatColor.WHITE + "已将您的游戏模式更换为冒险");
                    break;
                case "gm3":
                    ((Player) sender).setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.YELLOW + "[幻梦娘]" + ChatColor.WHITE + "已将您的游戏模式更换为旁观");
                    break;
            }
        }else{
            System.out.println("Error: Please let the player execute the command");
        }
        return false;
    }
}