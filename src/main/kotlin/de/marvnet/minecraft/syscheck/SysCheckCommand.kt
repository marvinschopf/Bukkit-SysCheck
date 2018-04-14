package de.marvnet.minecraft.syscheck

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class SysCheckCommand: CommandExecutor {
    val prefix: String = "§6[§3SysCheck§6]§f"

    fun getMessages(): List<String> {
        return listOf("RAM: " + Runtime.getRuntime().freeMemory() + "M/" + Runtime.getRuntime().totalMemory() + "M")
    }
    override fun onCommand(sender: CommandSender?, p1: Command?, p2: String?, p3: Array<out String>?): Boolean {
        if(sender!!.hasPermission("syscheck")) {
            for(msg: String in getMessages()) {
                sender!!.sendMessage("$prefix §9$msg")
            }
        } else {
            sender!!.sendMessage("$prefix §cYou don't have the required permissions to access this command!")
        }
        return true
    }
}