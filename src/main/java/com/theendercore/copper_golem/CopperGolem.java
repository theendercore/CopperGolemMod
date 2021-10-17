package com.theendercore.copper_golem;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

public class CopperGolem implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("copper_golem");
	public static final String MODID = "copper_golem";
	public static final Item COPPER_GOLEM_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		GeckoLib.initialize();
		Registry.register(Registry.ITEM, new Identifier(MODID, "copper_golem_item"), COPPER_GOLEM_ITEM);
		LOGGER.info("COPPER GOLEM!!!");
	}
}
