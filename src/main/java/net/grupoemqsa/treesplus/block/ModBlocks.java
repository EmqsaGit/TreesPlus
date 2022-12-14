package net.grupoemqsa.treesplus.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.grupoemqsa.treesplus.TreesPlus;
import net.grupoemqsa.treesplus.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block BLOODWOOD_LOG = registerBlock("bloodwood_log",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(3f)), ModItemGroup.LOGS);



    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TreesPlus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register((Registry.ITEM), new Identifier(TreesPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TreesPlus.LOGGER.debug("Registering Mod Blocks for " + TreesPlus.MOD_ID);

    }
}
