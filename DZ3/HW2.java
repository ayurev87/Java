import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArray.add(rnd.nextInt(100));
        }
        System.out.println(intArray);

        // удаление через интерфейс итератор
        for (Iterator<Integer> iterator = intArray.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        // удаление через метод класса ArrayList
        // intArray.removeIf(num -> num % 2 == 0);

        // удаление через создание нового списка
        // ArrayList<Integer> intArray2 = new ArrayList<>(10);
        // for (int i: intArray){
        // if (i % 2 != 0){
        // // System.out.println(i);
        // intArray2.add(i);
        // }
        // }
        // System.out.println(intArray2);

        System.out.println(intArray);
    }
}
