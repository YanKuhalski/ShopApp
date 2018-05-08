package it.academy.classes.shop.ShopItems.shopWorkers;

import it.academy.classes.shop.Shop;
import it.academy.classes.shop.ShopItems.goods.Good;
import it.academy.interfaces.Filter;

import java.util.Scanner;
import java.util.Set;

public class PriceFilter implements Filter {

    public Set<Good> work() {
        list.clear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n~~Выбор по диапазону цен~~~\nВведите минимальную и максимальную цену");
        filterOut(scanner.nextInt(), scanner.nextInt());
        if (list.isEmpty()) {
            System.out.println("Товары в этом диапазоне цен отсутствуют");
        }
        return list;
    }

    private void filterOut(int minPrice, int maxPrice) {
        for (Good good : Shop.getInstance().getGoods()) {
            if (good.getPrice() < maxPrice && good.getPrice() > minPrice) {
                list.add(good);
            }
        }
    }

}
