/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.snurftech.thetntupdate.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import com.snurftech.thetntupdate.entity.*;
import com.snurftech.thetntupdate.TheTntUpdateMod;

@EventBusSubscriber
public class TheTntUpdateModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, TheTntUpdateMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedFivexTNTEntity>> PRIMED_FIVEX_TNT = register("primed_fivex_tnt",
			EntityType.Builder.<PrimedFivexTNTEntity>of(PrimedFivexTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedTenxTNTEntity>> PRIMED_TENX_TNT = register("primed_tenx_tnt",
			EntityType.Builder.<PrimedTenxTNTEntity>of(PrimedTenxTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedTwoxTNTEntity>> PRIMED_TWOX_TNT = register("primed_twox_tnt",
			EntityType.Builder.<PrimedTwoxTNTEntity>of(PrimedTwoxTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedNuclearTNTEntity>> PRIMED_NUCLEAR_TNT = register("primed_nuclear_tnt",
			EntityType.Builder.<PrimedNuclearTNTEntity>of(PrimedNuclearTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedHoleTNTEntity>> PRIMED_HOLE_TNT = register("primed_hole_tnt",
			EntityType.Builder.<PrimedHoleTNTEntity>of(PrimedHoleTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedDiamondOreTNTEntity>> PRIMED_DIAMOND_ORE_TNT = register("primed_diamond_ore_tnt",
			EntityType.Builder.<PrimedDiamondOreTNTEntity>of(PrimedDiamondOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedDeepslateDiamondOreTNTEntity>> PRIMED_DEEPSLATE_DIAMOND_ORE_TNT = register("primed_deepslate_diamond_ore_tnt",
			EntityType.Builder.<PrimedDeepslateDiamondOreTNTEntity>of(PrimedDeepslateDiamondOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedEmeraldOreTNTEntity>> PRIMED_EMERALD_ORE_TNT = register("primed_emerald_ore_tnt",
			EntityType.Builder.<PrimedEmeraldOreTNTEntity>of(PrimedEmeraldOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedDeepslateEmeraldOreTNTEntity>> PRIMED_DEEPSLATE_EMERALD_ORE_TNT = register("primed_deepslate_emerald_ore_tnt",
			EntityType.Builder.<PrimedDeepslateEmeraldOreTNTEntity>of(PrimedDeepslateEmeraldOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedRedstoneOreTNTEntity>> PRIMED_REDSTONE_ORE_TNT = register("primed_redstone_ore_tnt",
			EntityType.Builder.<PrimedRedstoneOreTNTEntity>of(PrimedRedstoneOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedDeepslateRedstoneOreTNTEntity>> PRIMED_DEEPSLATE_REDSTONE_ORE_TNT = register("primed_deepslate_redstone_ore_tnt",
			EntityType.Builder.<PrimedDeepslateRedstoneOreTNTEntity>of(PrimedDeepslateRedstoneOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedGoldOreTNTEntity>> PRIMED_GOLD_ORE_TNT = register("primed_gold_ore_tnt",
			EntityType.Builder.<PrimedGoldOreTNTEntity>of(PrimedGoldOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedDeepslateGoldOreTNTEntity>> PRIMED_DEEPSLATE_GOLD_ORE_TNT = register("primed_deepslate_gold_ore_tnt",
			EntityType.Builder.<PrimedDeepslateGoldOreTNTEntity>of(PrimedDeepslateGoldOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedNetherGoldOreTNTEntity>> PRIMED_NETHER_GOLD_ORE_TNT = register("primed_nether_gold_ore_tnt",
			EntityType.Builder.<PrimedNetherGoldOreTNTEntity>of(PrimedNetherGoldOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedIronOreTNTEntity>> PRIMED_IRON_ORE_TNT = register("primed_iron_ore_tnt",
			EntityType.Builder.<PrimedIronOreTNTEntity>of(PrimedIronOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedDeepslateIronOreTNTEntity>> PRIMED_DEEPSLATE_IRON_ORE_TNT = register("primed_deepslate_iron_ore_tnt",
			EntityType.Builder.<PrimedDeepslateIronOreTNTEntity>of(PrimedDeepslateIronOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedCoalOreTNTEntity>> PRIMED_COAL_ORE_TNT = register("primed_coal_ore_tnt",
			EntityType.Builder.<PrimedCoalOreTNTEntity>of(PrimedCoalOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedDeepslateCoalOreTNTEntity>> PRIMED_DEEPSLATE_COAL_ORE_TNT = register("primed_deepslate_coal_ore_tnt",
			EntityType.Builder.<PrimedDeepslateCoalOreTNTEntity>of(PrimedDeepslateCoalOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedCopperOreTNTEntity>> PRIMED_COPPER_ORE_TNT = register("primed_copper_ore_tnt",
			EntityType.Builder.<PrimedCopperOreTNTEntity>of(PrimedCopperOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedDeepslateCopperOreTNTEntity>> PRIMED_DEEPSLATE_COPPER_ORE_TNT = register("primed_deepslate_copper_ore_tnt",
			EntityType.Builder.<PrimedDeepslateCopperOreTNTEntity>of(PrimedDeepslateCopperOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedLapisLazuliOreTNTEntity>> PRIMED_LAPIS_LAZULI_ORE_TNT = register("primed_lapis_lazuli_ore_tnt",
			EntityType.Builder.<PrimedLapisLazuliOreTNTEntity>of(PrimedLapisLazuliOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedDeepslateLapisLazuliOreTNTEntity>> PRIMED_DEEPSLATE_LAPIS_LAZULI_ORE_TNT = register("primed_deepslate_lapis_lazuli_ore_tnt",
			EntityType.Builder.<PrimedDeepslateLapisLazuliOreTNTEntity>of(PrimedDeepslateLapisLazuliOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedNetherQuartzOreTNTEntity>> PRIMED_NETHER_QUARTZ_ORE_TNT = register("primed_nether_quartz_ore_tnt",
			EntityType.Builder.<PrimedNetherQuartzOreTNTEntity>of(PrimedNetherQuartzOreTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedAncientDebrisTNTEntity>> PRIMED_ANCIENT_DEBRIS_TNT = register("primed_ancient_debris_tnt",
			EntityType.Builder.<PrimedAncientDebrisTNTEntity>of(PrimedAncientDebrisTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedWorldEaterTNTEntity>> PRIMED_WORLD_EATER_TNT = register("primed_world_eater_tnt",
			EntityType.Builder.<PrimedWorldEaterTNTEntity>of(PrimedWorldEaterTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedIceTNTEntity>> PRIMED_ICE_TNT = register("primed_ice_tnt",
			EntityType.Builder.<PrimedIceTNTEntity>of(PrimedIceTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimedNetherTNTEntity>> PRIMED_NETHER_TNT = register("primed_nether_tnt",
			EntityType.Builder.<PrimedNetherTNTEntity>of(PrimedNetherTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(TheTntUpdateMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		PrimedFivexTNTEntity.init(event);
		PrimedTenxTNTEntity.init(event);
		PrimedTwoxTNTEntity.init(event);
		PrimedNuclearTNTEntity.init(event);
		PrimedHoleTNTEntity.init(event);
		PrimedDiamondOreTNTEntity.init(event);
		PrimedDeepslateDiamondOreTNTEntity.init(event);
		PrimedEmeraldOreTNTEntity.init(event);
		PrimedDeepslateEmeraldOreTNTEntity.init(event);
		PrimedRedstoneOreTNTEntity.init(event);
		PrimedDeepslateRedstoneOreTNTEntity.init(event);
		PrimedGoldOreTNTEntity.init(event);
		PrimedDeepslateGoldOreTNTEntity.init(event);
		PrimedNetherGoldOreTNTEntity.init(event);
		PrimedIronOreTNTEntity.init(event);
		PrimedDeepslateIronOreTNTEntity.init(event);
		PrimedCoalOreTNTEntity.init(event);
		PrimedDeepslateCoalOreTNTEntity.init(event);
		PrimedCopperOreTNTEntity.init(event);
		PrimedDeepslateCopperOreTNTEntity.init(event);
		PrimedLapisLazuliOreTNTEntity.init(event);
		PrimedDeepslateLapisLazuliOreTNTEntity.init(event);
		PrimedNetherQuartzOreTNTEntity.init(event);
		PrimedAncientDebrisTNTEntity.init(event);
		PrimedWorldEaterTNTEntity.init(event);
		PrimedIceTNTEntity.init(event);
		PrimedNetherTNTEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PRIMED_FIVEX_TNT.get(), PrimedFivexTNTEntity.createAttributes().build());
		event.put(PRIMED_TENX_TNT.get(), PrimedTenxTNTEntity.createAttributes().build());
		event.put(PRIMED_TWOX_TNT.get(), PrimedTwoxTNTEntity.createAttributes().build());
		event.put(PRIMED_NUCLEAR_TNT.get(), PrimedNuclearTNTEntity.createAttributes().build());
		event.put(PRIMED_HOLE_TNT.get(), PrimedHoleTNTEntity.createAttributes().build());
		event.put(PRIMED_DIAMOND_ORE_TNT.get(), PrimedDiamondOreTNTEntity.createAttributes().build());
		event.put(PRIMED_DEEPSLATE_DIAMOND_ORE_TNT.get(), PrimedDeepslateDiamondOreTNTEntity.createAttributes().build());
		event.put(PRIMED_EMERALD_ORE_TNT.get(), PrimedEmeraldOreTNTEntity.createAttributes().build());
		event.put(PRIMED_DEEPSLATE_EMERALD_ORE_TNT.get(), PrimedDeepslateEmeraldOreTNTEntity.createAttributes().build());
		event.put(PRIMED_REDSTONE_ORE_TNT.get(), PrimedRedstoneOreTNTEntity.createAttributes().build());
		event.put(PRIMED_DEEPSLATE_REDSTONE_ORE_TNT.get(), PrimedDeepslateRedstoneOreTNTEntity.createAttributes().build());
		event.put(PRIMED_GOLD_ORE_TNT.get(), PrimedGoldOreTNTEntity.createAttributes().build());
		event.put(PRIMED_DEEPSLATE_GOLD_ORE_TNT.get(), PrimedDeepslateGoldOreTNTEntity.createAttributes().build());
		event.put(PRIMED_NETHER_GOLD_ORE_TNT.get(), PrimedNetherGoldOreTNTEntity.createAttributes().build());
		event.put(PRIMED_IRON_ORE_TNT.get(), PrimedIronOreTNTEntity.createAttributes().build());
		event.put(PRIMED_DEEPSLATE_IRON_ORE_TNT.get(), PrimedDeepslateIronOreTNTEntity.createAttributes().build());
		event.put(PRIMED_COAL_ORE_TNT.get(), PrimedCoalOreTNTEntity.createAttributes().build());
		event.put(PRIMED_DEEPSLATE_COAL_ORE_TNT.get(), PrimedDeepslateCoalOreTNTEntity.createAttributes().build());
		event.put(PRIMED_COPPER_ORE_TNT.get(), PrimedCopperOreTNTEntity.createAttributes().build());
		event.put(PRIMED_DEEPSLATE_COPPER_ORE_TNT.get(), PrimedDeepslateCopperOreTNTEntity.createAttributes().build());
		event.put(PRIMED_LAPIS_LAZULI_ORE_TNT.get(), PrimedLapisLazuliOreTNTEntity.createAttributes().build());
		event.put(PRIMED_DEEPSLATE_LAPIS_LAZULI_ORE_TNT.get(), PrimedDeepslateLapisLazuliOreTNTEntity.createAttributes().build());
		event.put(PRIMED_NETHER_QUARTZ_ORE_TNT.get(), PrimedNetherQuartzOreTNTEntity.createAttributes().build());
		event.put(PRIMED_ANCIENT_DEBRIS_TNT.get(), PrimedAncientDebrisTNTEntity.createAttributes().build());
		event.put(PRIMED_WORLD_EATER_TNT.get(), PrimedWorldEaterTNTEntity.createAttributes().build());
		event.put(PRIMED_ICE_TNT.get(), PrimedIceTNTEntity.createAttributes().build());
		event.put(PRIMED_NETHER_TNT.get(), PrimedNetherTNTEntity.createAttributes().build());
	}
}