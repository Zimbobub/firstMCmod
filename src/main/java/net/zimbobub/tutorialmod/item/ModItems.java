package net.zimbobub.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zimbobub.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item BONELESS_PIZZA = registerItem("boneless_pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.MYMOD)));
    public static final Item AMOGUS = registerItem("amogus",
            new Item(new FabricItemSettings().group(ModItemGroup.MYMOD)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
