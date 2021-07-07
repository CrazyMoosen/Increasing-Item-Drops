package com.crazymoosen;

import com.crazymoosen.listeners.*;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class DetectWhenBlockBroken extends JavaPlugin implements Listener, TabCompleter {
	
	@Override
	public void onEnable() {
		getCommand("itemdrops").setExecutor(this);
	}
	
	
	List<String> arguments = new ArrayList<String>();
	
	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args){
		if (arguments.isEmpty()) {
			arguments.add("on");
			arguments.add("off");
			arguments.add("true");
			arguments.add("false");
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
		if (!(sender instanceof Player)) {sender.sendMessage("§4§l(!) §4Only players may execute this command!"); return true;}
		
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("itemdrops")) {
			
			if (args.length > 0) {
				
				if (args[0].equalsIgnoreCase("true") || args[0].equalsIgnoreCase("false") || args[0].equalsIgnoreCase("on") || args[0].equalsIgnoreCase("off")) {
					if (args[0].equalsIgnoreCase("true") || args[0].equalsIgnoreCase("on")) {
						
						p.sendMessage(ChatColor.GREEN + "(!) Increasing Item Drops has now been turned on. Mine more blocks to get more blocks!");
						getServer().getPluginManager().registerEvents(new ListenForBlockBreaking(), this);
						
					}
					else {
						p.sendMessage(ChatColor.RED + "(!) Increasing Item Drops has now been turned off. You will not get more blocks when you mine blocks!");
						HandlerList.unregisterAll();
						
					}
				}
				else {
					p.sendMessage("Give an argument of true to turn on increasing item drops, or false to turn it off!");
				}
				
			}
			else {
				p.sendMessage("Give an argument of true to turn on increasing item drops, or false to turn it off!");
			}
			
			
		}
		return true;
	}
	
	

	
	
}
