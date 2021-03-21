package com.boy_studio.git.javaplugin;

import com.boy_studio.git.javaplugin.command.hp_onoff;
import com.boy_studio.git.javaplugin.event.deth_event;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    
    String hp_config = getConfig().getString("hp");
    
    @Override
    public void onEnable() {
    
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                      hp_system 를러그인을 불러왔습니다");
        System.out.println("                  플러그인 제작자 : boy0710boy, boyboy0710");
        System.out.println("       최신버전 다운 사이트 : https://github.com/boy-s-Studio/hp_system");
        System.out.println("-----------------------------------------------------------------------------");
    
        getConfig().options().copyDefaults(true);
        saveConfig();
    
        Bukkit.getPluginManager().registerEvents(new deth_event(), this);
        
        getCommand("hp_on").setExecutor(new hp_onoff());
        getCommand("hp_on").setTabCompleter(new hp_onoff());
    
        getCommand("hp_off").setExecutor(new hp_onoff());
        getCommand("hp_off").setTabCompleter(new hp_onoff());
        
        if(hp_config == "t") {
        
        
        
        }
        
    }
    
    @Override
    public void onDisable() {
    
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     hp_system 를러그인이 비활성화되었습니다");
        System.out.println("                  플러그인 제작자 : boy0710boy, boyboy0710");
        System.out.println("       최신버전 다운 사이트 : https://github.com/boy-s-Studio/hp_system");
        System.out.println("-----------------------------------------------------------------------------");
    
        saveConfig();
    }
}
