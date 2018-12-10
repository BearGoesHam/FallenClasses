package com.fallenpvp.classes;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClassListener implements Listener {

    @EventHandler
    public void ClassGUIListener(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

    }

}
