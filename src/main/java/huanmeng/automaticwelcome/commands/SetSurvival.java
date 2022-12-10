package huanmeng.automaticwelcome.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSurvival implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            ((Player) sender).setGameMode(GameMode.SURVIVAL);
        }else{
            System.out.println("Error: Please let the player execute the command");
        }
        return false;
    }
}