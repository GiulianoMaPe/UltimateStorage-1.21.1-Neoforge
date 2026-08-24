package net.msg.ultimate_storage.common.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> COMMON_CHESTS = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chests"));
        public static final TagKey<Item> COMMON_BARRELS = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "barrels"));
    }


}

