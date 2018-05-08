package it.academy.classes.operations;

import it.academy.classes.Menu;
import it.academy.classes.shop.ShopItems.shopWorkers.Printer;
import it.academy.classes.shop.ShopItems.shopWorkers.Sorter;
import it.academy.exeptions.IllegalChoiceExeption;
import it.academy.interfaces.Operation;

import java.util.Scanner;

public class Printing implements Operation {
    private Menu menu;

    public Printing(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String name() {
        return "go to the section of output of information about all products";
    }

    @Override
    public void run() {
        System.out.println("Вберете показатель по которому должны быть отсортированы товары\n1-По имени \n2-По цене");
        try {
            printing(new Scanner(System.in).nextInt());
        } catch (IllegalChoiceExeption illegalChoiceExeption) {
            System.out.println(illegalChoiceExeption.toString());
        }
        menu.choice();
    }

    public void printing(int printingMethodNumber) throws IllegalChoiceExeption {
        Printer printer = new Printer();
        switch (printingMethodNumber) {
            case 1:
                printer.print();
                break;
            case 2:
                printer.print(new Sorter().work());
                break;
            default:
                throw new IllegalChoiceExeption("Нет такого варианта сортировки");
        }
    }
}
