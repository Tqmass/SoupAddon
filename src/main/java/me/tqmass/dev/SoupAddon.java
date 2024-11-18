package me.tqmass.dev;

import lombok.Getter;
import me.tqmass.dev.listeners.PlayerListener;
import me.tqmass.dev.utils.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class SoupAddon extends JavaPlugin {
    @Getter
    private static SoupAddon instance;

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);

        Logger.info("Plugin iniciado correctamente");
        Logger.info("Programado por: Tqmass");
    }

    @Override
    public void onDisable() {
        Logger.error("Plugin desactivado correctamente");
    }
}
