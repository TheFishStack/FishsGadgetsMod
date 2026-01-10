package net.fishstack.fishsgadgets.fluids;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.block.ModBlocks;
import net.fishstack.fishsgadgets.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidInteractionRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, FishsGadgetsMod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_FISHSTACK_FLUID = FLUIDS.register("fishstack_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.FISHSTACK_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FISHSTACK_FLUID= FLUIDS.register("flowing_fishstack",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FISHSTACK_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties FISHSTACK_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.FISH_STACK_FLUID_TYPE, SOURCE_FISHSTACK_FLUID, FLOWING_FISHSTACK_FLUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.FISHSTACK_FLUID_BLOCK)
            .bucket(ModItems.FISHSTACK_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}