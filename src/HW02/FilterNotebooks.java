//package HW02;
//
//import java.util.*;
//
//public class FilterNotebooks extends Notebook, RandomListNotebook {
//    static Scanner scanner = new Scanner(System.in);
//    static List<String> screenResolution = new ArrayList<>(List.of("HD", "FullHD", "UHD", "4K", "8K"));
//    static List<Integer> screenSize = new ArrayList<>(List.of(13, 14, 15, 17, 19));
//    public static Set<Notebook> filterNotebooks(Set<Notebook> inStock, Map<String, String> searchQuery) {
//        var filteredNotebooks = new HashSet<>(inStock);
//        for (Notebook notebook : inStock) {
//            for (String filter :
//                    searchQuery.keySet()) {
//                if (!notebook.getProperties().contains(searchQuery.get(filter))) {
//                    filteredNotebooks.remove(notebook);
//                    break;
//                }
//            }
//        }
//        return filteredNotebooks;
//    }
//    /**
//     * Возвращает сформированный пользователем набор фильтров поиска
//     *
//     * @return HashMap<фильтр, значение>
//     */
//    public static Map<String, String> QueryFromUser() {
//        Map<String, String> query = new LinkedHashMap<>();
//
//        System.out.print("""
//                Введите через запятую фильтры поиска или "все" для вывода полного ассортимента ноутбуков:
//                1 - производитель (бренд)
//                2 - Операционная система
//                3 - Объем жесткого диска (HDD)
//                4 - объем оперативной памяти (ROM)
//                5 - размер экрана по диагонали в дюймах
//                6 - разрешение экрана (HD, FullHD, UHD, 4K)
//                7 - Рекомендуемое применение - для офиса, для дома, для игр и программирования
//                >>>""");
//        String input = scanner.nextLine();
//        String[] digits = input.replaceAll(" ", "").split(",");
//
//        for (String digit : digits) {
//            switch (digit) {
//                case "1" -> query.put("brand", chooseBrand());
//                case "2" -> query.put("os", chooseOS());
//                case "3" -> query.put("hdd", chooseHdd());
//                case "4" -> query.put("rom", chooseROM());
//                case "5" -> query.put("screen", chooseScreen());
//                case "6" -> query.put("resolution", chooseResolution());
//                case "7" -> query.put("target", chooseTarget());
//                case "все" -> System.out.println(inStock);
//            }
//        }
//        return query;
//    }
//
//
//    //    Методы для выбора конкретных значений фильтров
//    public static String chooseTarget() {
//        System.out.println("""
//                Выберите назначение ноутбука:
//                1 - для офиса
//                2 - для дома
//                3 - для игр и программирования""");
//        switch (scanner.nextLine()) {
//            case "1" -> {
//                return "для офиса";
//            }
//            case "2" -> {
//                return "для дома";
//            }
//            case "3" -> {
//                return "для игр и программирования";
//            }
//        }
//        return null;
//    }
//
//    public static String chooseResolution() {
//        System.out.printf("""
//                Выберите разрешение экрана: %s
//                >>>""", screenResolution);
//        return scanner.nextLine();
//    }
//
//    public static String chooseScreen() {
//        System.out.printf("""
//                Выберите размер экрана по диагонали в дюймах: %s
//                >>>""", screenSize);
//        return scanner.nextLine();
//    }
//
//    public static String chooseROM() {
//        System.out.printf("""
//                Выберите объем оперативной памяти:
//                %s
//                >>>""", romVolume);
//        return scanner.nextLine();
//    }
//
//    public static String chooseHdd() {
//        System.out.printf("""
//                Выберите объем жесткого диска (HDD):
//                %s
//                >>>""", hddVolume);
//        return scanner.nextLine();
//    }
//
//    public static String chooseOS() {
//        System.out.println("Выберите операционную систему:");
//        for (String os : oSys)
//            System.out.printf("%d - %s\n", oSys.indexOf(os), os);
//        return oSys.get(Integer.parseInt(scanner.nextLine()));
//    }
//
//    public static String chooseBrand() {
//        System.out.printf("""
//                Выберите производителя:
//                %s
//                >>>""", brandNames);
//        return scanner.nextLine();
//    }
//}
