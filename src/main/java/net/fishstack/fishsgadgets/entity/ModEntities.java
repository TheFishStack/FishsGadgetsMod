package net.fishstack.fishsgadgets.entity;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.entity.custom.PhilzLausEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.text.html.parser.Entity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FishsGadgetsMod.MOD_ID);

    public static final RegistryObject<EntityType<PhilzLausEntity>> PHILZLAUS =
            ENTITY_TYPES.register("philzlaus", () -> EntityType.Builder.of(PhilzLausEntity::new, MobCategory.MONSTER)
                .sized(0.5f, 0.5f).build("philzlaus"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}


