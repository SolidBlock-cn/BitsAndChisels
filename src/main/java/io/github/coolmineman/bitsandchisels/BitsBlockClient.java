package io.github.coolmineman.bitsandchisels;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelProviderException;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;

public class BitsBlockClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new BitsModelProvider());
    }

    public static class BitsModelProvider implements ModelResourceProvider {
        public static final Identifier BITS_BLOCK_MODEL = new Identifier("bitsandchisels:block/bits_block_model");
        @Override
        public @Nullable UnbakedModel loadModelResource(Identifier resourceId, ModelProviderContext context) throws ModelProviderException {
            if(resourceId.equals(BITS_BLOCK_MODEL)) {
                return new BitsBlockModel();
            } else {
                return null;
            }
        }
    }

    
}
