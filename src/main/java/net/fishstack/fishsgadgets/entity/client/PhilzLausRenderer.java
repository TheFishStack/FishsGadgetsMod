package net.fishstack.fishsgadgets.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.entity.custom.PhilzLausEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class PhilzLausRenderer extends MobRenderer<PhilzLausEntity, PhilzLausModel<PhilzLausEntity>> {
    public PhilzLausRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PhilzLausModel<>(pContext.bakeLayer(ModModelLayers.PHILZLAUS_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(PhilzLausEntity pEntity) {
        return new ResourceLocation(FishsGadgetsMod.MOD_ID, "textures/entity/philzlaus_texture.png");
    }
}

