package it.academy.classes.shop.ShopItems.goods.Info;

import java.util.Comparator;

public class ProduserComparator implements Comparator<GoodProduser> {
    @Override
    public int compare(GoodProduser o1, GoodProduser o2) {
        if (o1.getName().equals(o2.getName()))
            return 0;
        else
            return 1;
    }
}
