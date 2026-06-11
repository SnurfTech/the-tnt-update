/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.snurftech.thetntupdate.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

import com.snurftech.thetntupdate.TheTntUpdateMod;

public class TheTntUpdateModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TheTntUpdateMod.MODID);
	public static final DeferredItem<Item> FIVEX_TNT;
	public static final DeferredItem<Item> TENX_TNT;
	public static final DeferredItem<Item> TWOX_TNT;
	public static final DeferredItem<Item> IMMEDIATE_TNT;
	public static final DeferredItem<Item> NUCLEAR_TNT;
	public static final DeferredItem<Item> HOLE_TNT;
	public static final DeferredItem<Item> DIAMOND_ORE_TNT;
	public static final DeferredItem<Item> DEEPSLATE_DIAMOND_ORE_TNT;
	public static final DeferredItem<Item> EMERALD_ORE_TNT;
	public static final DeferredItem<Item> DEEPSLATE_EMERALD_ORE_TNT;
	public static final DeferredItem<Item> REDSTONE_ORE_TNT;
	public static final DeferredItem<Item> DEEPSLATE_REDSTONE_ORE_TNT;
	public static final DeferredItem<Item> GOLD_ORE_TNT;
	public static final DeferredItem<Item> DEEPSLATE_GOLD_ORE_TNT;
	public static final DeferredItem<Item> NETHER_GOLD_ORE_TNT;
	public static final DeferredItem<Item> IRON_ORE_TNT;
	public static final DeferredItem<Item> DEEPSLATE_IRON_ORE_TNT;
	public static final DeferredItem<Item> COAL_ORE_TNT;
	public static final DeferredItem<Item> DEEPSLATE_COAL_ORE_TNT;
	public static final DeferredItem<Item> COPPER_ORE_TNT;
	public static final DeferredItem<Item> DEEPSLATE_COPPER_ORE_TNT;
	public static final DeferredItem<Item> LAPIS_LAZULI_ORE_TNT;
	public static final DeferredItem<Item> DEEPSLATE_LAPIS_LAZULI_ORE_TNT;
	public static final DeferredItem<Item> NETHER_QUARTZ_ORE_TNT;
	public static final DeferredItem<Item> ANCIENT_DEBRIS_TNT;
	public static final DeferredItem<Item> WORLD_EATER_TNT;
	public static final DeferredItem<Item> ICE_TNT;
	public static final DeferredItem<Item> NETHER_TNT;
	static {
		FIVEX_TNT = block(TheTntUpdateModBlocks.FIVEX_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		TENX_TNT = block(TheTntUpdateModBlocks.TENX_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		TWOX_TNT = block(TheTntUpdateModBlocks.TWOX_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		IMMEDIATE_TNT = block(TheTntUpdateModBlocks.IMMEDIATE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		NUCLEAR_TNT = block(TheTntUpdateModBlocks.NUCLEAR_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		HOLE_TNT = block(TheTntUpdateModBlocks.HOLE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		DIAMOND_ORE_TNT = block(TheTntUpdateModBlocks.DIAMOND_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		DEEPSLATE_DIAMOND_ORE_TNT = block(TheTntUpdateModBlocks.DEEPSLATE_DIAMOND_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		EMERALD_ORE_TNT = block(TheTntUpdateModBlocks.EMERALD_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		DEEPSLATE_EMERALD_ORE_TNT = block(TheTntUpdateModBlocks.DEEPSLATE_EMERALD_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		REDSTONE_ORE_TNT = block(TheTntUpdateModBlocks.REDSTONE_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		DEEPSLATE_REDSTONE_ORE_TNT = block(TheTntUpdateModBlocks.DEEPSLATE_REDSTONE_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		GOLD_ORE_TNT = block(TheTntUpdateModBlocks.GOLD_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		DEEPSLATE_GOLD_ORE_TNT = block(TheTntUpdateModBlocks.DEEPSLATE_GOLD_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		NETHER_GOLD_ORE_TNT = block(TheTntUpdateModBlocks.NETHER_GOLD_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		IRON_ORE_TNT = block(TheTntUpdateModBlocks.IRON_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		DEEPSLATE_IRON_ORE_TNT = block(TheTntUpdateModBlocks.DEEPSLATE_IRON_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		COAL_ORE_TNT = block(TheTntUpdateModBlocks.COAL_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		DEEPSLATE_COAL_ORE_TNT = block(TheTntUpdateModBlocks.DEEPSLATE_COAL_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		COPPER_ORE_TNT = block(TheTntUpdateModBlocks.COPPER_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		DEEPSLATE_COPPER_ORE_TNT = block(TheTntUpdateModBlocks.DEEPSLATE_COPPER_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		LAPIS_LAZULI_ORE_TNT = block(TheTntUpdateModBlocks.LAPIS_LAZULI_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		DEEPSLATE_LAPIS_LAZULI_ORE_TNT = block(TheTntUpdateModBlocks.DEEPSLATE_LAPIS_LAZULI_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		NETHER_QUARTZ_ORE_TNT = block(TheTntUpdateModBlocks.NETHER_QUARTZ_ORE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		ANCIENT_DEBRIS_TNT = block(TheTntUpdateModBlocks.ANCIENT_DEBRIS_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		WORLD_EATER_TNT = block(TheTntUpdateModBlocks.WORLD_EATER_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		ICE_TNT = block(TheTntUpdateModBlocks.ICE_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
		NETHER_TNT = block(TheTntUpdateModBlocks.NETHER_TNT, new Item.Properties().rarity(Rarity.UNCOMMON));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}