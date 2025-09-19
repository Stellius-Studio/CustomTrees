package org.redcastlemedia.bukkit.customtrees;

import org.bukkit.Material;

public final class Util {
    private Util() {

    }

    public static boolean isNaturalMaterial(Material material) {
        if (material.isSolid() &&
        // Leaves
                material != Material.OAK_LEAVES &&
                material != Material.BIRCH_LEAVES &&
                material != Material.SPRUCE_LEAVES &&
                material != Material.JUNGLE_LEAVES &&
                material != Material.DARK_OAK_LEAVES &&
                material != Material.ACACIA_LEAVES &&
                material != Material.CHERRY_LEAVES &&
                material != Material.MANGROVE_LEAVES &&
                material != Material.AZALEA_LEAVES &&
                material != Material.FLOWERING_AZALEA_LEAVES &&
                // Grass and ground materials
                material != Material.SHORT_GRASS &&
                material != Material.GRASS_BLOCK &&
                material != Material.TALL_GRASS &&
                material != Material.DIRT &&
                material != Material.COARSE_DIRT &&
                material != Material.ROOTED_DIRT &&
                material != Material.MUD &&
                material != Material.MUDDY_MANGROVE_ROOTS &&
                material != Material.MYCELIUM &&
                material != Material.PODZOL &&
                // Nether materials
                material != Material.WARPED_HYPHAE &&
                material != Material.WARPED_NYLIUM &&
                material != Material.CRIMSON_HYPHAE &&
                material != Material.CRIMSON_NYLIUM &&
                material != Material.CRIMSON_FUNGUS &&
                material != Material.WARPED_FUNGUS &&
                material != Material.WARPED_WART_BLOCK &&
                material != Material.NETHER_WART_BLOCK &&
                material != Material.SHROOMLIGHT &&
                material != Material.TWISTING_VINES &&
                material != Material.WEEPING_VINES &&
                material != Material.CRIMSON_ROOTS &&
                material != Material.WARPED_ROOTS &&
                // Other natural blocks
                material != Material.CAMPFIRE &&
                material != Material.SOUL_CAMPFIRE &&
                material != Material.STONE &&
                // Logs
                material != Material.OAK_LOG &&
                material != Material.BIRCH_LOG &&
                material != Material.SPRUCE_LOG &&
                material != Material.JUNGLE_LOG &&
                material != Material.DARK_OAK_LOG &&
                material != Material.ACACIA_LOG &&
                material != Material.CHERRY_LOG &&
                material != Material.MANGROVE_LOG &&
                material != Material.BAMBOO_BLOCK &&
                // Saplings
                material != Material.OAK_SAPLING &&
                material != Material.BIRCH_SAPLING &&
                material != Material.JUNGLE_SAPLING &&
                material != Material.ACACIA_SAPLING &&
                material != Material.DARK_OAK_SAPLING &&
                material != Material.SPRUCE_SAPLING &&
                material != Material.CHERRY_SAPLING &&
                material != Material.MANGROVE_PROPAGULE) {
            return false;
        }
        return true;
    }

    public static boolean isGrowableMaterial(Material material) {
        if (material != Material.OAK_SAPLING &&
                material != Material.BIRCH_SAPLING &&
                material != Material.SPRUCE_SAPLING &&
                material != Material.JUNGLE_SAPLING &&
                material != Material.DARK_OAK_SAPLING &&
                material != Material.ACACIA_SAPLING &&
                material != Material.CHERRY_SAPLING &&
                material != Material.MANGROVE_PROPAGULE &&
                material != Material.WARPED_FUNGUS &&
                material != Material.CRIMSON_FUNGUS &&
                material != Material.BROWN_MUSHROOM &&
                material != Material.RED_MUSHROOM) {
            return false;
        }
        return true;
    }
}
