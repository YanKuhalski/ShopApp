package it.academy.interfaces;

import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.classes.shop.ShopItems.goods.comparators.GoodSimpleComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface Filter {
    Set<Good> list = new TreeSet<>(new GoodSimpleComparator());

    Set<Good> work();
}
