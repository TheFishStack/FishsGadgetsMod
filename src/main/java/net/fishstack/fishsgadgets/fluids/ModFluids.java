package net.fishstack.fishsgadgets.fluids;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.block.ModBlocks;
import net.fishstack.fishsgadgets.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.*;

import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidInteractionRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.intellij.lang.annotations.Flow;

import java.util.function.Supplier;


public class ModFluids extends FlowingFluid {
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

    private void fizz(LevelAccessor pLevel, BlockPos pPos) {
        pLevel.levelEvent(1501, pPos, 0);
    }

    @Override
    public Fluid getFlowing() {
        return null;
    }

    @Override
    public Fluid getSource() {
        return null;
    }

    @Override
    protected boolean canConvertToSource(Level pLevel) {
        return false;
    }

    protected void spreadTo(LevelAccessor pLevel, BlockPos pPos, BlockState pBlockState, Direction pDirection, FluidState pFluidState) {
        if (pDirection == Direction.DOWN) {
            FluidState fluidstate = pLevel.getFluidState(pPos);
            if ((this.equals(FLOWING_FISHSTACK_FLUID) | this.equals(SOURCE_FISHSTACK_FLUID)) && fluidstate.is(FluidTags.WATER)) {
                if (pBlockState.getBlock() instanceof LiquidBlock) {
                    pLevel.setBlock(pPos, ForgeEventFactory.fireFluidPlaceBlockEvent(pLevel, pPos, pPos, Blocks.STONE.defaultBlockState()), 3);
                }

                this.fizz(pLevel, pPos);
                return;
            }
        }

        super.spreadTo(pLevel, pPos, pBlockState, pDirection, pFluidState);
    }

    @Override
    protected void beforeDestroyingBlock(LevelAccessor pLevel, BlockPos pPos, BlockState pState) {

    }

    @Override
    protected int getSlopeFindDistance(LevelReader pLevel) {
        return 0;
    }

    @Override
    protected int getDropOff(LevelReader pLevel) {
        return 0;
    }

    @Override
    public Item getBucket() {
        return null;
    }

    @Override
    protected boolean canBeReplacedWith(FluidState pState, BlockGetter pLevel, BlockPos pPos, Fluid pFluid, Direction pDirection) {
        return false;
    }

    @Override
    public int getTickDelay(LevelReader pLevel) {
        return 0;
    }

    @Override
    protected float getExplosionResistance() {
        return 0;
    }

    @Override
    protected BlockState createLegacyBlock(FluidState pState) {
        return null;
    }

    @Override
    public boolean isSource(FluidState pState) {
        return false;
    }

    @Override
    public int getAmount(FluidState pState) {
        return 0;
    }

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}