package dev.tehc.libreg

import dev.tehc.libreg.example.ExampleMod
import dev.tehc.libreg.util.debug
import dev.tehc.libreg.util.info
import net.fabricmc.loader.api.FabricLoader

@Suppress("unused")
object Mod {
	internal const val id = "libreg"
	
	private fun main() {
		info("$id started!")
		
		if (FabricLoader.getInstance().isDevelopmentEnvironment) {
			debug("Initializing tests...")
			ExampleMod.main()
		}
	}
}
