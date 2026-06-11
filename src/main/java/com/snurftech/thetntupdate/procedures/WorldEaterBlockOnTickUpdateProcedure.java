package com.snurftech.thetntupdate.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.snurftech.thetntupdate.init.TheTntUpdateModBlocks;

public class WorldEaterBlockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x - 1, y - 1, z), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x, y - 1, z - 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
					world.setBlock(BlockPos.containing(x, y - 1, z), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x, y - 1, z + 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x + 1, y - 1, z), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
		}
		if (!world.isClientSide()) {
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x - 1, y, z - 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x - 1, y, z), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x - 1, y, z + 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x, y, z - 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x, y, z + 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x + 1, y, z - 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x + 1, y, z), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x + 1, y, z + 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
		}
		if (!world.isClientSide()) {
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x - 1, y + 1, z), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x, y + 1, z - 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR)) {
				if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
					world.setBlock(BlockPos.containing(x, y + 1, z), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x, y + 1, z + 1), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.AIR)) {
					if (!((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get())) {
						world.setBlock(BlockPos.containing(x + 1, y + 1, z), TheTntUpdateModBlocks.WORLD_EATER_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}