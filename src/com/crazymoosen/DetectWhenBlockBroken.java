package com.crazymoosen;

import com.crazymoosen.bukkit.Metrics;
import com.crazymoosen.listeners.*;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class DetectWhenBlockBroken extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new ListenForBlockBreaking(), this);
		getCommand("itemdrops").setExecutor(this);
		
		int pluginId = 11298;
		@SuppressWarnings("unused")
		Metrics metrics = new Metrics(this, pluginId);
	}
	
	public static List<String> names = new ArrayList<String>();

	
	List<String> arguments = new ArrayList<String>();

	
	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args){
		if (arguments.isEmpty()) {
			arguments.add("add");
			arguments.add("remove");
		}
		
		List<String> result = new ArrayList<String>();
		if (args.length == 1) {
			for (String a : arguments) {
				if (a.toLowerCase().startsWith(args[0].toLowerCase()))
					result.add(a);
			}
			return result;
		}
		
		return null;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {sender.sendMessage(ChatColor.RED + "(!) Only players may execute this command!"); return true;}
		
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("itemdrops")) {
			
			if (args.length > 0) {
				
				if (args[0].equalsIgnoreCase("add") || args[0].equalsIgnoreCase("remove")) {
					
					if (args[0].equalsIgnoreCase("add")) {
						
						try {
							
							if(names.contains(args[1].toString())) {
								p.sendMessage(ChatColor.RED + "(!) This player is already an Increasing Item Drops player!");
							}
							else {
								if(Bukkit.getOnlinePlayers().contains(Bukkit.getPlayer(args[1].toString()))) {
									p.sendMessage(ChatColor.GREEN + "(!) This player is now an Increasing Item Drops player.");
									
									names.add(args[1].toString());
								}
								else {
									p.sendMessage(ChatColor.RED + "(!)This player is not online.");
									return true;
								}
							}
						}
						catch (Exception e) {
							p.sendMessage(ChatColor.RED + "(!) Specify a player to add them to the list!");
						}
					}
					else {
						
						try {
							
							if(names.contains(args[1].toString())) {
								p.sendMessage(ChatColor.GREEN + "(!) This player is now not an Increasing Item Drops player.");
								
								names.remove(args[1].toString());
							}
							else {
								p.sendMessage(ChatColor.RED + "(!) You can't remove a player that is not an Increasing Item Drops player!");
							}

						}
						catch (Exception e) {
							p.sendMessage(ChatColor.RED + "(!) Specify a player to add them to the list!");
						}
						
					}
				}
				else {
					p.sendMessage("Give an argument of add or remove to add them from Increasing Item Drops or to remove them from Increasing Item Drops!");
				}
				
			}
			else {
				p.sendMessage("Give an argument of add or remove to add them from Increasing Item Drops or to remove them from Increasing Item Drops!");
			}
			
			
		}
		return true;
	}
	
	

	
	
}
