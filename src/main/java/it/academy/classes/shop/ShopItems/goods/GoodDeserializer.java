package it.academy.classes.shop.ShopItems.goods;

import com.google.gson.*;
import it.academy.classes.shop.ShopItems.goods.Info.FullGoodInfo;

import java.lang.reflect.Type;

public class GoodDeserializer implements JsonDeserializer<Good> {
    @Override
    public Good deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Good good = new Good(jsonObject.get("id").getAsInt(),
                new FullGoodInfo(jsonObject.get("name").getAsString(),
                        jsonObject.get("description").getAsString(),
                        jsonObject.get("year").getAsString(),
                        jsonObject.get("price").getAsInt()),
                jsonObject.get("grade").getAsInt(),
                jsonObject.get("produser").getAsString());
        JsonArray same = jsonObject.getAsJsonArray("same");
        for (JsonElement sameGood : same) {
            good.addSame(sameGood.getAsInt());
        }
        return good;
    }
}
