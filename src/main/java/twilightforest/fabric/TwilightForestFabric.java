package twilightforest.fabric;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwilightForestFabric implements ModInitializer {
    public static final String MOD_ID = "twilightforest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Twilight Forest (Fabric 26.3 port) initializing");
        // Batch 2: registries (blocks), Batch 3: items, ...
    }
}
