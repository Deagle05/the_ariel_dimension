
package net.mcreator.thearieldimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SapphireAppleItem extends Item {
	public SapphireAppleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(7).saturationMod(0.5f).build()));
	}
}
