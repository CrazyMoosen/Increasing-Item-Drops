package com.crazymoosen.listeners;


import java.util.Collection;

import com.crazymoosen.DetectWhenBlockBroken;

import org.bukkit.Material;
import org.bukkit.block.Block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;


import org.bukkit.inventory.ItemStack;

public class ListenForBlockBreaking implements Listener {
	
	//If block is broken
	int amount = 1;

	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		
		
		
		if(DetectWhenBlockBroken.names.contains(event.getPlayer().getDisplayName())) {
			event.setCancelled(true);

			Block block = event.getBlock();
			
			Collection<ItemStack> blockDrops = block.getDrops();
			ItemStack[] arrayDrops = blockDrops.toArray(new ItemStack[blockDrops.size()]);
				    
			for (int i = 0; i < arrayDrops.length; i++) {
				    ItemStack items = new ItemStack(arrayDrops[i].getType(), amount);
				    block.getWorld().dropItemNaturally(block.getLocation(), items);
			}

			amount = amount + 1;
			
			block.setType(Material.AIR);
		}
		else {
			return;
		}
		
		
	}
}
