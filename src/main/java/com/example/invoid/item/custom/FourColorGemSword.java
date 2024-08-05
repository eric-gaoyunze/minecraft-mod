package com.example.invoid.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class FourColorGemSword extends SwordItem {
    public FourColorGemSword(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity p_43279_, LivingEntity p_43280_) {
        p_43279_.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,300),p_43280_);
        p_43279_.addEffect(new MobEffectInstance(MobEffects.HARM,300),p_43280_);
        p_43279_.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,300),p_43280_);
        p_43279_.addEffect(new MobEffectInstance(MobEffects.CONFUSION,300),p_43280_);
        p_43279_.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN,300),p_43280_);
        p_43279_.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY,300),p_43280_);
        p_43279_.addEffect(new MobEffectInstance(MobEffects.POISON,300),p_43280_);
        p_43279_.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING,300),p_43280_);
        p_43279_.addEffect(new MobEffectInstance(MobEffects.WITHER,300),p_43280_);
        p_43279_.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,300),p_43280_);
        return super.hurtEnemy(p_43278_, p_43279_, p_43280_);
    }
}
