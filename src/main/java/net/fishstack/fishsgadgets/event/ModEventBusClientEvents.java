package net.fishstack.fishsgadgets.event;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.entity.client.ModModelLayers;
import net.fishstack.fishsgadgets.entity.client.PhilzLausModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FishsGadgetsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PHILZLAUS_LAYER, PhilzLausModel::createBodyLayer);
    }
}
