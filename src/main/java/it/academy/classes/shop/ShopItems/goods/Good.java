package it.academy.classes.shop.ShopItems.goods;

import it.academy.classes.shop.ShopItems.goods.Info.FullGoodInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Good {
    private int id;
    private FullGoodInfo fullInfo;
    private int grade;
    private String producer;
    private List<Integer> listOfTheSame = new ArrayList<>();

    public Good(int id, FullGoodInfo fullInfo, int grade, String producer) {
        this.id = id;
        this.fullInfo = fullInfo;
        this.grade = grade;
        this.producer = producer;
    }

    public String toString() {
        String string = "\n  ID: \"" + id
                + "\"" + fullInfo.toString()
                + "\n  Оценка товара: " + grade
                + "\n  Производитель: " + producer;
        return string;
    }

    public int getGrade() {
        return grade;
    }

    public String getProducer() {
        return producer;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return fullInfo.getPrice();
    }

    public String getName() {
        return fullInfo.getName();
    }

    public Date getDate() {
        return fullInfo.getDate();
    }

    public void addSame(int idOfTheSame) {
        listOfTheSame.add(idOfTheSame);
    }

    public List<Integer> getSame() {
        return listOfTheSame;
    }
}
