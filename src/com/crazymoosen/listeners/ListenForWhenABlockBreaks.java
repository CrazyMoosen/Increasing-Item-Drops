package com.crazymoosen.listeners;

import java.util.Collection;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import com.crazymoosen.Config;
import com.crazymoosen.RunListeners;


public class ListenForWhenABlockBreaks implements Listener {
	
	//If block is broken
	public static int amount = 1;
	public static int blocksBroken = 0;

	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		
		
		if(RunListeners.names.contains(event.getPlayer().getDisplayName())) {
			blocksBroken = blocksBroken + 1;
			
			event.setCancelled(true);
			
			Block block = event.getBlock();
			//Material material = block.getType();
			
			Collection<ItemStack> blockDrops = block.getDrops();
			ItemStack[] arrayDrops = blockDrops.toArray(new ItemStack[blockDrops.size()]);
				    
			for (int i = 0; i < arrayDrops.length; i++) {

				try {
					if(blocksBroken == Config.resetOnBlockNum) {
						blocksBroken = 0;
						
					    ItemStack items = new ItemStack(arrayDrops[i].getType(), amount);
					    block.getWorld().dropItemNaturally(block.getLocation(), items);
						
					    amount = 0;
					}
					else {
						if(Config.validBlocks.containsKey(arrayDrops[i].getType().name().toLowerCase())) {
							if((((Boolean) Config.validBlocks.get(arrayDrops[i].getType().name().toLowerCase())).booleanValue())) {
							    ItemStack items = new ItemStack(arrayDrops[i].getType(), amount);
							    block.getWorld().dropItemNaturally(block.getLocation(), items);
							}
							
						}
						else if(Config.allBlocks) {
						    ItemStack items = new ItemStack(arrayDrops[i].getType(), amount);
						    block.getWorld().dropItemNaturally(block.getLocation(), items);
						}
						else {
						    ItemStack items = new ItemStack(arrayDrops[i].getType(), 1);
						    block.getWorld().dropItemNaturally(block.getLocation(), items);
						}
					}

				} 
				catch(Exception e) {
					return;
				}




			}
			
			//ItemStack items = new ItemStack(material, amount);
			//block.getWorld().dropItemNaturally(block.getLocation(), items);

			amount = amount + 1;
			

			block.setType(Material.AIR);
		}
		else {
			return;
		}
		
		
	}
}
