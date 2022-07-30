package net.zimbobub.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.zimbobub.tutorialmod.TutorialMod;

public class ModItemGroup {
    public static final ItemGroup MYMOD = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "mymod"), () -> new ItemStack(ModItems.AMOGUS));

}
