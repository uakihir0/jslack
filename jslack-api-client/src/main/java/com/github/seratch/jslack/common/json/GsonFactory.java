package com.github.seratch.jslack.common.json;

import com.github.seratch.jslack.SlackConfig;
import com.github.seratch.jslack.api.model.Latest;
import com.github.seratch.jslack.api.model.block.ContextBlockElement;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import com.github.seratch.jslack.api.model.block.composition.TextObject;
import com.github.seratch.jslack.api.model.block.element.BlockElement;
import com.google.gson.*;

import java.lang.reflect.Type;

public class GsonFactory {
    private GsonFactory() {
    }

    public static Gson createSnakeCase() {
        return new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .registerTypeAdapter(LayoutBlock.class, new GsonLayoutBlockFactory())
                .registerTypeAdapter(TextObject.class, new GsonTextObjectFactory())
                .registerTypeAdapter(ContextBlockElement.class, new GsonContextBlockElementFactory())
                .registerTypeAdapter(BlockElement.class, new GsonBlockElementFactory())
                .registerTypeAdapter(Latest.class, new LatestDeserializer())
                .create();
    }

    public static Gson createSnakeCase(SlackConfig config) {
        GsonBuilder gsonBuilder = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .registerTypeAdapter(LayoutBlock.class, new GsonLayoutBlockFactory())
                .registerTypeAdapter(TextObject.class, new GsonTextObjectFactory())
                .registerTypeAdapter(ContextBlockElement.class, new GsonContextBlockElementFactory())
                .registerTypeAdapter(BlockElement.class, new GsonBlockElementFactory())
                .registerTypeAdapter(Latest.class, new LatestDeserializer());

        if (config.isLibraryMaintainerMode()) {
            gsonBuilder = gsonBuilder.registerTypeAdapterFactory(new UnknownPropertyDetectionAdapterFactory());
        }
        if (config.isPrettyResponseLoggingEnabled()) {
            gsonBuilder = gsonBuilder.setPrettyPrinting();
        }
        return gsonBuilder.create();
    }

    public static class LatestDeserializer implements JsonDeserializer<Latest> {

        @Override
        public Latest deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) {
            if (je.isJsonObject()) {
                return jdc.deserialize(je, Latest.class);
            }

            Latest latest = new Latest();
            latest.setTs(je.getAsString());
            return latest;
        }
    }
}
