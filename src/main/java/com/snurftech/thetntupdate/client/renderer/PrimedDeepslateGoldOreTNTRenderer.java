package com.snurftech.thetntupdate.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.snurftech.thetntupdate.entity.PrimedDeepslateGoldOreTNTEntity;
import com.snurftech.thetntupdate.client.model.ModelBlock_Entity;

public class PrimedDeepslateGoldOreTNTRenderer extends MobRenderer<PrimedDeepslateGoldOreTNTEntity, LivingEntityRenderState, ModelBlock_Entity> {
	private PrimedDeepslateGoldOreTNTEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_tnt_update:textures/entities/primed_deepslate_gold_ore_tnt_texture.png");

	public PrimedDeepslateGoldOreTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBlock_Entity(context.bakeLayer(ModelBlock_Entity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PrimedDeepslateGoldOreTNTEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}