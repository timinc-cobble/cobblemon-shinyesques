# cobblemon-shinyesques
A utility mod for Cobblemon that adds a chance to add aspects to a Pokémon on spawn

**Status**: *minimod*

Adds a config that you can add entries to. By adding entries you're assigning a flat percentage chance for a particular aspect to be added to a spawning Pokémon.

The default config works off of the [LostMons Addon](https://modrinth.com/datapack/lostmons-cobblemon)

```JSON
{
  "spawnAspects": {
    "is_antique": 0.5
  }
}
```

I removed LostMons' spawning chances for an antique Sinistea and substituted in my own logic. With the above config, there is now a 50% chance when a Sinstea is spawning that it will have the `is_antique` aspect. This is in addition to the existing chance to be shiny. If a species has multiple applicable aspects, you could also add them to the list and possibly have multiple show up at the same time.

For example, let's say our Sinistea could have both `is_antique` and a `red` aspect. The following config would give a 50% chance for `is_antique` *and* a 25% chance for `red`:

```JSON
{
  "spawnAspects": {
    "is_antique": 0.5,
    "red": 0.25
  }
}
```
