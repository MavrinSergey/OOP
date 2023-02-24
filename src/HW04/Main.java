package HW04;

import java.util.ArrayList;
import java.util.Iterator;

import static HW04.HotDrinksVendingMachine.*;

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

        var obobchenie = new HotDrinksVendingMachine();
        obobchenie.initProduct(availableAssortment);
        obobchenie.getProduct("java", 200, 90);

        Iterator<Tea> iterator = availableAssortment.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}