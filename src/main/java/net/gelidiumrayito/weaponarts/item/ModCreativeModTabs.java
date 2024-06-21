package net.gelidiumrayito.weaponarts.item;

import net.gelidiumrayito.weaponarts.WeaponArts;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponArts.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WEAPON_ARTS_TAB = CREATIVE_MODE_TABS.register("weaponarts_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARTPOINT.get()))
                    .title(Component.translatable("creativetab.weaponarts_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ARTPOINT.get());
                        pOutput.accept(ModItems.GREATARTPOINT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
