package net.fishstack.fishsgadgets.fluid;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.block.ModBlocks;
import net.fishstack.fishsgadgets.item.ModItems;
import net.minecraft.world.level.material.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, FishsGadgetsMod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_FISHSTACK_FLUID = FLUIDS.register("fishstack_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.FISHSTACK_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FISHSTACK_FLUID= FLUIDS.register("flowing_fishstack",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FISHSTACK_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties FISHSTACK_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.FISHSTACK_FLUID_TYPE, SOURCE_FISHSTACK_FLUID, FLOWING_FISHSTACK_FLUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.FISHSTACK_FLUID_BLOCK)
            .bucket(ModItems.FISHSTACK_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}