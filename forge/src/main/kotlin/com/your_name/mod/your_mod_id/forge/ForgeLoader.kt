package com.your_name.mod.your_mod_id.forge

import com.your_name.mod.your_mod_id.YourMod
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod

@Mod(YourMod.MOD_ID)
class ForgeLoader {

    init {
        YourMod.initialize()
        MinecraftForge.EVENT_BUS.register(this)
    }

}