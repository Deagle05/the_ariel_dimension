
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thearieldimension.item.TractorItemItem;
import net.mcreator.thearieldimension.item.TheArielDimensionItem;
import net.mcreator.thearieldimension.item.SkybornOrbItem;
import net.mcreator.thearieldimension.item.SapphireAppleItem;
import net.mcreator.thearieldimension.item.OrangeJuiceItem;
import net.mcreator.thearieldimension.item.OrangeItem;
import net.mcreator.thearieldimension.item.FlyingBeastMilkItem;
import net.mcreator.thearieldimension.item.FireBulletItem;
import net.mcreator.thearieldimension.item.AcidItem;
import net.mcreator.thearieldimension.TheArielDimensionMod;

public class TheArielDimensionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheArielDimensionMod.MODID);
	public static final RegistryObject<Item> ARIEL_DIMENSION_PORTAL = block(TheArielDimensionModBlocks.ARIEL_DIMENSION_PORTAL);
	public static final RegistryObject<Item> CHALK = block(TheArielDimensionModBlocks.CHALK);
	public static final RegistryObject<Item> THE_ARIEL_DIMENSION = REGISTRY.register("the_ariel_dimension", () -> new TheArielDimensionItem());
	public static final RegistryObject<Item> SKYBORN_ORB = REGISTRY.register("skyborn_orb", () -> new SkybornOrbItem());
	public static final RegistryObject<Item> CRYSTAL_BEING_SPAWN_EGG = REGISTRY.register("crystal_being_spawn_egg", () -> new ForgeSpawnEggItem(TheArielDimensionModEntities.CRYSTAL_BEING, -3665976, -6946666, new Item.Properties()));
	public static final RegistryObject<Item> SKYBORN_SPAWN_EGG = REGISTRY.register("skyborn_spawn_egg", () -> new ForgeSpawnEggItem(TheArielDimensionModEntities.SKYBORN, -4934476, -16730896, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_BEAST_MILK = REGISTRY.register("flying_beast_milk", () -> new FlyingBeastMilkItem());
	public static final RegistryObject<Item> SKY_GUARD_SPAWN_EGG = REGISTRY.register("sky_guard_spawn_egg", () -> new ForgeSpawnEggItem(TheArielDimensionModEntities.SKY_GUARD, -1, -14145456, new Item.Properties()));
	public static final RegistryObject<Item> LOST_WORLD_PORTAL = block(TheArielDimensionModBlocks.LOST_WORLD_PORTAL);
	public static final RegistryObject<Item> ACID_BUCKET = REGISTRY.register("acid_bucket", () -> new AcidItem());
	public static final RegistryObject<Item> FIRE_BULLET = REGISTRY.register("fire_bullet", () -> new FireBulletItem());
	public static final RegistryObject<Item> NETHER_BEAST_SPAWN_EGG = REGISTRY.register("nether_beast_spawn_egg", () -> new ForgeSpawnEggItem(TheArielDimensionModEntities.NETHER_BEAST, -11534336, -14811136, new Item.Properties()));
	public static final RegistryObject<Item> TROLL_GIANT_SPAWN_EGG = REGISTRY.register("troll_giant_spawn_egg", () -> new ForgeSpawnEggItem(TheArielDimensionModEntities.TROLL_GIANT, -16747776, -10205696, new Item.Properties()));
	public static final RegistryObject<Item> SKYBORN_GIANT_SPAWN_EGG = REGISTRY.register("skyborn_giant_spawn_egg", () -> new ForgeSpawnEggItem(TheArielDimensionModEntities.SKYBORN_GIANT, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> MADMAN_INFECTED_SPAWN_EGG = REGISTRY.register("madman_infected_spawn_egg", () -> new ForgeSpawnEggItem(TheArielDimensionModEntities.MADMAN_INFECTED, -9288704, -8346368, new Item.Properties()));
	public static final RegistryObject<Item> ORANGE = REGISTRY.register("orange", () -> new OrangeItem());
	public static final RegistryObject<Item> TROLL_SPAWN_EGG = REGISTRY.register("troll_spawn_egg", () -> new ForgeSpawnEggItem(TheArielDimensionModEntities.TROLL, -16747776, -10205696, new Item.Properties()));
	public static final RegistryObject<Item> ANGEL_LOG = block(TheArielDimensionModBlocks.ANGEL_LOG);
	public static final RegistryObject<Item> ORANGE_JUICE = REGISTRY.register("orange_juice", () -> new OrangeJuiceItem());
	public static final RegistryObject<Item> SAPPHIRE_APPLE = REGISTRY.register("sapphire_apple", () -> new SapphireAppleItem());
	public static final RegistryObject<Item> ANGEL_LEAVES = block(TheArielDimensionModBlocks.ANGEL_LEAVES);
	public static final RegistryObject<Item> TRACTOR_ITEM = REGISTRY.register("tractor_item", () -> new TractorItemItem());
	public static final RegistryObject<Item> WILDMAN_SPAWN_EGG = REGISTRY.register("wildman_spawn_egg", () -> new ForgeSpawnEggItem(TheArielDimensionModEntities.WILDMAN, -139, -12177920, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
