/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.snurftech.thetntupdate.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

import com.snurftech.thetntupdate.block.*;
import com.snurftech.thetntupdate.TheTntUpdateMod;

public class TheTntUpdateModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TheTntUpdateMod.MODID);
	public static final DeferredBlock<Block> FIVEX_TNT;
	public static final DeferredBlock<Block> TENX_TNT;
	public static final DeferredBlock<Block> TWOX_TNT;
	public static final DeferredBlock<Block> IMMEDIATE_TNT;
	public static final DeferredBlock<Block> NUCLEAR_TNT;
	public static final DeferredBlock<Block> HOLE_TNT;
	public static final DeferredBlock<Block> DIAMOND_ORE_TNT;
	public static final DeferredBlock<Block> DEEPSLATE_DIAMOND_ORE_TNT;
	public static final DeferredBlock<Block> EMERALD_ORE_TNT;
	public static final DeferredBlock<Block> DEEPSLATE_EMERALD_ORE_TNT;
	public static final DeferredBlock<Block> REDSTONE_ORE_TNT;
	public static final DeferredBlock<Block> DEEPSLATE_REDSTONE_ORE_TNT;
	public static final DeferredBlock<Block> GOLD_ORE_TNT;
	public static final DeferredBlock<Block> DEEPSLATE_GOLD_ORE_TNT;
	public static final DeferredBlock<Block> NETHER_GOLD_ORE_TNT;
	public static final DeferredBlock<Block> IRON_ORE_TNT;
	public static final DeferredBlock<Block> DEEPSLATE_IRON_ORE_TNT;
	public static final DeferredBlock<Block> COAL_ORE_TNT;
	public static final DeferredBlock<Block> DEEPSLATE_COAL_ORE_TNT;
	public static final DeferredBlock<Block> COPPER_ORE_TNT;
	public static final DeferredBlock<Block> DEEPSLATE_COPPER_ORE_TNT;
	public static final DeferredBlock<Block> LAPIS_LAZULI_ORE_TNT;
	public static final DeferredBlock<Block> DEEPSLATE_LAPIS_LAZULI_ORE_TNT;
	public static final DeferredBlock<Block> NETHER_QUARTZ_ORE_TNT;
	public static final DeferredBlock<Block> ANCIENT_DEBRIS_TNT;
	public static final DeferredBlock<Block> WORLD_EATER_BLOCK;
	public static final DeferredBlock<Block> WORLD_EATER_TNT;
	public static final DeferredBlock<Block> ICE_TNT;
	public static final DeferredBlock<Block> NETHER_TNT;
	static {
		FIVEX_TNT = register("fivex_tnt", FivexTNTBlock::new);
		TENX_TNT = register("tenx_tnt", TenxTNTBlock::new);
		TWOX_TNT = register("twox_tnt", TwoxTNTBlock::new);
		IMMEDIATE_TNT = register("immediate_tnt", ImmediateTNTBlock::new);
		NUCLEAR_TNT = register("nuclear_tnt", NuclearTNTBlock::new);
		HOLE_TNT = register("hole_tnt", HoleTNTBlock::new);
		DIAMOND_ORE_TNT = register("diamond_ore_tnt", DiamondOreTNTBlock::new);
		DEEPSLATE_DIAMOND_ORE_TNT = register("deepslate_diamond_ore_tnt", DeepslateDiamondOreTNTBlock::new);
		EMERALD_ORE_TNT = register("emerald_ore_tnt", EmeraldOreTNTBlock::new);
		DEEPSLATE_EMERALD_ORE_TNT = register("deepslate_emerald_ore_tnt", DeepslateEmeraldOreTNTBlock::new);
		REDSTONE_ORE_TNT = register("redstone_ore_tnt", RedstoneOreTNTBlock::new);
		DEEPSLATE_REDSTONE_ORE_TNT = register("deepslate_redstone_ore_tnt", DeepslateRedstoneOreTNTBlock::new);
		GOLD_ORE_TNT = register("gold_ore_tnt", GoldOreTNTBlock::new);
		DEEPSLATE_GOLD_ORE_TNT = register("deepslate_gold_ore_tnt", DeepslateGoldOreTNTBlock::new);
		NETHER_GOLD_ORE_TNT = register("nether_gold_ore_tnt", NetherGoldOreTNTBlock::new);
		IRON_ORE_TNT = register("iron_ore_tnt", IronOreTNTBlock::new);
		DEEPSLATE_IRON_ORE_TNT = register("deepslate_iron_ore_tnt", DeepslateIronOreTNTBlock::new);
		COAL_ORE_TNT = register("coal_ore_tnt", CoalOreTNTBlock::new);
		DEEPSLATE_COAL_ORE_TNT = register("deepslate_coal_ore_tnt", DeepslateCoalOreTNTBlock::new);
		COPPER_ORE_TNT = register("copper_ore_tnt", CopperOreTNTBlock::new);
		DEEPSLATE_COPPER_ORE_TNT = register("deepslate_copper_ore_tnt", DeepslateCopperOreTNTBlock::new);
		LAPIS_LAZULI_ORE_TNT = register("lapis_lazuli_ore_tnt", LapisLazuliOreTNTBlock::new);
		DEEPSLATE_LAPIS_LAZULI_ORE_TNT = register("deepslate_lapis_lazuli_ore_tnt", DeepslateLapisLazuliOreTNTBlock::new);
		NETHER_QUARTZ_ORE_TNT = register("nether_quartz_ore_tnt", NetherQuartzOreTNTBlock::new);
		ANCIENT_DEBRIS_TNT = register("ancient_debris_tnt", AncientDebrisTNTBlock::new);
		WORLD_EATER_BLOCK = register("world_eater_block", WorldEaterBlockBlock::new);
		WORLD_EATER_TNT = register("world_eater_tnt", WorldEaterTNTBlock::new);
		ICE_TNT = register("ice_tnt", IceTNTBlock::new);
		NETHER_TNT = register("nether_tnt", NetherTNTBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}