package com.fallenpvp.classes;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ClassCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("class")) {
            if(sender instanceof Player) {
                Player p = (Player) sender;
                Inventory GUI = Bukkit.createInventory(null, 27, ChatColor.RED + "Pick Your Class!");
                //VAMPIRE SKULL
                ItemStack Vampire = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
                SkullMeta VampireMeta = (SkullMeta) Vampire.getItemMeta();
                VampireMeta.setOwner(p.getName());
                VampireMeta.setDisplayName(ChatColor.RED + "Vampire Class");
                Vampire.setItemMeta(VampireMeta);

                ItemStack Werewolf = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
                SkullMeta WerewolfMeta = (SkullMeta) Vampire.getItemMeta();
                WerewolfMeta.setOwner(p.getName());
                WerewolfMeta.setDisplayName(ChatColor.RED + "Werewolf Class");
                Werewolf.setItemMeta(WerewolfMeta);

                ItemStack Mummy = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
                SkullMeta MummyMeta = (SkullMeta) Vampire.getItemMeta();
                MummyMeta.setOwner(p.getName());
                MummyMeta.setDisplayName(ChatColor.RED + "Mummy Class");
                Mummy.setItemMeta(MummyMeta);

                ItemStack NullPane = new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.BLACK.getData());
                ItemMeta NullMeta = NullPane.getItemMeta();
                NullMeta.setDisplayName(" ");
            }
        }

        return false;
    }

}
