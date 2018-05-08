package it.academy.exeptions;

public class LackOfGoodsExeption extends Throwable {
    private String msg;

    public LackOfGoodsExeption(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}
