package me.xxsniperzzxxsd.flatcraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	
	
	public void onEnable(){
		System.out.println("Flatcraft Plugin Loaded!");
	
	}
	public void onDisable(){
		System.out.println("Flatcraft Plugin Disabled");
	
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("Flatcraft")){
			player.sendMessage(ChatColor.BOLD+"Flatcraft is a server Owned by the awesome cwk4229!");
		}
		return true;
	}


}
