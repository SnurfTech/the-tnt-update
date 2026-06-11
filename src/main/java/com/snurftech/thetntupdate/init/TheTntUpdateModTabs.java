/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.snurftech.thetntupdate.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.snurftech.thetntupdate.TheTntUpdateMod;

@EventBusSubscriber
public class TheTntUpdateModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheTntUpdateMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(TheTntUpdateModBlocks.FIVEX_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.TENX_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.TWOX_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.IMMEDIATE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.NUCLEAR_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.HOLE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.DIAMOND_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.DEEPSLATE_DIAMOND_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.EMERALD_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.DEEPSLATE_EMERALD_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.REDSTONE_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.DEEPSLATE_REDSTONE_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.GOLD_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.DEEPSLATE_GOLD_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.NETHER_GOLD_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.IRON_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.DEEPSLATE_IRON_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.COAL_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.DEEPSLATE_COAL_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.COPPER_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.DEEPSLATE_COPPER_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.LAPIS_LAZULI_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.DEEPSLATE_LAPIS_LAZULI_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.NETHER_QUARTZ_ORE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.ANCIENT_DEBRIS_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.WORLD_EATER_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.ICE_TNT.get().asItem());
			tabData.accept(TheTntUpdateModBlocks.NETHER_TNT.get().asItem());
		}
	}
}