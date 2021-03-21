package com.boy_studio.git.javaplugin.command;

import com.boy_studio.git.javaplugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class hp_onoff implements CommandExecutor, TabExecutor {
    
    public boolean hp_system = Main.getPlugin(Main.class).getConfig().getBoolean("hp");
    
    String h = Main.getPlugin(Main.class).getConfig().getString("hp");
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
        if(label.equalsIgnoreCase("hp_on")) {
            Main.getPlugin(Main.class).getConfig().set("hp", "t");
            Main.getPlugin(Main.class).reloadConfig();
            Main.getPlugin(Main.class).saveConfig();
            sender.sendMessage("hp 상태가 on으로 변경되었습니다");
            sender.sendMessage(h);
            
        }
        
        if(label.equalsIgnoreCase("hp_off")) {
        
            Main.getPlugin(Main.class).getConfig().set("hp", "f");
            Main.getPlugin(Main.class).reloadConfig();
            Main.getPlugin(Main.class).saveConfig();
            sender.sendMessage("hp 상태가 off으로 변경되었습니다");
        
        }
        
        return false;
    }
    
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        
        
        
        return null;
    }
}
