package it.academy.classes.shop.ShopItems.shopWorkers;

import it.academy.classes.shop.Shop;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.classes.shop.ShopItems.goods.comparators.MaxPriceAtTop;
import it.academy.classes.shop.ShopItems.goods.comparators.MinPriceAtTop;
import it.academy.exeptions.IllegalChoiceExeption;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sorter {

    private Set<Good> sort(Collection<Good> collection) throws IllegalChoiceExeption {
        Set<Good> goods = null;
        System.out.println("Выберите вариант сортироваки по цене\n1-Сначала дорогие\n2-сначала дешевые");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                goods = new TreeSet<Good>(new MaxPriceAtTop());
                break;
            case 2:
                goods = new TreeSet<Good>(new MinPriceAtTop());
                break;
            default:
                throw new IllegalChoiceExeption("Неверные выбор");
        }
        goods.addAll(collection);
        return goods;
    }

    public Set<Good> work() throws IllegalChoiceExeption {
        return sort(Shop.getInstance().getGoods());
    }
}
