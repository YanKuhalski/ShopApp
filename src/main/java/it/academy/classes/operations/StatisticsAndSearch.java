package it.academy.classes.operations;

import it.academy.classes.Menu;
import it.academy.classes.shop.ShopItems.shopWorkers.FounderOfTheSame;
import it.academy.classes.shop.ShopItems.shopWorkers.ManufacturersStatisticsCounter;
import it.academy.classes.shop.ShopItems.shopWorkers.Printer;
import it.academy.classes.shop.ShopItems.shopWorkers.TimeFilter;
import it.academy.exeptions.IllegalChoiceExeption;
import it.academy.exeptions.LackOfGoodsExeption;
import it.academy.interfaces.Operation;

import java.util.Scanner;

public class StatisticsAndSearch implements Operation {
    private Menu menu;

    public StatisticsAndSearch(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String name() {
        return "go to the statistics and search section";
    }

    @Override
    public void run() {
        System.out.println("Выберете необходимую операцию\n" +
                "1- Товары, поступившие в течение последней недели\n" +
                "2- Поиск похожих товаров\n" +
                "3- Вывод оценок производителей");
        try {
            executionOfTheSelectedOperation(new Scanner(System.in).nextInt());
        } catch (IllegalChoiceExeption | LackOfGoodsExeption exeption) {
            System.out.println(exeption.toString());
        }
        menu.choice();
    }

    private void executionOfTheSelectedOperation(int numberOfOperation) throws LackOfGoodsExeption, IllegalChoiceExeption {
        Printer printer = new Printer();
        switch (numberOfOperation) {
            case 1:
                printer.print(new TimeFilter().work());
                break;
            case 2:
                printer.print(new FounderOfTheSame().getSame());
                break;
            case 3:
                printer.print(new ManufacturersStatisticsCounter().getStatistics());
                break;
            default:
                throw new IllegalChoiceExeption("Неверный выбор");
        }
    }
}
