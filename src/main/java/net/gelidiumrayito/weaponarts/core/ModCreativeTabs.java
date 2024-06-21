package net.gelidiumrayito.weaponarts.core;

import net.gelidiumrayito.weaponarts.WeaponArts;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponArts.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WEAPON_ARTS_TAB = CREATIVE_MODE_TABS.register("weaponarts_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARTPOINT.get()))
                    .title(Component.translatable("creativetab.weaponarts_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ARTPOINT.get());

                        pOutput.accept(ModItems.GREATARTPOINT.get());

                        pOutput.accept(ModItems.ART_RUNE.get());

                        pOutput.accept(ModItems.GREAT_ART_RUNE.get());

                        pOutput.accept(ModBlocks.ART_BLOCK.get());

                        pOutput.accept(ModBlocks.GREAT_ART_BLOCK.get());

                        pOutput.accept(ModBlocks.ART_ORE.get());

                        pOutput.accept(ModBlocks.GREAT_ART_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
