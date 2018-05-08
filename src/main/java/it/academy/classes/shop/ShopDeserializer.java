package it.academy.classes.shop;

import com.google.gson.*;
import it.academy.classes.shop.ShopItems.goods.Good;

import java.lang.reflect.Type;

public class ShopDeserializer implements JsonDeserializer<Shop> {
    @Override
    public Shop deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Shop shop = Shop.getInstance();
        shop.setName(jsonObject.get("name").getAsString());
        shop.setLocation(jsonObject.get("location").getAsString());
        JsonArray emails = jsonObject.getAsJsonArray("emails");
        for (JsonElement email : emails) {
            shop.addEmail(email.getAsString());
        }
        JsonArray goods = jsonObject.getAsJsonArray("goods");
        for (JsonElement good : goods) {
            shop.addGood(context.deserialize(good, Good.class));
        }
        return shop;
    }
}
