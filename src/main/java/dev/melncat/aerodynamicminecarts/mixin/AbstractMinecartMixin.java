package dev.melncat.aerodynamicminecarts.mixin;

import net.minecraft.world.entity.vehicle.AbstractMinecart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(AbstractMinecart.class)
abstract class AbstractMinecartMixin {
	@ModifyArg(method = "comeOffTrack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/phys/Vec3;scale(D)Lnet/minecraft/world/phys/Vec3;"))
	private double scaleModifier(double d) {
		if (d == 0.95d) return 1d;
		return d;
	}
}
