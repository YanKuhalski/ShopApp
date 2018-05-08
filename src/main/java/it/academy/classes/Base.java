package it.academy.classes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import it.academy.classes.shop.ShopDeserializer;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.classes.shop.ShopItems.goods.GoodDeserializer;
import it.academy.classes.shop.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Base {
    private String baseName;
    private Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(Shop.class, new ShopDeserializer())
            .registerTypeAdapter(Good.class, new GoodDeserializer())
            .create();

    public Base(String baseName) {
        this.baseName = baseName;
    }

    public Shop getShop() {
        Shop shop = null;
        BufferedReader reader = null;
        try {
            URL url = new URL(baseName);
            URLConnection urlConnection = (URLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            shop = gson.fromJson(buffer.toString(), Shop.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return shop;
    }

}
