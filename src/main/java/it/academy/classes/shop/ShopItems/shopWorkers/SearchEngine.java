package it.academy.classes.shop.ShopItems.shopWorkers;

import it.academy.classes.shop.Shop;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.exeptions.LackOfGoodsExeption;

import java.util.Scanner;

public class SearchEngine {

    public Good work() throws LackOfGoodsExeption {
        System.out.println("Введите название товара");
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        sb.append(scanner.next());
        sb.append(scanner.nextLine());
        return search(sb.toString());
    }

    private Good search(String name) throws LackOfGoodsExeption {
        Good weNeed = null;
        for (Good good : Shop.getInstance().getGoods()) {
            if (good.getName().equals(name)) {
                weNeed = good;
            }
        }
        if (weNeed == null) {
            throw new LackOfGoodsExeption("Товар с таким названием отсутствует");
        }
        return weNeed;
    }
}
