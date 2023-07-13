
package net.mcreator.thearieldimension.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.thearieldimension.init.TheArielDimensionModItems;
import net.mcreator.thearieldimension.init.TheArielDimensionModFluids;
import net.mcreator.thearieldimension.init.TheArielDimensionModFluidTypes;
import net.mcreator.thearieldimension.init.TheArielDimensionModBlocks;

public abstract class AcidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TheArielDimensionModFluidTypes.ACID_TYPE.get(), () -> TheArielDimensionModFluids.ACID.get(), () -> TheArielDimensionModFluids.FLOWING_ACID.get())
			.explosionResistance(100f).bucket(() -> TheArielDimensionModItems.ACID_BUCKET.get()).block(() -> (LiquidBlock) TheArielDimensionModBlocks.ACID.get());

	private AcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
