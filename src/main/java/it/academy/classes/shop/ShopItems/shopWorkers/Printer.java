package it.academy.classes.shop.ShopItems.shopWorkers;

import it.academy.classes.shop.Shop;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.classes.shop.ShopItems.goods.Info.GoodProduser;

import java.util.Collection;
import java.util.Set;

public class Printer {
    public void print() {
        System.out.println(Shop.getInstance().toString());
    }

    public void print(Good good) {
        if (good != null)
            System.out.println(good.toString());
    }

    public void print(Set<GoodProduser> produsers) {
        if (produsers != null)
            for (GoodProduser produser : produsers) {
                System.out.println(produser.getName() + " " + produser.getMediumGrade());
            }
    }

    public void print(Collection<Good> goods) {
        if (goods != null)
            for (Good good : goods) {
                System.out.println(good.toString());
            }
    }
}
