package com.boy_studio.git.javaplugin.command;

import com.boy_studio.git.javaplugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class hp_onoff implements CommandExecutor, TabExecutor {
    
    public boolean hp_system = Main.getPlugin(Main.class).getConfig().getBoolean("hp");
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if(label.equalsIgnoreCase("hp_on")) {
            
            if(hp_system == false) {
    
                Main.getPlugin(Main.class).getConfig().set("test", "ture");
                sender.sendMessage("hp 상태가 on으로 변경되었습니다");
                
            }
    
            else if(hp_system == true) {
                sender.sendMessage("hp 은 이미 on 입니다");
            }
            
            else {
    
                Main.getPlugin(Main.class).getConfig().set("test", "ture");
                sender.sendMessage("hp 상태가 on으로 변경되었습니다");
                
            }
            
        }
    
        if(label.equalsIgnoreCase("hp_off")) {
        
            if(hp_system == true) {
            
                Main.getPlugin(Main.class).getConfig().set("hp", "false");
                sender.sendMessage("hp 상태가 on으로 변경되었습니다");
            
            }
        
            else if(hp_system == false) {
                sender.sendMessage("hp 은 이미 off 입니다");
            }
        
            else {
            
                Main.getPlugin(Main.class).getConfig().set("hp", "ture");
                sender.sendMessage("hp 상태가 off으로 변경되었습니다");
            
            }
        
        }
        
        return false;
    }
    
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        
        
        
        return null;
    }
}
