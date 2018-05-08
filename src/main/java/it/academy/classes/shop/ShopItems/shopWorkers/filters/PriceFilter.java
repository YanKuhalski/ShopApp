package it.academy.classes.shop.ShopItems.shopWorkers.filters;

import it.academy.classes.shop.Shop;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.interfaces.Filtrator;

import java.util.Scanner;
import java.util.Set;

public class PriceFilter extends Filter implements Filtrator {

    public Set<Good> work() {
        list.clear();
        System.out.println("\n\n~~Выбор по диапазону цен~~~\nВведите минимальную и максимальную цену");
        filterOut();
        if (list.isEmpty()) {
            System.out.println("Товары в этом диапазоне цен отсутствуют");
        }
        return list;
    }

    public void filterOut() {
        Scanner scanner = new Scanner(System.in);
        int minPrice=scanner.nextInt(); int maxPrice=scanner.nextInt();
        for (Good good : Shop.getInstance().getGoods()) {
            if (good.getPrice() < maxPrice && good.getPrice() > minPrice) {
                list.add(good);
            }
        }
    }

}
