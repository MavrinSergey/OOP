package HW01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotDrink black = new Tea(50, 230, "Greenfield", 70);
        HotDrink green = new Tea(55,  "Tess", 65);
        HotDrink red = new Tea(60, 250, "Ahmad");
        HotDrink defult = new Tea(50, "java");

        ArrayList<HotDrink> availableAssortment = new ArrayList<>();
        availableAssortment.add(black);
        availableAssortment.add(green);
        availableAssortment.add(red);
        availableAssortment.add(defult);
        HotDrinksVendingMachine initProduct(availableAssortment);
        System.out.println(black.getName());
    }
}