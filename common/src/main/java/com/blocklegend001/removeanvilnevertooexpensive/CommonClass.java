package com.blocklegend001.removeanvilnevertooexpensive;

import com.blocklegend001.removeanvilnevertooexpensive.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

public class CommonClass {
    public static void init() {
        if (Services.PLATFORM.isModLoaded("removeanvilnevertooexpensive")) {
            Constants.LOG.info("RemoveAnvilTooExpensive Loaded!");
        }
    }
}
