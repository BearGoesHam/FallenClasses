package com.fallenpvp.classes;

import org.bukkit.ChatColor;

public enum ClassType {

    VAMPIRE(ChatColor.translateAlternateColorCodes('&', "&8[&4V&8]")),
    WEREWOLF(ChatColor.translateAlternateColorCodes('&', "&8[&bW&8]")),
    MUMMY(ChatColor.translateAlternateColorCodes('&', "&8[&eM&8]"));


    private String prefix;

    private ClassType(String prefix) {
        this.prefix = prefix;
    }
    public String getPrefix() {
        String prefix = this.prefix;
        return prefix;
    }

}
