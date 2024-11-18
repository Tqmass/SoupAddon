package me.tqmass.dev.utils;

import me.tqmass.dev.SoupAddon;
import org.bukkit.ChatColor;

public class Logger {

    /**
     * Envía un mensaje de información a la consola.
     *
     * @param message El mensaje a enviar.
     */

    public static void info(String message) {
        SoupAddon.getInstance().getLogger().info(ChatColor.GREEN + message);
    }

    /**
     * Envía un mensaje de advertencia a la consola.
     *
     * @param message El mensaje a enviar.
     */

    public static void warning(String message) {
        SoupAddon.getInstance().getLogger().warning(ChatColor.YELLOW + message);
    }

    /**
     * Envía un mensaje de error a la console.
     *
     * @param message El mensaje a enviar.
     */
    public static void error(String message) {
        SoupAddon.getInstance().getLogger().severe(ChatColor.RED + message);
    }

}