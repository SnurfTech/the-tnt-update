package com.snurftech.thetntupdate.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class PrimedNetherTNTOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double loopZ = 0;
		double loopX = 0;
		double loopY = 0;
		double radius = 0;
		{
			Entity _ent = entity;
			_ent.setYRot(45);
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		entity.getPersistentData().putDouble("mobEntityTimer", (entity.getPersistentData().getDoubleOr("mobEntityTimer", 0) + 0.05));
		if (entity.getPersistentData().getDoubleOr("mobEntityTimer", 0) >= 4) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.explode")), SoundSource.NEUTRAL, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.explode")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 6, 6, 6, 1);
			radius = 10;
			loopX = 0;
			for (int index0 = 0; index0 < (int) (radius * 2 + 1); index0++) {
				loopY = 0;
				for (int index1 = 0; index1 < (int) (radius * 2 + 1); index1++) {
					loopZ = 0;
					for (int index2 = 0; index2 < (int) (radius * 2 + 1); index2++) {
						if (Math.pow(loopX - radius, 2) + Math.pow(loopY - radius, 2) + Math.pow(loopZ - radius, 2) <= Math.pow(radius, 2)) {
							if (!(Blocks.AIR == (world.getBlockState(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius))).getBlock())) {
								if ((world.getBlockState(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))) {
									world.setBlock(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius), Blocks.WARPED_STEM.defaultBlockState(), 3);
								} else {
									if ((world.getBlockState(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius))).is(BlockTags.create(ResourceLocation.parse("minecraft:leaves")))) {
										world.setBlock(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius), Blocks.WARPED_WART_BLOCK.defaultBlockState(), 3);
									} else {
										if (Blocks.GRASS_BLOCK == (world.getBlockState(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius))).getBlock()) {
											world.setBlock(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius), Blocks.WARPED_NYLIUM.defaultBlockState(), 3);
										} else {
											if ((world.getBlockState(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius))).is(BlockTags.create(ResourceLocation.parse("minecraft:flowers")))) {
												world.setBlock(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius), Blocks.WARPED_ROOTS.defaultBlockState(), 3);
											} else {
												if ((world.getBlockState(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius))).is(BlockTags.create(ResourceLocation.parse("minecraft:planks")))) {
													world.setBlock(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius), Blocks.WARPED_PLANKS.defaultBlockState(), 3);
												} else {
													if ((world.getBlockState(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius))).is(BlockTags.create(ResourceLocation.parse("minecraft:doors")))) {
														world.setBlock(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius), Blocks.WARPED_DOOR.defaultBlockState(), 3);
													} else {
														if ((world.getBlockState(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius))).is(BlockTags.create(ResourceLocation.parse("minecraft:stairs")))) {
															world.setBlock(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius), Blocks.WARPED_STAIRS.defaultBlockState(), 3);
														} else {
															if (Blocks.WATER == (world.getBlockState(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius))).getBlock()) {
																world.setBlock(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius), Blocks.LAVA.defaultBlockState(), 3);
															} else {
																world.setBlock(BlockPos.containing(x + loopX - radius, y + loopY - radius, z + loopZ - radius), Blocks.NETHERRACK.defaultBlockState(), 3);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
						loopZ = loopZ + 1;
					}
					loopY = loopY + 1;
				}
				loopX = loopX + 1;
			}
			entity.getPersistentData().putDouble("mobEntityTimer", 0);
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}