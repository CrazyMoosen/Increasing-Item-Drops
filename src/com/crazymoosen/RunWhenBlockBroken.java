package com.crazymoosen;
import com.crazymoosen.listeners.WhenBlockBroken;
import org.bukkit.plugin.java.JavaPlugin;

public class RunWhenBlockBroken extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new WhenBlockBroken(), this);
	}
}
