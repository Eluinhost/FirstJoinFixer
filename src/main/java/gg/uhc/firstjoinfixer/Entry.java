package gg.uhc.firstjoinfixer;

import org.bukkit.plugin.java.JavaPlugin;

public class Entry extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new FirstJoinListener(), this);
    }
}
