package me.tqmass.dev.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerListener implements Listener {

    /**
     * Este evento se invoca cuando el jugador entra al servidor.
     * La función es desactivar el mensaje de entrada por defecto de Spigot.
     *
     * @param event PlayerJoinEvent contiene toda la información sobre el evento del jugador.
     */

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);
    }

    /**
     * Este evento se invoca cuando el jugador sale del servidor.
     * La función es desactivar el mensaje de salida por defecto de Spigot.
     *
     * @param event PlayerQuitEvent contiene toda la información sobre el evento del jugador.
     */

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }

    /**
     * Este evento se invoca cuando un ítem en el inventario del jugador recibe daño.
     * La función es prevenir que las armaduras y herramientas se dañen, haciéndolas efectivamente irrompibles.
     *
     * @param event PlayerItemDamageEvent contiene información sobre el ítem dañado y la cantidad de daño.
     */

    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent event) {
        event.setCancelled(true);
        setUnbreakable(event.getItem());
    }

    /**
     * Este metodo hace que un ítem sea irrompible y oculta su barra de durabilidad.
     * La función es prevenir que los objetos se lleguen a romper y les agrega irrompibilidad.
     *
     * @param item El ItemStack que se hará irrompible.
     */

    private void setUnbreakable(ItemStack item) {
        if (item != null && item.getType() != Material.AIR) {
            ItemMeta meta = item.getItemMeta();
            if (meta != null) {
                meta.spigot().setUnbreakable(true);
                item.setItemMeta(meta);
            }
        }
    }
}