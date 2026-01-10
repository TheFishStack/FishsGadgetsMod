package net.fishstack.fishsgadgets.fluids;

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
    // public static final ResourceLocation FISHSTACK_STILL_RL = new ResourceLocation("block/fishstack_still");
    // public static final ResourceLocation FISHSTACK_FLOWING_RL = new ResourceLocation("block/fishstack_flow");
    public static final ResourceLocation FISH_STACK_OVERLAY = new ResourceLocation(FishsGadgetsMod.MOD_ID, "block/fishstack_overlay");


    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation(FishsGadgetsMod.MOD_ID, "block/fishstack_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation(FishsGadgetsMod.MOD_ID, "block/fishstack_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, FishsGadgetsMod.MOD_ID);

    public static final RegistryObject<FluidType> FISH_STACK_FLUID_TYPE = register("fishstack_fluid",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.WATER_AMBIENT));


    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, FISH_STACK_OVERLAY,
                0xA1E038D0, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}