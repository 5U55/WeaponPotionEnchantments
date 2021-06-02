package com.ejs.potionedweapons;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.util.Identifier;

public class PotionedWeaponsClient implements ClientModInitializer{

	@Override
	public void onInitializeClient() {
		FabricModelPredicateProviderRegistry.register(new Identifier(PotionedWeapons.MOD_ID, "harming_enchanted"), (itemStack, clientWorld, livingEntity) -> {
			if(livingEntity == null) return 0.0F;
			ListTag enchantments = itemStack.getEnchantments();
			ItemStack item = new ItemStack(Items.STONE_SWORD, 1);
			item.addEnchantment(PotionedWeapons.HARMING_ENCHANT, 1);
			ItemStack item2 = new ItemStack(Items.STONE_SWORD, 1);
			item2.addEnchantment(PotionedWeapons.HARMING_ENCHANT, 2);
		      for(int i = 0; i < enchantments.size(); ++i) {
		          CompoundTag compoundTag = enchantments.getCompound(i);
		          if(compoundTag.equals(item.getEnchantments().getCompound(0))||compoundTag.equals(item2.getEnchantments().getCompound(0))) {
		        	  return 1.0F;
		          }
		       }
				return 0.0F;
		});
		
		FabricModelPredicateProviderRegistry.register(new Identifier(PotionedWeapons.MOD_ID, "healing_enchanted"), (itemStack, clientWorld, livingEntity) -> {
			if(livingEntity == null) return 0.0F;
			ListTag enchantments = itemStack.getEnchantments();
			ItemStack item = new ItemStack(Items.STONE_SWORD, 1);
			item.addEnchantment(PotionedWeapons.HEALING_ENCHANT, 1);
			ItemStack item2 = new ItemStack(Items.STONE_SWORD, 1);
			item2.addEnchantment(PotionedWeapons.HEALING_ENCHANT, 2);
		      for(int i = 0; i < enchantments.size(); ++i) {
		          CompoundTag compoundTag = enchantments.getCompound(i);
		          if(compoundTag.equals(item.getEnchantments().getCompound(0)) || compoundTag.equals(item2.getEnchantments().getCompound(0))) {
		        	  return 1.0F;
		          }
		       }
				return 0.0F;
		});
		FabricModelPredicateProviderRegistry.register(new Identifier(PotionedWeapons.MOD_ID, "poison_enchanted"), (itemStack, clientWorld, livingEntity) -> {
			if(livingEntity == null) return 0.0F;
			ListTag enchantments = itemStack.getEnchantments();
			ItemStack item = new ItemStack(Items.STONE_SWORD, 1);
			item.addEnchantment(PotionedWeapons.POISON_ENCHANT, 1);
			ItemStack item2 = new ItemStack(Items.STONE_SWORD, 1);
			item2.addEnchantment(PotionedWeapons.POISON_ENCHANT, 2);
		      for(int i = 0; i < enchantments.size(); ++i) {
		          CompoundTag compoundTag = enchantments.getCompound(i);
		          if(compoundTag.equals(item.getEnchantments().getCompound(0)) || compoundTag.equals(item2.getEnchantments().getCompound(0))) {
		        	  return 1.0F;
		          }
		       }
				return 0.0F;
		});
		FabricModelPredicateProviderRegistry.register(new Identifier(PotionedWeapons.MOD_ID, "slowness_enchanted"), (itemStack, clientWorld, livingEntity) -> {
			if(livingEntity == null) return 0.0F;
			ListTag enchantments = itemStack.getEnchantments();
			ItemStack item = new ItemStack(Items.STONE_SWORD, 1);
			item.addEnchantment(PotionedWeapons.SLOWNESS_ENCHANT, 1);
			ItemStack item2 = new ItemStack(Items.STONE_SWORD, 1);
			item2.addEnchantment(PotionedWeapons.SLOWNESS_ENCHANT, 2);
			ItemStack item3 = new ItemStack(Items.STONE_SWORD, 1);
			item3.addEnchantment(PotionedWeapons.SLOWNESS_ENCHANT, 3);
			ItemStack item4 = new ItemStack(Items.STONE_SWORD, 1);
			item4.addEnchantment(PotionedWeapons.SLOWNESS_ENCHANT, 4);
		      for(int i = 0; i < enchantments.size(); ++i) {
		          CompoundTag compoundTag = enchantments.getCompound(i);
		          if(compoundTag.equals(item.getEnchantments().getCompound(0))||compoundTag.equals(item2.getEnchantments().getCompound(0))||compoundTag.equals(item3.getEnchantments().getCompound(0))||compoundTag.equals(item4.getEnchantments().getCompound(0))) {
		        	  return 1.0F;
		          }
		       }
				return 0.0F;
		});
		FabricModelPredicateProviderRegistry.register(new Identifier(PotionedWeapons.MOD_ID, "weakness_enchanted"), (itemStack, clientWorld, livingEntity) -> {
			if(livingEntity == null) return 0.0F;
			ListTag enchantments = itemStack.getEnchantments();
			ItemStack item = new ItemStack(Items.STONE_SWORD, 1);
			item.addEnchantment(PotionedWeapons.WEAKNESS_ENCHANT, 1);
		      for(int i = 0; i < enchantments.size(); ++i) {
		          CompoundTag compoundTag = enchantments.getCompound(i);
		          if(compoundTag.equals(item.getEnchantments().getCompound(0))) {
		        	  return 1.0F;
		          }
		       }
				return 0.0F;
		});
	}

}
