package it.academy.classes.shop.ShopItems.shopWorkers.filters;

import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.classes.shop.ShopItems.goods.comparators.GoodSimpleComparator;

import java.util.Set;
import java.util.TreeSet;

public abstract class Filter {
    Set<Good> list = new TreeSet<>(new GoodSimpleComparator());

    public abstract Set<Good> work();
}
