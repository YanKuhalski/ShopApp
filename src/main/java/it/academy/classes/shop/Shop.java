package it.academy.classes.shop;

import it.academy.classes.Base;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.classes.shop.ShopItems.goods.comparators.GoodSimpleComparator;

import java.util.Set;
import java.util.TreeSet;

public class Shop {
    private static Shop instance;
    private String name;
    private String location;
    private Set<String> emails = new TreeSet<String>();
    private Set<Good> goods = new TreeSet<Good>(new GoodSimpleComparator());
    private static Base base = new Base("https://raw.githubusercontent.com/YanKuhalski/Different/master/Base.json");

    private Shop() {
    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
            getFromOnlianeBase();
        }
        return instance;
    }

    private static void getFromOnlianeBase() {
        base.getShop();
    }

    public Set<Good> getGoods() {
        return goods;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Магазин " + name
                + "\nАдрес :" + location
                + "\nКонтакты :\n" + emails.toString());
        for (Good good : goods)
            string.append("\n" + good.toString());
        return string.toString();
    }

    public Shop addEmail(String email) {
        emails.add(email);
        return this;
    }

    public Shop addGood(Good good) {
        goods.add(good);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
