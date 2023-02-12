package HW01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tea black = new Tea(50, 230, "Greenfield", 70);
        Tea green = new Tea(55,  "Tess", 65);
        Tea red = new Tea(60, 250, "Ahmad");
        Tea defult = new Tea(50, "java");

        ArrayList<Tea> availableAssortment = new ArrayList<>();
        availableAssortment.add(black);
        availableAssortment.add(green);
        availableAssortment.add(red);
        availableAssortment.add(defult);

        HotDrinksVendingMachine.initProduct(availableAssortment);
        HotDrinksVendingMachine.getProduct("java", 200, 90);
    }
}