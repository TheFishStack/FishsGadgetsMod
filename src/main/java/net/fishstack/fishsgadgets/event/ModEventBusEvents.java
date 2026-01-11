package net.fishstack.fishsgadgets.event;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.entity.ModEntities;
import net.fishstack.fishsgadgets.entity.client.ModModelLayers;
import net.fishstack.fishsgadgets.entity.client.PhilzLausModel;
import net.fishstack.fishsgadgets.entity.custom.PhilzLausEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FishsGadgetsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PHILZLAUS.get(), PhilzLausEntity.createAttributes().build());
    }
}
