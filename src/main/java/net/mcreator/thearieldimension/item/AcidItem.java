
package net.mcreator.thearieldimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.thearieldimension.init.TheArielDimensionModFluids;

public class AcidItem extends BucketItem {
	public AcidItem() {
		super(TheArielDimensionModFluids.ACID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
