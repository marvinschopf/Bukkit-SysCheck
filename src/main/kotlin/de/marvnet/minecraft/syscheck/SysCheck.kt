package de.marvnet.minecraft.syscheck

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class SysCheck: JavaPlugin() {

    val prefix: String = "§6[§3SysCheck§6]§f"

    override fun onEnable() {
        super.onEnable()
        getCommand("syscheck").executor = SysCheckCommand()
        Bukkit.getConsoleSender().sendMessage("$prefix §aEnabled successful!")
    }

    override fun onDisable() {
        super.onDisable()
        Bukkit.getConsoleSender().sendMessage("$prefix §cDisabled successful!")
    }
}