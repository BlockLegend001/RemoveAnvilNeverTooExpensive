package com.blocklegend001.removeanvilnevertooexpensive;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class RemoveAnvilNeverTooExpensive {

    public RemoveAnvilNeverTooExpensive(IEventBus eventBus) {
        CommonClass.init();
    }
}
