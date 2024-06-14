package com.your_name.mod.your_mod_id.fabric

import com.your_name.mod.your_mod_id.YourMod
import net.fabricmc.api.ModInitializer

class FabricCommon : ModInitializer {
    override fun onInitialize() {
        YourMod.initialize()
    }
}