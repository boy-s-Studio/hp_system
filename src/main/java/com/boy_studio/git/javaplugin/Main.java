package com.boy_studio.git.javaplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    
    @Override
    public void onEnable() {
    
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                      hp_system 를러그인을 불러왔습니다");
        System.out.println("                  플러그인 제작자 : boy0710boy, boyboy0710");
        System.out.println("       최신버전 다운 사이트 : https://github.com/boy-s-Studio/hp_system");
        System.out.println("-----------------------------------------------------------------------------");
    
        getConfig().options().copyDefaults(true);
        saveConfig();
        
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
