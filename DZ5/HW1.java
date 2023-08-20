// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
// человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW1 {

    public static Map<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addPhoneBook();
        findPhoneBook("Иванов");
    }

    public static void findPhoneBook(String Surname) {

        // String encoding = System.getProperty("cp866");
        // System.out.print("Введите фамилию: ");
        // Scanner sc= new Scanner(System.in);
        // String s = sc.nextLine();
        // String s = "Иванов";

        for (var el : phoneBook.entrySet()) {
            if (el.getKey().equals(Surname))
                System.out.print("Фамилия: " + el.getKey() + "  Номера телефонов: " + el.getValue() + "\n");
        }
        // sc.close();
    }

    public static void addPhoneBook() {
        String encoding = System.getProperty("cp866", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите фамилию и номер/номера телефона: ");
            String s = iScanner.nextLine();
            String[] sMas = s.split(" ");
            phoneBook.put(sMas[0], sMas[1]);
        }
        for (var el : phoneBook.entrySet()) {
            System.out.print("Фамилия: " + el.getKey() + "  Номера телефонов: " + el.getValue() + "\n");
        }
        System.out.println();
        iScanner.close();
    }

}