package us.timinc.mc.cobblemon.shinyesques

import com.cobblemon.mod.common.api.pokemon.PokemonProperties
import com.cobblemon.mod.common.api.properties.CustomPokemonProperty
import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer
import net.fabricmc.api.ModInitializer
import us.timinc.mc.cobblemon.shinyesques.config.ShinyesquesConfig
import kotlin.random.Random

object Shinyesques : ModInitializer {
    const val MOD_ID = "shinyesques"
    private lateinit var shinyesquesConfig: ShinyesquesConfig

    override fun onInitialize() {
        AutoConfig.register(ShinyesquesConfig::class.java) { definition, configClass ->
            JanksonConfigSerializer(definition, configClass)
        }
        shinyesquesConfig = AutoConfig.getConfigHolder(ShinyesquesConfig::class.java).config
    }

    fun applySpawnAspects(props: PokemonProperties) {
        for (property in CustomPokemonProperty.properties) {
            property.keys.find { shinyesquesConfig.spawnAspects.containsKey(it) }?.let { key ->
                    if (Random.Default.nextDouble() < shinyesquesConfig.spawnAspects[key]!!) {
                        property.fromString("true")?.let { props.customProperties.add(it) }
                    }
                }
        }
    }
}