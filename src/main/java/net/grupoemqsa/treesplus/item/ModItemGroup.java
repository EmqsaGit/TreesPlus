package net.grupoemqsa.treesplus.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.grupoemqsa.treesplus.TreesPlus;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup LOGS = FabricItemGroupBuilder.build(
            new Identifier(TreesPlus.MOD_ID, "logs"), () -> new ItemStack(ModItems.LOGS));

}
