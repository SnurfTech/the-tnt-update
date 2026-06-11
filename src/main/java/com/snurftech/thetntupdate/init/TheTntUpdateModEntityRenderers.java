/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.snurftech.thetntupdate.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.snurftech.thetntupdate.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class TheTntUpdateModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_FIVEX_TNT.get(), PrimedFivexTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_TENX_TNT.get(), PrimedTenxTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_TWOX_TNT.get(), PrimedTwoxTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_NUCLEAR_TNT.get(), PrimedNuclearTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_HOLE_TNT.get(), PrimedHoleTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_DIAMOND_ORE_TNT.get(), PrimedDiamondOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_DEEPSLATE_DIAMOND_ORE_TNT.get(), PrimedDeepslateDiamondOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_EMERALD_ORE_TNT.get(), PrimedEmeraldOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_DEEPSLATE_EMERALD_ORE_TNT.get(), PrimedDeepslateEmeraldOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_REDSTONE_ORE_TNT.get(), PrimedRedstoneOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_DEEPSLATE_REDSTONE_ORE_TNT.get(), PrimedDeepslateRedstoneOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_GOLD_ORE_TNT.get(), PrimedGoldOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_DEEPSLATE_GOLD_ORE_TNT.get(), PrimedDeepslateGoldOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_NETHER_GOLD_ORE_TNT.get(), PrimedNetherGoldOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_IRON_ORE_TNT.get(), PrimedIronOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_DEEPSLATE_IRON_ORE_TNT.get(), PrimedDeepslateIronOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_COAL_ORE_TNT.get(), PrimedCoalOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_DEEPSLATE_COAL_ORE_TNT.get(), PrimedDeepslateCoalOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_COPPER_ORE_TNT.get(), PrimedCopperOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_DEEPSLATE_COPPER_ORE_TNT.get(), PrimedDeepslateCopperOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_LAPIS_LAZULI_ORE_TNT.get(), PrimedLapisLazuliOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_DEEPSLATE_LAPIS_LAZULI_ORE_TNT.get(), PrimedDeepslateLapisLazuliOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_NETHER_QUARTZ_ORE_TNT.get(), PrimedNetherQuartzOreTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_ANCIENT_DEBRIS_TNT.get(), PrimedAncientDebrisTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_WORLD_EATER_TNT.get(), PrimedWorldEaterTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_ICE_TNT.get(), PrimedIceTNTRenderer::new);
		event.registerEntityRenderer(TheTntUpdateModEntities.PRIMED_NETHER_TNT.get(), PrimedNetherTNTRenderer::new);
	}
}