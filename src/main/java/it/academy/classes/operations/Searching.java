package it.academy.classes.operations;

import it.academy.classes.Menu;
import it.academy.classes.shop.ShopItems.shopWorkers.PriceFilter;
import it.academy.classes.shop.ShopItems.shopWorkers.Printer;
import it.academy.classes.shop.ShopItems.shopWorkers.SearchEngine;
import it.academy.exeptions.IllegalChoiceExeption;
import it.academy.exeptions.LackOfGoodsExeption;
import it.academy.interfaces.Operation;

import java.util.Scanner;

public class Searching implements Operation {
    private Menu menu;

    public Searching(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String name() {
        return "go to the searc section";
    }

    @Override
    public void run() {
        System.out.println("Выберите вариант поиска\n1-По имени \n2-По диапазону цен");
        try {
            searching(new Scanner(System.in).nextInt());
        } catch (IllegalChoiceExeption | LackOfGoodsExeption exeption) {
            System.out.println(exeption.toString());
        }
        menu.choice();
    }

    private void searching(int methodNumber) throws IllegalChoiceExeption, LackOfGoodsExeption {
        Printer printer = new Printer();
        switch (methodNumber) {
            case 1:
                printer.print(new SearchEngine().work());
                break;
            case 2:
                printer.print(new PriceFilter().work());
                break;
            default:
                throw new IllegalChoiceExeption("Неверный выбор");
        }
    }
}
