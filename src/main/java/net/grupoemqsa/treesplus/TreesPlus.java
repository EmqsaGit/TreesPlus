package net.grupoemqsa.treesplus;

import net.fabricmc.api.ModInitializer;
import net.grupoemqsa.treesplus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreesPlus implements ModInitializer {
	public static final String TREESPLUS = "treesplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(TREESPLUS);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
