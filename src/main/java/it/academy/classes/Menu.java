package it.academy.classes;

import it.academy.classes.operations.*;
import it.academy.interfaces.Operation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private Map<Integer, Operation> operations = new HashMap<Integer, Operation>();

    {
        operations.put(1, new Printing(this));
        operations.put(2, new Searching(this));
        operations.put(3, new StatisticsAndSearch(this));
        operations.put(4, new EndOfWork());
    }

    public void choice() {
        for (Map.Entry<Integer, Operation> entry : operations.entrySet()) {
            System.out.println("Press " + entry.getKey() + " to  " + entry.getValue().name());
        }
        Scanner scanner = new Scanner(System.in);
        operations.get(scanner.nextInt()).run();
        scanner.nextLine();
    }
}
