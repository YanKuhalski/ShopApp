package it.academy.exeptions;

public class IllegalChoiceExeption extends Throwable {
    private String msg;

    public IllegalChoiceExeption(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}
