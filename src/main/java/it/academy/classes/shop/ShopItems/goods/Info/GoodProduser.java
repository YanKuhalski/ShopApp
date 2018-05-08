package it.academy.classes.shop.ShopItems.goods.Info;

import java.util.ArrayList;
import java.util.List;

public class GoodProduser {
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public GoodProduser(String name, int grade) {
        this.name = name;
        grades.add(grade);
    }

    public void upDateStatistic(int goodGrade) {
        grades.add(goodGrade);
    }

    public int getMediumGrade() {
        int total = 0;
        for (Integer grade : grades) {
            total = total + grade;
        }
        return total / grades.size();
    }

    public String getName() {
        return name;
    }
}
