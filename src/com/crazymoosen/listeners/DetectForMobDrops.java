package com.crazymoosen.listeners;

import java.util.List;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class DetectForMobDrops implements Listener{
	@EventHandler
	public void onMobDeath(EntityDeathEvent event) {
		
		LivingEntity entity = event.getEntity();
		
		List<ItemStack> mobDrops = event.getDrops();
			
		ItemStack[] newMobDrops = mobDrops.toArray(new ItemStack[mobDrops.size()]);
		
		for (int i = 0; i < newMobDrops.length; i++) {
		    ItemStack items = new ItemStack(newMobDrops[i].getType(), DetectForItemDrops.amount);
		    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
		}
		
		DetectForItemDrops.amount = DetectForItemDrops.amount + 1;
		
	}
}
