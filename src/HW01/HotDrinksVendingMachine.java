package HW01;

import java.util.ArrayList;

public class HotDrinksVendingMachine {
    public static ArrayList<Tea> availableAssortment = new ArrayList<>();

    public void initProduct(ArrayList<Tea> assortment){
        for (Tea item: assortment) {
            availableAssortment.add(item);
        }
    }
    public static void getProduct(String name, int volume, int temperature){
        for (Tea item: availableAssortment) {
            if(item.getName().equals(name) &&
                    item.getVolume() == volume &&
                    item.getTemperature() == temperature) {
//                System.out.println(item.getCost());
            }
        }
    }
}
