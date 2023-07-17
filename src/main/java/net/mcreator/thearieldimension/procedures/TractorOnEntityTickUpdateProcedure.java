package net.mcreator.thearieldimension.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TractorOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getMaterial() == net.minecraft.world.level.material.Material.REPLACEABLE_PLANT
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getMaterial() == net.minecraft.world.level.material.Material.GRASS
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getMaterial() == net.minecraft.world.level.material.Material.PLANT) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.GRASS.defaultBlockState()));
		}
	}
}
