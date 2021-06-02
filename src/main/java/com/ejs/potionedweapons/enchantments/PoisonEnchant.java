package com.ejs.potionedweapons.enchantments;

import com.ejs.potionedweapons.PotionedWeapons;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class PoisonEnchant extends Enchantment {

	public PoisonEnchant() {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
	}

	@Override
	public int getMinPower(int level) {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}
	
	@Override
	public void onTargetDamaged(LivingEntity user, Entity target, int level) {
		if(target instanceof LivingEntity) {
			((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200*level, level-1));
		}
		super.onTargetDamaged(user, target, level);
	}
	
	public boolean canAccept(Enchantment other) {
		return super.canAccept(other)  && other != PotionedWeapons.HEALING_ENCHANT
				&& other != PotionedWeapons.HARMING_ENCHANT && other != PotionedWeapons.SLOWNESS_ENCHANT
				&& other != PotionedWeapons.WEAKNESS_ENCHANT;
	}
}
