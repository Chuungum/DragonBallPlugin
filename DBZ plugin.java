package com.yourname.dbzplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class DBZPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("DragonBallPlugin Enabled!");
        // Register commands, listeners, etc
    }

    @Override
    public void onDisable() {
        getLogger().info("DragonBallPlugin Disabled.");
    }
}
