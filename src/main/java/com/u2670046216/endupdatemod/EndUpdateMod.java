package com.u2670046216.endupdatemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndUpdateMod implements ModInitializer {
    public static final String MOD_ID = "endupdatemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing EndUpdateMod");
    }

    public void onStop() {
        LOGGER.info("Stopping EndUpdateMod");
    }
}