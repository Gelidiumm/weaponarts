package net.gelidiumrayito.weaponarts.core;

import net.gelidiumrayito.weaponarts.WeaponArts;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WeaponArts.MOD_ID);
    public static final RegistryObject<Item> ARTPOINT = ITEMS.register("artpoint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREATARTPOINT = ITEMS.register("great_artpoint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ART_RUNE = ITEMS.register("artrune", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREAT_ART_RUNE = ITEMS.register("great_artrune", () -> new Item(new Item.Properties()));
    
    private ModItems() { }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}