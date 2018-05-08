package it.academy.classes.shop.ShopItems;

import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.classes.shop.ShopItems.goods.Info.GoodProduser;
import it.academy.classes.shop.ShopItems.goods.Info.ProduserComparator;

import java.util.Set;
import java.util.TreeSet;

public class ProduserList {
    private Set<GoodProduser> produsers = new TreeSet<>(new ProduserComparator());

    public void get(Good good) {
        boolean wasAdded = false;
        for (GoodProduser produser : produsers) {
            if (produser.getName().equals(good.getProducer())) {
                wasAdded = true;
                produser.upDateStatistic(good.getGrade());
            }
        }
        if (!wasAdded) {
            produsers.add(new GoodProduser(good.getProducer(), good.getGrade()));
        }
    }

    public Set<GoodProduser> getStatistics() {
        return produsers;
    }
}
