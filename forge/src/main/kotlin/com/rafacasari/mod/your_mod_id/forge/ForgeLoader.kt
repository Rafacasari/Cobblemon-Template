package com.your_name.mod.your_mod_id.forge

import com.your_name.mod.your_mod_id.YourMod
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext

@Mod(YourMod.MOD_ID)
class ForgeLoader {

    private val modBus: IEventBus = FMLJavaModLoadingContext.get().modEventBus

    init {
        YourMod.initialize()
        MinecraftForge.EVENT_BUS.register(this)
    }

}