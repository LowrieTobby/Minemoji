package xyz.lowrie.minemoji;

import org.bukkit.plugin.java.JavaPlugin;

public class MinemojiPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[Minemoji] ✨ Minemoji is enabled! ✨");
    }
    @Override
    public void onDisable() {
        getLogger().info("[Minemoji] Minemoji is disabled !");
    }

}
