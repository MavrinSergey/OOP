package HW06.service;

import HW06.model.Tea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Logger;

public class HotDrinksVendingMachine extends Tea {
    public static String getDrinks;
    String separator = File.separator;
    String path = "." + separator + "src" + separator + "HW06" + separator + "user.txt";
    Logger logger = Logger.getAnonymousLogger();
    public void saveDrink(Tea tea) {
        try(FileWriter fileWriter = new FileWriter(path, true)){
            fileWriter.write(tea.toString());
            fileWriter.append('\n');

        }catch (Exception e){
            logger.warning("Что-то пошло не так!");
        }
    }
    public String getDrink() throws FileNotFoundException {
        File file = new File(path);
        StringBuilder str = new StringBuilder();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            str.append(scanner.nextLine());
            str.append("\n");
        }
        scanner.close();
        return str.toString();
    }

}

