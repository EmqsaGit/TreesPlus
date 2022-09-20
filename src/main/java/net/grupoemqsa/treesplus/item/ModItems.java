package net.grupoemqsa.treesplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.grupoemqsa.treesplus.TreesPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier

public class ModItems {

    public static final Item BLOODWOOD_LOG = registerItem("bloodwood_log",
            new Item(new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).maxCount(128)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TreesPlus.TREESPLUS, name), item);
    }

    public static void registerModItems() {
        TreesPlus.LOGGER.debug("Registering Mod Items for " + TreesPlus.TREESPLUS)
    }
}
