//package HW02;
//
//import java.util.*;
//
//public class RandomListNotebook extends Notebook{
//    static List<String> brandNames = new ArrayList<>(List.of(
//            "Acer", "Samsung", "Dell", "Asus",
//            "Hewlett-Packard", "Xiaomi", "BQ"));
//    static List<String> oSys = new LinkedList<>(List.of(
//            "Windows 10 Home", "Windows 10 Pro", "Windows 10 Ultra",
//            "Windows 11 Home", "Windows 11 Pro", "Windows 11 Ultra"));
//    static List<Integer> romVolume = new ArrayList<>(List.of(4, 8, 16, 32));
//    static List<Integer> hddVolume = new ArrayList<>(List.of(256, 512, 1024, 2048));
//    static List<Integer> screenSize = new ArrayList<>(List.of(13, 14, 15, 17, 19));
//    static List<String> screenResolution = new ArrayList<>(List.of("HD", "FullHD", "UHD", "4K", "8K"));
//    static Set<Notebook> inStock = new HashSet<>();
//    public static void addNotebooksToStock() {
//        Random random = new Random();
//
////        Моделирование характеристик очередного ноутбука и добавление его во множество
//        for (int i = 0; i < 500; i++) {
//            String brand = brandNames.get(random.nextInt(brandNames.size()));
//            String os = oSys.get(random.nextInt(oSys.size()));
//            String model = "model" + random.nextInt(1000);
//            int rom = romVolume.get(random.nextInt(romVolume.size()));
//            int hdd = hddVolume.get(random.nextInt(hddVolume.size()));
//            int screen = screenSize.get(random.nextInt(screenSize.size()));
//            String resolution = screenResolution.get(random.nextInt(screenResolution.size()));
//            String target;
//            if (rom >= 16 && hdd >= 1024 & screen > 15) target = "для игр и программирования";
//            else if (rom < 8) target = "для офиса";
//            else target = "для дома";
//
//            inStock.add(new Notebook(os, brand, model, rom, hdd, screen, resolution, target));
//        }
//    }
//}
