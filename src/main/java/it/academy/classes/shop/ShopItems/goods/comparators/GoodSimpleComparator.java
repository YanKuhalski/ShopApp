package it.academy.classes.shop.ShopItems.goods.comparators;

import it.academy.classes.shop.ShopItems.goods.Good;

import java.util.Comparator;

public class GoodSimpleComparator implements Comparator<Good> {
    public int compare(Good o1, Good o2) {
        if (o1.getId() != o2.getId())
            return o1.getName().compareTo(o2.getName());
        else return 0;
    }
}
