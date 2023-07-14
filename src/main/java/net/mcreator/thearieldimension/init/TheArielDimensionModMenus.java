
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.thearieldimension.world.inventory.TractorInvintoryMenu;
import net.mcreator.thearieldimension.TheArielDimensionMod;

public class TheArielDimensionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TheArielDimensionMod.MODID);
	public static final RegistryObject<MenuType<TractorInvintoryMenu>> TRACTOR_INVINTORY = REGISTRY.register("tractor_invintory", () -> IForgeMenuType.create(TractorInvintoryMenu::new));
}
