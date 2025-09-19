# CustomTrees 2.0.0 Upgrade Guide

## 🚀 From 1.x to 2.0.0

### System Requirements
- **Java 17+** (was Java 8)
- **Minecraft 1.21.3** (was 1.16.2)
- **WorldEdit 7.3.6+** (modern version required)

### Breaking Changes

#### 1. Material Names
Some material names have changed in modern Minecraft:
- `Material.GRASS` → `Material.SHORT_GRASS`
- New materials added: `CHERRY_SAPLING`, `MANGROVE_PROPAGULE`, `CHERRY_LEAVES`, `MANGROVE_LEAVES`

#### 2. WorldEdit API Changes
- The plugin now uses the modern WorldEdit API
- Improved clipboard loading with proper resource management
- Better error handling and logging

#### 3. Dependency Management
- **Old**: Used system dependency for FastAsyncWorldEdit JAR
- **New**: Uses proper Maven dependencies from official repositories

### Configuration Compatibility
✅ **Your existing biome configurations should work without changes!**

The configuration format remains the same:
- `/biomes/*.yml` files use the same format
- `/schematics/` folder structure unchanged
- Weight and offset systems unchanged

### New Features

#### 1. Modern Wood Support
You can now create configurations for:
```yaml
CHERRY_SAPLING:
  cherry_tree:
    weight: 100
    x-offset: 0
    y-offset: 0
    z-offset: 0

MANGROVE_PROPAGULE:
  mangrove_tree:
    weight: 100
    x-offset: 0
    y-offset: -1  # Often planted lower
    z-offset: 0
```

#### 2. Better Collision Detection
Enhanced material checking now includes all modern blocks.

#### 3. Improved Performance
- Faster schematic loading
- Better memory management
- Modern build optimizations

### Migration Steps

1. **Backup your current setup**
   ```
   /plugins/CustomTrees/
   ├── biomes/     ← Backup this
   └── schematics/ ← Backup this
   ```

2. **Install Requirements**
   - Upgrade to Java 17+ on your server
   - Update to Minecraft 1.21.3 server (Spigot/Paper)
   - Install modern WorldEdit version

3. **Install CustomTrees 2.0.0**
   - Remove old `customtrees-1.x.jar`
   - Install `customtrees-2.0.0.jar`

4. **Restore Configuration**
   - Copy back your biome configurations
   - Copy back your schematic files
   - Test that everything works

5. **Optional: Add Modern Wood Types**
   - Create new biome configs for Cherry Groves, Mangrove Swamps
   - Add schematics for new wood types

### Testing Checklist

After upgrading, test these features:
- [ ] Existing trees still spawn correctly
- [ ] Biome-specific spawning works
- [ ] Weight-based selection functions
- [ ] Rotation system works
- [ ] Collision detection prevents griefing
- [ ] No console errors during startup
- [ ] Schematics load without errors

### Troubleshooting

#### "Cannot find symbol" errors during compilation
- Ensure you're using Java 17+
- Update WorldEdit to latest version

#### "Material not found" errors
- Check if you're using old material names
- See material mapping above

#### Plugin won't load
- Verify WorldEdit is installed and loaded first
- Check server console for detailed error messages
- Ensure all dependencies are present

#### Trees not spawning
- Check biome configuration files
- Verify schematic files exist in `/schematics/` folder
- Enable debug logging to see selection process

### Support

For issues during upgrade:
1. Check the console logs for detailed error messages
2. Verify all requirements are met
3. Test with minimal configuration first
4. Report issues with full error logs and configuration details

### Performance Notes

CustomTrees 2.0.0 should perform better than 1.x due to:
- Modern Java runtime optimizations
- Improved WorldEdit API usage
- Better resource management
- Optimized dependency loading

You may notice faster server startup and reduced memory usage.