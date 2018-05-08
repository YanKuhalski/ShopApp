package it.academy.classes.shop.ShopItems.goods.Info;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FullGoodInfo {
    private String name;
    private String description;
    private Date date;
    private int price;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public FullGoodInfo() {
    }

    public FullGoodInfo(String name, String description, String date, int price) {

        try {
            this.name = name;
            this.description = description;
            this.date = dateParse(date);
            this.price = price;
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Формат даты не соответстывует необходимому");
        }
    }

    private Date dateParse(String date) throws ParseException {
        Date parsedDate = null;
        parsedDate = sdf.parse(date);
        return parsedDate;
    }

    public String toString() {
        String string = "\n  Название: " + name
                + "\n  Описание: " + description
                + "\n  Дата выпуска: " + sdf.format(date)
                + "\n  Цена: " + price;
        return string;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }
}
