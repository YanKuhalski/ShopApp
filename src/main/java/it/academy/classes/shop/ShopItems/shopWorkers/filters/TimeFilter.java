package it.academy.classes.shop.ShopItems.shopWorkers.filters;

import it.academy.classes.shop.Shop;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.interfaces.Filtrator;

import java.util.Set;

public class TimeFilter extends Filter implements Filtrator {
    public Set<Good> work() {
        list.clear();
        filterOut();
        return list;
    }

    public void filterOut() {
        long week = 7 * 24 * 60 * 60 * 1000;
        for (Good good : Shop.getInstance().getGoods()) {
            if (good.getDate().getTime() > System.currentTimeMillis() - week) {
                list.add(good);
            }
        }
    }
}
