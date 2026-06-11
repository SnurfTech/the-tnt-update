/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.snurftech.thetntupdate.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.snurftech.thetntupdate.client.model.ModelBlock_Entity;

@EventBusSubscriber(Dist.CLIENT)
public class TheTntUpdateModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBlock_Entity.LAYER_LOCATION, ModelBlock_Entity::createBodyLayer);
	}
}