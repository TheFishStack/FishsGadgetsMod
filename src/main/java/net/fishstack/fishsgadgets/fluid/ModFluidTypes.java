package net.fishstack.fishsgadgets.fluid;

import org.joml.Vector3f;
import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation FISHSTACK_STILL_RL = new ResourceLocation(FishsGadgetsMod.MOD_ID,"block/fishstack_still");
    public static final ResourceLocation FISHSTACK_FLOWING_RL = new ResourceLocation(FishsGadgetsMod.MOD_ID,"block/fishstack_flow");
    public static final ResourceLocation FISHSTACK_OVERLAY_RL = new ResourceLocation(FishsGadgetsMod.MOD_ID, "block/fishstack_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, FishsGadgetsMod.MOD_ID);

    public static final RegistryObject<FluidType> FISHSTACK_FLUID_TYPE = registerFluidType("fishstack_fluid",
            new BaseFluidType(FISHSTACK_STILL_RL, FISHSTACK_FLOWING_RL, FISHSTACK_OVERLAY_RL, 0xA13d85c6,
                    new Vector3f(61f / 255f, 133f / 255f, 198f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));


    public static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}