package com.miki.bedrockitetools.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import com.miki.bedrockitetools.item.BedrockiteSwordItem;
import com.miki.bedrockitetools.item.BedrockiteShovelItem;
import com.miki.bedrockitetools.item.BedrockiteHoeItem;
import com.miki.bedrockitetools.item.BedrockiteAxeItem;
import com.miki.bedrockitetools.BedrockiteToolsMod;

public class BedrockiteToolsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BedrockiteToolsMod.MODID);
	public static final DeferredItem<Item> BEDROCKITE_SWORD;
	public static final DeferredItem<Item> BEDROCKITE_AXE;
	public static final DeferredItem<Item> BEDROCKITE_SHOVEL;
	public static final DeferredItem<Item> BEDROCKITE_HOE;
	static {
		BEDROCKITE_SWORD = REGISTRY.register("bedrockite_sword", BedrockiteSwordItem::new);
		BEDROCKITE_AXE = REGISTRY.register("bedrockite_axe", BedrockiteAxeItem::new);
		BEDROCKITE_SHOVEL = REGISTRY.register("bedrockite_shovel", BedrockiteShovelItem::new);
		BEDROCKITE_HOE = REGISTRY.register("bedrockite_hoe", BedrockiteHoeItem::new);
	}
}