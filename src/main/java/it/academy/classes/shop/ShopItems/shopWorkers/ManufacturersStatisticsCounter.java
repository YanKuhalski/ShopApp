package it.academy.classes.shop.ShopItems.shopWorkers;

import it.academy.classes.shop.Shop;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.classes.shop.ShopItems.goods.Info.GoodProduser;
import it.academy.classes.shop.ShopItems.ProduserList;

import java.util.Set;

public class ManufacturersStatisticsCounter {
    public Set<GoodProduser> getStatistics() {
        ProduserList produserList = new ProduserList();
        for (Good good : Shop.getInstance().getGoods()) {
            produserList.get(good);
        }
        return produserList.getStatistics();
    }
}
