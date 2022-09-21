package net.grupoemqsa.treesplus;

import net.fabricmc.api.ModInitializer;
import net.grupoemqsa.treesplus.block.ModBlocks;
import net.grupoemqsa.treesplus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreesPlus implements ModInitializer {
	public static final String MOD_ID = "treesplus";
	//public static final String TREESPLUS = "treesplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//public static final String MOD_ID = ;

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
