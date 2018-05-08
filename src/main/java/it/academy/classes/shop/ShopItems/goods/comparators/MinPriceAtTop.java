package it.academy.classes.shop.ShopItems.goods.comparators;

import it.academy.classes.shop.ShopItems.goods.Good;

import java.util.Comparator;

public class MinPriceAtTop implements Comparator<Good> {
    @Override
    public int compare(Good o1, Good o2) {
        if (o1.getPrice() > o2.getPrice())
            return 1;
        else
            return -1;
    }
}
