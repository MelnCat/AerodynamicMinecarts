package dev.melncat.aerodynamicminecarts;

import net.fabricmc.api.ModInitializer;
import net.minecraft.server.commands.GameRuleCommand;

public class AerodynamicMinecarts implements ModInitializer {

	@Override
	public void onInitialize() {
		new GameRuleCommand();
	}
}
