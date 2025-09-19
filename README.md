# CustomTrees 2.0.0

A modernized Minecraft plugin that replaces vanilla tree growth with custom WorldEdit schematic trees.

## 🚀 What's New in 2.0.0

- **Updated to Minecraft 1.21.3**: Full compatibility with the latest Minecraft version
- **Java 17+**: Modern Java runtime support 
- **FastAsyncWorldEdit 2.11.2**: Latest WorldEdit API integration
- **New Wood Types**: Support for Cherry, Mangrove, and Bamboo trees
- **Improved Performance**: Modern build system and optimized dependencies
- **Better Material Handling**: Updated material checks for all modern block types

## 🛠️ Requirements

- **Minecraft Server**: 1.21.x (Spigot/Paper)
- **Java**: Version 17 or higher
- **Dependencies**: WorldEdit (required), FastAsyncWorldEdit (recommended)

## 📦 Installation

1. Download the latest `customtrees-2.0.0.jar` from releases
2. Install WorldEdit plugin on your server
3. Place the jar file in your server's `plugins` folder
4. Start/restart your server
5. Configure biome files and add schematic files

## 🌳 Features

- Replace any sapling growth with custom schematics
- Biome-specific tree configurations
- Weight-based random tree selection
- Support for both `.schematic` and `.schem` formats
- Rotation support for natural variety
- Collision detection to prevent griefing

## 📁 Configuration

The plugin creates these folders in `plugins/CustomTrees/`:
- `/schematics/` - Place your `.schem` or `.schematic` files here
- `/biomes/` - Configure which trees spawn in which biomes

### Example biome configuration (`biomes/forest.yml`):
```yaml
biomes:
  - FOREST
  - BIRCH_FOREST
materials:
  OAK_SAPLING:
    oak1:
      weight: 50
      x-offset: 0
      y-offset: 0
      z-offset: 0
    oak2:
      weight: 30
      x-offset: 0
      y-offset: 0
      z-offset: 0
  BIRCH_SAPLING:
    birch1:
      weight: 100
```

### Supported Materials

**Saplings:**
- `OAK_SAPLING`, `BIRCH_SAPLING`, `SPRUCE_SAPLING`
- `JUNGLE_SAPLING`, `ACACIA_SAPLING`, `DARK_OAK_SAPLING`
- `CHERRY_SAPLING`, `MANGROVE_PROPAGULE`

**Fungi:**
- `WARPED_FUNGUS`, `CRIMSON_FUNGUS`
- `BROWN_MUSHROOM`, `RED_MUSHROOM`

## 🔧 Development

Built with:
- Java 17
- Maven 3.x
- Spigot API 1.21.3
- WorldEdit 7.3.6
- FastAsyncWorldEdit 2.11.2

## 📜 License

This project maintains compatibility with the original CustomTrees plugin while providing modern Minecraft support.

## 🐛 Support

- Report issues on GitHub
- Ensure you're using Java 17+ and Minecraft 1.21.x
- Check that WorldEdit is properly installed and loaded