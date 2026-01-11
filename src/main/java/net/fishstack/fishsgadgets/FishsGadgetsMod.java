package net.fishstack.fishsgadgets;

import com.mojang.logging.LogUtils;
import net.fishstack.fishsgadgets.block.ModBlocks;
import net.fishstack.fishsgadgets.entity.variant.ModEntities;
import net.fishstack.fishsgadgets.fluid.ModFluidTypes;
import net.fishstack.fishsgadgets.fluid.ModFluids;
import net.fishstack.fishsgadgets.item.ModCreativeModeTabs;
import net.fishstack.fishsgadgets.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(FishsGadgetsMod.MOD_ID)
public class FishsGadgetsMod {
    public static final String MOD_ID = "fishsgadgets";
    private static final Logger LOGGER = LogUtils.getLogger();


    public FishsGadgetsMod(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.WAND);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.TUNGSTEEN_CUBE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_FISHSTACK_FLUID.get(), RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_FISHSTACK_FLUID.get(), RenderType.translucent());

         EntityRenderers.register(ModEntities.SMOKE_GRENADE_PROJECTILE.get(), ThrownItemRenderer::new);
        }
    }
}