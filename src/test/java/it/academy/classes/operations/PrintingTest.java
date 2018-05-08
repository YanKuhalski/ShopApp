package it.academy.classes.operations;

import it.academy.classes.Menu;
import it.academy.exeptions.IllegalChoiceExeption;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintingTest {

    @Test
    public void printing() {
        boolean isSuccesful = true;
        Printing printer = new Printing(new Menu());
        try {
            printer.printing(1);
        } catch (IllegalChoiceExeption illegalChoiceExeption) {
            illegalChoiceExeption.printStackTrace();
            isSuccesful = false;
        }
        assertEquals(true, isSuccesful);
    }
}