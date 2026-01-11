package net.fishstack.fishsgadgets.item.custom;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.entity.ModEntities;
import net.fishstack.fishsgadgets.entity.custom.PhilzLausEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.server.RegistryLayer;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.Tags;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import team.lodestar.lodestone.registry.common.particle.LodestoneParticleRegistry;
import team.lodestar.lodestone.systems.easing.Easing;
import team.lodestar.lodestone.systems.particle.builder.WorldParticleBuilder;
import team.lodestar.lodestone.systems.particle.data.GenericParticleData;
import team.lodestar.lodestone.systems.particle.data.color.ColorParticleData;
import team.lodestar.lodestone.systems.particle.render_types.LodestoneWorldParticleRenderType;

import java.awt.*;

import static com.ibm.icu.impl.ValidIdentifiers.Datatype.x;

public class CoolerStaff extends Item {

        public CoolerStaff(Properties pProperties) {
            super(pProperties);
        }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, @NotNull Player pPlayer, @NotNull InteractionHand pUsedHand) {
        int philzlaus_count = 5;

        BlockHitResult blockhitresult = getPlayerViewedBlockResult(pLevel, pPlayer, ClipContext.Fluid.NONE);
        BlockPos lookPos = blockhitresult.getBlockPos().above();
        // pLevel.explode(pPlayer, lookPos.getX(), lookPos.getY(), lookPos.getZ(), (float) explosionRadius, Level.ExplosionInteraction.TNT);
        addOneEntity(pLevel, lookPos);

        // pPlayer.getCooldowns().addCooldown(this, 100);
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    private void addOneEntity(@NotNull Level pLevel, BlockPos lookPos) {
        PhilzLausEntity philzLaus = new PhilzLausEntity(ModEntities.PHILZLAUS.get(), pLevel);
        philzLaus.setPos(lookPos.getX(), lookPos.getY(), lookPos.getZ());
        pLevel.addFreshEntity(philzLaus);
    }

    protected static BlockHitResult getPlayerViewedBlockResult(Level pLevel, Player pPlayer, ClipContext.Fluid pFluidMode) {
        double range = 100;

        float f = pPlayer.getXRot();
        float f1 = pPlayer.getYRot();
        Vec3 vec3 = pPlayer.getEyePosition();
        float f2 = Mth.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f3 = Mth.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f4 = -Mth.cos(-f * ((float)Math.PI / 180F));
        float f5 = Mth.sin(-f * ((float)Math.PI / 180F));
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        Vec3 vec31 = vec3.add((double)f6 * range, (double)f5 * range, (double)f7 * range);
        return pLevel.clip(new ClipContext(vec3, vec31, ClipContext.Block.OUTLINE, pFluidMode, pPlayer));
    }

    public static void spawnTestParticles(Level pLevel, BlockPos pPos) {
        Color startingColor = new Color(0, 0, 0);
        Color endingColor = new Color(104, 104, 104);
        WorldParticleBuilder.create(LodestoneParticleRegistry.WISP_PARTICLE)
                .setRenderType(LodestoneWorldParticleRenderType.LUMITRANSPARENT)
                .setScaleData(GenericParticleData.create(1, 5, 1).build())
                .setTransparencyData(GenericParticleData.create(1, 0.25f).build())
                .setColorData(ColorParticleData.create(startingColor, endingColor).setCoefficient(1.4f).setEasing(Easing.QUARTIC_OUT).build())
                .setLifetime(200)
                .addMotion(0, 0.01f, 0)
                .enableNoClip()
                .spawn(pLevel, pPos.getX() + 0.5, pPos.getY() + 0.5, pPos.getZ() + 0.5);
    }
}
