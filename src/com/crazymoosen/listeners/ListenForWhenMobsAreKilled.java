package com.crazymoosen.listeners;

import java.util.List;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import com.crazymoosen.Config;

public class ListenForWhenMobsAreKilled implements Listener {
	public static int mobKills = 0;
	
	@EventHandler
	public void onMobDeath(EntityDeathEvent event) {
		
		mobKills = mobKills + 1;
		
		LivingEntity entity = event.getEntity();
		
		
		List<ItemStack> mobDrops = event.getDrops();
			
		ItemStack[] newMobDrops = mobDrops.toArray(new ItemStack[mobDrops.size()]);
		
		for (int i = 0; i < newMobDrops.length; i++) {
			try {
				if(mobKills == Config.resetWhenNumMobsKilled) {
					mobKills = 0;
					
				    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
				    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
					
				    ListenForWhenABlockBreaks.amount = 0;
				}
				else {
					if(entity instanceof Bat) {
						if(Config.validMobs.containsKey("bat")) {
							if((((Boolean) Config.validMobs.get("bat")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Bee) {
						if(Config.validMobs.containsKey("bee")) {
							if((((Boolean) Config.validMobs.get("bee")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Blaze) {
						if(Config.validMobs.containsKey("blaze")) {
							if((((Boolean) Config.validMobs.get("blaze")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Cat) {
						if(Config.validMobs.containsKey("cat")) {
							if((((Boolean) Config.validMobs.get("cat")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof CaveSpider) {
						if(Config.validMobs.containsKey("cave_spider")) {
							if((((Boolean) Config.validMobs.get("cave_spider")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Chicken) {
						if(Config.validMobs.containsKey("chicken")) {
							if((((Boolean) Config.validMobs.get("chicken")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Cod) {
						if(Config.validMobs.containsKey("cod")) {
							if((((Boolean) Config.validMobs.get("cod")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Cow) {
						if(Config.validMobs.containsKey("cow")) {
							if((((Boolean) Config.validMobs.get("cow")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Creeper) {
						if(Config.validMobs.containsKey("creeper")) {
							if((((Boolean) Config.validMobs.get("creeper")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Dolphin) {
						if(Config.validMobs.containsKey("dolphin")) {
							if((((Boolean) Config.validMobs.get("dolphin")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Donkey) {
						if(Config.validMobs.containsKey("donkey")) {
							if((((Boolean) Config.validMobs.get("donkey")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Drowned) {
						if(Config.validMobs.containsKey("drowned")) {
							if((((Boolean) Config.validMobs.get("drowned")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof ElderGuardian) {
						if(Config.validMobs.containsKey("elder_guardian")) {
							if((((Boolean) Config.validMobs.get("elder_guardian")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof EnderDragon) {
						if(Config.validMobs.containsKey("ender_dragon")) {
							if((((Boolean) Config.validMobs.get("ender_dragon")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Enderman) {
						if(Config.validMobs.containsKey("enderman")) {
							if((((Boolean) Config.validMobs.get("enderman")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Endermite) {
						if(Config.validMobs.containsKey("endermite")) {
							if((((Boolean) Config.validMobs.get("endermite")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Evoker) {
						if(Config.validMobs.containsKey("evoker")) {
							if((((Boolean) Config.validMobs.get("evoker")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Fox) {
						if(Config.validMobs.containsKey("fox")) {
							if((((Boolean) Config.validMobs.get("fox")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Ghast) {
						if(Config.validMobs.containsKey("ghast")) {
							if((((Boolean) Config.validMobs.get("ghast")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Guardian) {
						if(Config.validMobs.containsKey("guardian")) {
							if((((Boolean) Config.validMobs.get("guardian")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Hoglin) {
						if(Config.validMobs.containsKey("hoglin")) {
							if((((Boolean) Config.validMobs.get("hoglin")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Horse) {
						if(Config.validMobs.containsKey("horse")) {
							if((((Boolean) Config.validMobs.get("horse")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Husk) {
						if(Config.validMobs.containsKey("husk")) {
							if((((Boolean) Config.validMobs.get("husk")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Illusioner) {
						if(Config.validMobs.containsKey("illusioner")) {
							if((((Boolean) Config.validMobs.get("illusioner")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof IronGolem) {
						if(Config.validMobs.containsKey("iron_golem")) {
							if((((Boolean) Config.validMobs.get("iron_golem")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Llama) {
						if(Config.validMobs.containsKey("llama")) {
							if((((Boolean) Config.validMobs.get("llama")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof MagmaCube) {
						if(Config.validMobs.containsKey("magma_cube")) {
							if((((Boolean) Config.validMobs.get("magma_cube")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Mule) {
						if(Config.validMobs.containsKey("mule")) {
							if((((Boolean) Config.validMobs.get("mule")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof MushroomCow) {
						if(Config.validMobs.containsKey("mushroom_cow")) {
							if((((Boolean) Config.validMobs.get("mushroom_cow")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Ocelot) {
						if(Config.validMobs.containsKey("ocelot")) {
							if((((Boolean) Config.validMobs.get("ocelot")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Panda) {
						if(Config.validMobs.containsKey("panda")) {
							if((((Boolean) Config.validMobs.get("panda")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Parrot) {
						if(Config.validMobs.containsKey("parrot")) {
							if((((Boolean) Config.validMobs.get("parrot")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Phantom) {
						if(Config.validMobs.containsKey("phantom")) {
							if((((Boolean) Config.validMobs.get("phantom")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Pig) {
						if(Config.validMobs.containsKey("pig")) {
							if((((Boolean) Config.validMobs.get("pig")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Piglin) {
						if(Config.validMobs.containsKey("piglin")) {
							if((((Boolean) Config.validMobs.get("piglin")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof PiglinBrute) {
						if(Config.validMobs.containsKey("piglin_brute")) {
							if((((Boolean) Config.validMobs.get("piglin_brute")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Pillager) {
						if(Config.validMobs.containsKey("pillager")) {
							if((((Boolean) Config.validMobs.get("pillager")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof PolarBear) {
						if(Config.validMobs.containsKey("polar_bear")) {
							if((((Boolean) Config.validMobs.get("polar_bear")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof PufferFish) {
						if(Config.validMobs.containsKey("pufferfish")) {
							if((((Boolean) Config.validMobs.get("pufferfish")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Rabbit) {
						if(Config.validMobs.containsKey("rabbit")) {
							if((((Boolean) Config.validMobs.get("rabbit")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Ravager) {
						if(Config.validMobs.containsKey("ravager")) {
							if((((Boolean) Config.validMobs.get("ravager")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Salmon) {
						if(Config.validMobs.containsKey("salmon")) {
							if((((Boolean) Config.validMobs.get("salmon")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Sheep) {
						if(Config.validMobs.containsKey("sheep")) {
							if((((Boolean) Config.validMobs.get("sheep")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Shulker) {
						if(Config.validMobs.containsKey("shulker")) {
							if((((Boolean) Config.validMobs.get("shulker")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Silverfish) {
						if(Config.validMobs.containsKey("silverfish")) {
							if((((Boolean) Config.validMobs.get("silverfish")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Skeleton) {
						if(Config.validMobs.containsKey("skeleton")) {
							if((((Boolean) Config.validMobs.get("skeleton")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof SkeletonHorse) {
						if(Config.validMobs.containsKey("skeleton_horse")) {
							if((((Boolean) Config.validMobs.get("skeleton_horse")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Slime) {
						if(Config.validMobs.containsKey("slime")) {
							if((((Boolean) Config.validMobs.get("slime")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Snowman) {
						if(Config.validMobs.containsKey("snowman")) {
							if((((Boolean) Config.validMobs.get("snowman")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Spider) {
						if(Config.validMobs.containsKey("spider")) {
							if((((Boolean) Config.validMobs.get("spider")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Squid) {
						if(Config.validMobs.containsKey("squid")) {
							if((((Boolean) Config.validMobs.get("squid")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Stray) {
						if(Config.validMobs.containsKey("stray")) {
							if((((Boolean) Config.validMobs.get("stray")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Strider) {
						if(Config.validMobs.containsKey("strider")) {
							if((((Boolean) Config.validMobs.get("strider")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof TraderLlama) {
						if(Config.validMobs.containsKey("trader_llama")) {
							if((((Boolean) Config.validMobs.get("trader_llama")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof TropicalFish) {
						if(Config.validMobs.containsKey("tropical_fish")) {
							if((((Boolean) Config.validMobs.get("tropical_fish")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Turtle) {
						if(Config.validMobs.containsKey("turtle")) {
							if((((Boolean) Config.validMobs.get("turtle")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Vex) {
						if(Config.validMobs.containsKey("vex")) {
							if((((Boolean) Config.validMobs.get("vex")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Villager) {
						if(Config.validMobs.containsKey("villager")) {
							if((((Boolean) Config.validMobs.get("villager")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Vindicator) {
						if(Config.validMobs.containsKey("vindicator")) {
							if((((Boolean) Config.validMobs.get("vindicator")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof WanderingTrader) {
						if(Config.validMobs.containsKey("wandering_trader")) {
							if((((Boolean) Config.validMobs.get("wandering_trader")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Witch) {
						if(Config.validMobs.containsKey("witch")) {
							if((((Boolean) Config.validMobs.get("witch")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Wither) {
						if(Config.validMobs.containsKey("wither")) {
							if((((Boolean) Config.validMobs.get("wither")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof WitherSkeleton) {
						if(Config.validMobs.containsKey("wither_skeleton")) {
							if((((Boolean) Config.validMobs.get("wither_skeleton")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Wolf) {
						if(Config.validMobs.containsKey("wolf")) {
							if((((Boolean) Config.validMobs.get("wolf")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Zoglin) {
						if(Config.validMobs.containsKey("zoglin")) {
							if((((Boolean) Config.validMobs.get("zoglin")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof Zombie) {
						if(Config.validMobs.containsKey("zombie")) {
							if((((Boolean) Config.validMobs.get("zombie")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof ZombieVillager) {
						if(Config.validMobs.containsKey("zombie_villager")) {
							if((((Boolean) Config.validMobs.get("zombie_villager")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof ZombieHorse) {
						if(Config.validMobs.containsKey("zombie_horse")) {
							if((((Boolean) Config.validMobs.get("zombie_horse")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if(entity instanceof PigZombie) {
						if(Config.validMobs.containsKey("zombified_piglin")) {
							if((((Boolean) Config.validMobs.get("zombified_piglin")))) {
							    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
							    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
							}
						}
					}
					else if (Config.allMobs) {
					    ItemStack items = new ItemStack(newMobDrops[i].getType(), ListenForWhenABlockBreaks.amount);
					    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
					}
					else {
					    ItemStack items = new ItemStack(newMobDrops[i].getType(), 1);
					    entity.getWorld().dropItemNaturally(entity.getLocation(), items);
					}
				}
			}
			catch (Exception e) {
				return;
			}
		}
		ListenForWhenABlockBreaks.amount = ListenForWhenABlockBreaks.amount + 1;
	}
}
