package us.timinc.mc.cobblemon.shinyesques.config

import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import us.timinc.mc.cobblemon.shinyesques.Shinyesques

@Config(name = Shinyesques.MOD_ID)
class ShinyesquesConfig : ConfigData {
    val spawnAspects = mutableMapOf(
        "is_antique" to 1.0
    )
}