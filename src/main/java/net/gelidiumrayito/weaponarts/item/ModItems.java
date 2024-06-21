package net.gelidiumrayito.weaponarts.item;

import net.gelidiumrayito.weaponarts.WeaponArts;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WeaponArts.MOD_ID);

    public static final RegistryObject<Item> ARTPOINT = ITEMS.register("artpoint",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GREATARTPOINT = ITEMS.register("great_artpoint",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}