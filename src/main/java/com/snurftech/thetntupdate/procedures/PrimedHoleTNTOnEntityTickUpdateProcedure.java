package com.snurftech.thetntupdate.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class PrimedHoleTNTOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double loopX = 0;
		double loopY = 0;
		double loopZ = 0;
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
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.BLOCK);
			loopY = 0;
			for (int index0 = 0; index0 < 50; index0++) {
				loopX = 0;
				for (int index1 = 0; index1 < 3; index1++) {
					loopZ = 0;
					for (int index2 = 0; index2 < 3; index2++) {
						if (!(Blocks.BEDROCK == (world.getBlockState(BlockPos.containing((x + loopX) - 1, y - loopY, (z + loopZ) - 1))).getBlock())) {
							world.destroyBlock(BlockPos.containing((x + loopX) - 1, y - loopY, (z + loopZ) - 1), false);
						}
						loopZ = loopZ + 1;
					}
					loopX = loopX + 1;
				}
				loopY = loopY + 1;
			}
			entity.getPersistentData().putDouble("mobEntityTimer", 0);
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}