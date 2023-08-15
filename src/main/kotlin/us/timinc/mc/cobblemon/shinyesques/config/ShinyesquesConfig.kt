package us.timinc.mc.cobblemon.shinyesques.config

import draylar.omegaconfig.api.Config
import us.timinc.mc.cobblemon.shinyesques.Shinyesques

class ShinyesquesConfig : Config {
    val spawnAspects = mutableMapOf(
        "is_antique" to 1.0
    )

    override fun getName(): String {
        return Shinyesques.MOD_ID
    }
}