package dev.melncat.aerodynamicminecarts.mixin;

import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.entity.vehicle.NewMinecartBehavior;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NewMinecartBehavior.class)
abstract class NewMinecartBehaviorMixin {
	@Inject(method = "getSlowdownFactor", at = @At("HEAD"), cancellable = true)
	private void getSlowdownFactor(CallbackInfoReturnable<Double> cir) {
		cir.setReturnValue(0.999d);
	}
}
