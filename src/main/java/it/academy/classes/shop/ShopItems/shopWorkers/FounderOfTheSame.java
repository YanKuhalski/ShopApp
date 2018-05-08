package it.academy.classes.shop.ShopItems.shopWorkers;

import it.academy.classes.shop.Shop;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.exeptions.LackOfGoodsExeption;

import java.util.ArrayList;
import java.util.List;

public class FounderOfTheSame {
    public List<Good> getSame() throws LackOfGoodsExeption {
        List<Good> same = new ArrayList<>();
        List<Integer> idOfSame = new SearchEngine().work().getSame();
        for (Good good : Shop.getInstance().getGoods()) {
            for (Integer id : idOfSame) {
                if (id == good.getId()) {
                    same.add(good);
                }
            }
        }
        if (same.isEmpty())
            throw new LackOfGoodsExeption("Похожих товаров нет");
        return same;
    }
}
