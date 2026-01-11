package net.fishstack.fishsgadgets.entity.custom;

import net.fishstack.fishsgadgets.entity.variant.ModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import team.lodestar.lodestone.registry.common.particle.LodestoneParticleRegistry;
import team.lodestar.lodestone.systems.easing.Easing;
import team.lodestar.lodestone.systems.particle.builder.WorldParticleBuilder;
import team.lodestar.lodestone.systems.particle.data.GenericParticleData;
import team.lodestar.lodestone.systems.particle.data.color.ColorParticleData;
import team.lodestar.lodestone.systems.particle.render_types.LodestoneWorldParticleRenderType;

import java.awt.*;

public class SmokeGrenadeEntity extends ThrowableItemProjectile {

    public SmokeGrenadeEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public SmokeGrenadeEntity(Level pLevel) {
        this(ModEntities.SMOKE_GRENADE_PROJECTILE.get(), pLevel);
    }
    public SmokeGrenadeEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.SMOKE_GRENADE_PROJECTILE.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }

    public static void spawnTestParticles(Level pLevel, BlockPos pPos) {
        Color startingColor = new Color(0, 0, 0);
        Color endingColor = new Color(104, 104, 104);
        WorldParticleBuilder.create(LodestoneParticleRegistry.WISP_PARTICLE)
                .setRenderType(LodestoneWorldParticleRenderType.LUMITRANSPARENT)
                .setScaleData(GenericParticleData.create(1, 5, 1).build())
                .setTransparencyData(GenericParticleData.create(1, 0.5f).build())
                .setColorData(ColorParticleData.create(startingColor, endingColor).setCoefficient(1.4f).setEasing(Easing.QUARTIC_OUT).build())
                .setLifetime(200)
                .addMotion(0, 0.01f, 0)
                .enableNoClip()
                .spawn(pLevel, pPos.getX() + 0, pPos.getY() + 0.5, pPos.getZ() + 1)
                .spawn(pLevel, pPos.getX() + 1, pPos.getY() + 0.5, pPos.getZ() + 0)
                .spawn(pLevel, pPos.getX() + 1, pPos.getY() + 0.5, pPos.getZ() + 1)
                .spawn(pLevel, pPos.getX() + 0, pPos.getY() + 0.5, pPos.getZ() + 0);
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        if(!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, ((byte) 3));

            BlockPos blockpos = pResult.getBlockPos().relative(pResult.getDirection());

            spawnTestParticles(this.level(), blockpos);

        }

        this.discard();
        super.onHitBlock(pResult);
    }
}
