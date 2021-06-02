package com.ejs.potionedweapons;

import com.ejs.potionedweapons.enchantments.HarmingEnchant;
import com.ejs.potionedweapons.enchantments.HealingEnchant;
import com.ejs.potionedweapons.enchantments.PoisonEnchant;
import com.ejs.potionedweapons.enchantments.SlownessEnchant;
import com.ejs.potionedweapons.enchantments.WeaknessEnchant;
import com.ejs.potionedweapons.registry.ModItems;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PotionedWeapons implements ModInitializer{

	public static final String MOD_ID = "potionedweapons";
	public static Enchantment HARMING_ENCHANT = Registry.register(
			Registry.ENCHANTMENT, 
			new Identifier(MOD_ID, "harming_enchant"), 
			new HarmingEnchant());
	public static Enchantment HEALING_ENCHANT = Registry.register(
			Registry.ENCHANTMENT, 
			new Identifier(MOD_ID, "healing_enchant"), 
			new HealingEnchant());
	public static Enchantment POISON_ENCHANT = Registry.register(
			Registry.ENCHANTMENT, 
			new Identifier(MOD_ID, "poison_enchant"), 
			new PoisonEnchant());
	public static Enchantment WEAKNESS_ENCHANT = Registry.register(
			Registry.ENCHANTMENT, 
			new Identifier(MOD_ID, "weakness_enchant"), 
			new WeaknessEnchant());
	public static Enchantment SLOWNESS_ENCHANT = Registry.register(
			Registry.ENCHANTMENT, 
			new Identifier(MOD_ID, "slowess_enchant"), 
			new SlownessEnchant());
	
	@Override
	public void onInitialize() {
		ModItems.registerItems();
	}
   }