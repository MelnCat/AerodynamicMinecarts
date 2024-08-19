package dev.melncat.aerodynamicminecarts.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.level.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.points.BeforeFieldAccess;
@Mixin(GameRules.class)
abstract class GameRulesMixin {
	@ModifyExpressionValue(method = "<clinit>", at = @At(value = "CONSTANT", args = "intValue=1000"))
	private static int minecartLimit(int value) {
		return Integer.MAX_VALUE;
	}
}
