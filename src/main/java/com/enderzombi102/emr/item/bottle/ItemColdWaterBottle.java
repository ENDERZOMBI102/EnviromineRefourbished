package com.enderzombi102.emr.item.bottle;

import com.enderzombi102.emr.Content;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemColdWaterBottle extends ItemSaltWaterBottle {

	public ItemColdWaterBottle() {
		this.hydrationLevel = 21.4F;
	}

	@Override
	protected void additionalEffect(ItemStack stack, World world, LivingEntity user) {
		Content.PLAYER_DATA_TRACKER.get(user).bodyTemp -= 6F;
	}
}
