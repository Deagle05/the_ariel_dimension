
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.thearieldimension.entity.TrollGiantEntity;
import net.mcreator.thearieldimension.entity.TrollEntity;
import net.mcreator.thearieldimension.entity.TractorEntity;
import net.mcreator.thearieldimension.entity.SkybornOrbEntity;
import net.mcreator.thearieldimension.entity.SkybornGiantEntity;
import net.mcreator.thearieldimension.entity.SkybornEntity;
import net.mcreator.thearieldimension.entity.SkyGuardEntity;
import net.mcreator.thearieldimension.entity.NetherBeastEntity;
import net.mcreator.thearieldimension.entity.MadmanInfectedEntity;
import net.mcreator.thearieldimension.entity.HumanEntity;
import net.mcreator.thearieldimension.entity.FireBulletEntity;
import net.mcreator.thearieldimension.entity.CrystalBeingEntity;
import net.mcreator.thearieldimension.TheArielDimensionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheArielDimensionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheArielDimensionMod.MODID);
	public static final RegistryObject<EntityType<SkybornOrbEntity>> SKYBORN_ORB = register("projectile_skyborn_orb",
			EntityType.Builder.<SkybornOrbEntity>of(SkybornOrbEntity::new, MobCategory.MISC).setCustomClientFactory(SkybornOrbEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrystalBeingEntity>> CRYSTAL_BEING = register("crystal_being", EntityType.Builder.<CrystalBeingEntity>of(CrystalBeingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrystalBeingEntity::new).fireImmune().sized(1f, 2.6f));
	public static final RegistryObject<EntityType<SkybornEntity>> SKYBORN = register("skyborn",
			EntityType.Builder.<SkybornEntity>of(SkybornEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkybornEntity::new)

					.sized(1.6f, 2.4f));
	public static final RegistryObject<EntityType<SkyGuardEntity>> SKY_GUARD = register("sky_guard",
			EntityType.Builder.<SkyGuardEntity>of(SkyGuardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkyGuardEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireBulletEntity>> FIRE_BULLET = register("projectile_fire_bullet",
			EntityType.Builder.<FireBulletEntity>of(FireBulletEntity::new, MobCategory.MISC).setCustomClientFactory(FireBulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NetherBeastEntity>> NETHER_BEAST = register("nether_beast", EntityType.Builder.<NetherBeastEntity>of(NetherBeastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NetherBeastEntity::new).fireImmune().sized(4f, 9f));
	public static final RegistryObject<EntityType<TrollGiantEntity>> TROLL_GIANT = register("troll_giant", EntityType.Builder.<TrollGiantEntity>of(TrollGiantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(TrollGiantEntity::new).fireImmune().sized(7f, 17f));
	public static final RegistryObject<EntityType<SkybornGiantEntity>> SKYBORN_GIANT = register("skyborn_giant",
			EntityType.Builder.<SkybornGiantEntity>of(SkybornGiantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkybornGiantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MadmanInfectedEntity>> MADMAN_INFECTED = register("madman_infected", EntityType.Builder.<MadmanInfectedEntity>of(MadmanInfectedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadmanInfectedEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TrollEntity>> TROLL = register("troll",
			EntityType.Builder.<TrollEntity>of(TrollEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrollEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HumanEntity>> HUMAN = register("human",
			EntityType.Builder.<HumanEntity>of(HumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HumanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TractorEntity>> TRACTOR = register("tractor",
			EntityType.Builder.<TractorEntity>of(TractorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TractorEntity::new).fireImmune().sized(1.3f, 2.1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CrystalBeingEntity.init();
			SkybornEntity.init();
			SkyGuardEntity.init();
			NetherBeastEntity.init();
			TrollGiantEntity.init();
			SkybornGiantEntity.init();
			MadmanInfectedEntity.init();
			TrollEntity.init();
			HumanEntity.init();
			TractorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CRYSTAL_BEING.get(), CrystalBeingEntity.createAttributes().build());
		event.put(SKYBORN.get(), SkybornEntity.createAttributes().build());
		event.put(SKY_GUARD.get(), SkyGuardEntity.createAttributes().build());
		event.put(NETHER_BEAST.get(), NetherBeastEntity.createAttributes().build());
		event.put(TROLL_GIANT.get(), TrollGiantEntity.createAttributes().build());
		event.put(SKYBORN_GIANT.get(), SkybornGiantEntity.createAttributes().build());
		event.put(MADMAN_INFECTED.get(), MadmanInfectedEntity.createAttributes().build());
		event.put(TROLL.get(), TrollEntity.createAttributes().build());
		event.put(HUMAN.get(), HumanEntity.createAttributes().build());
		event.put(TRACTOR.get(), TractorEntity.createAttributes().build());
	}
}
