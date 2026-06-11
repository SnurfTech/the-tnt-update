package com.snurftech.thetntupdate.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import com.snurftech.thetntupdate.init.TheTntUpdateModEntities;

public class NetherGoldOreTNTBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.tnt.primed")), SoundSource.NEUTRAL, 1, (float) 1.5);
			} else {
				_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.tnt.primed")), SoundSource.NEUTRAL, 1, (float) 1.5, false);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = TheTntUpdateModEntities.PRIMED_NETHER_GOLD_ORE_TNT.get().spawn(_level, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(45);
				entityToSpawn.setYBodyRot(45);
				entityToSpawn.setYHeadRot(45);
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}