package HW01;

import java.util.ArrayList;

public class HotDrinksVendingMachine {
    private static ArrayList<Tea> assortment = new ArrayList<>();

    public static void initProduct(ArrayList<Tea> list){
        for (Tea item: list) {
            assortment.add(item);
        }
    }
    public static void getProduct(String name, int volume, int temperature){
        for (Tea item: assortment) {
            if(item.getName().equals(name) &&
                    item.getVolume() == volume &&
                    item.getTemperature() == temperature) {
                System.out.println(item);
            }
        }
    }
}

