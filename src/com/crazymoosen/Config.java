package com.crazymoosen;

import java.util.Map;
import java.util.TreeMap;

import org.bukkit.configuration.ConfigurationSection;

public class Config {
	public static int resetOnBlockNum;
	public static int resetWhenNumMobsKilled;
	public static boolean allBlocks = false;
	public static boolean allMobs = false;
	
	public static Map<String, Object> validBlocks = new TreeMap<String, Object>(String.CASE_INSENSITIVE_ORDER);
	public static Map<String, Object> validMobs = new TreeMap<String, Object>(String.CASE_INSENSITIVE_ORDER);
	
	public Config(RunListeners parent) {
		try {
			resetOnBlockNum = (int) parent.getConfig().get("reset-on-num-blocks-mined");
		}
		catch(ClassCastException e) {
			if(parent.getConfig().getBoolean("reset-on-num-blocks-mined") == false) {
				resetOnBlockNum = -1;
			}
			else {
				return;
			}
		}
		try {
			resetWhenNumMobsKilled = (int) parent.getConfig().get("reset-on-num-mobs-killed");
		}
		catch(ClassCastException e) {
			if(parent.getConfig().getBoolean("reset-on-num-blocks-killed") == false) {
				resetOnBlockNum = -1;
			}
			else {
				return;
			}
		}
		
		ConfigurationSection blocks = null;
		blocks = parent.getConfig().getConfigurationSection("blocks");

		
		try {
			int counter = 0;
			validBlocks = blocks.getValues(false);
			
			for(Map.Entry<String, Object> entry: validBlocks.entrySet()) {
				if (((Boolean)entry.getValue()).booleanValue() == false) {
					counter += 1;
				}
			}
			if(counter == validBlocks.size()) {
				allBlocks = true;
				//parent.printToConsole("All blocks are falsed..");
			}
			//parent.printToConsole(validBlocks.toString());
		}
		catch(NullPointerException e) {
			//parent.printToConsole("No blocks are specified");
			allBlocks = true;
			
		}
		
		
		ConfigurationSection mobs = null;
		mobs = parent.getConfig().getConfigurationSection("mobs");
		
		try {
			int counter = 0;
			validMobs = mobs.getValues(false);
			for(Map.Entry<String, Object> entry: validMobs.entrySet()) {
				if (((Boolean)entry.getValue()).booleanValue() == false) {
					counter += 1;
				}
			}
			if(counter == validMobs.size()) {
				allMobs = true;
				//parent.printToConsole("All mobs are falsed..");
			}
			//parent.printToConsole(validMobs.toString());
		}
		catch(NullPointerException e) {
			//parent.printToConsole("No mobs are specified");
			allMobs = true;
		}	
	}
}
