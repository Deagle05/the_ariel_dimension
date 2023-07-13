
package net.mcreator.thearieldimension.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.thearieldimension.procedures.AcidMobplayerCollidesBlockProcedure;
import net.mcreator.thearieldimension.init.TheArielDimensionModFluids;

public class AcidBlock extends LiquidBlock {
	public AcidBlock() {
		super(() -> TheArielDimensionModFluids.ACID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).lightLevel(s -> 5).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		AcidMobplayerCollidesBlockProcedure.execute(entity);
	}
}
