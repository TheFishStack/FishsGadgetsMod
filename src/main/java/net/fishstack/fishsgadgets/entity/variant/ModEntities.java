package net.fishstack.fishsgadgets.entity.variant;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.entity.custom.SmokeGrenadeEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FishsGadgetsMod.MOD_ID);

    public static final RegistryObject<EntityType<SmokeGrenadeEntity>> SMOKE_GRENADE_PROJECTILE =
            ENTITY_TYPES.register("smoke_grenade_projectile",
                    () -> EntityType.Builder.<SmokeGrenadeEntity>of(SmokeGrenadeEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .setCustomClientFactory((spawnEntity, level) -> new SmokeGrenadeEntity(level))
                            .build("smoke_grenade_projectile"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
