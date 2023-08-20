import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class HW3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArray.add(rnd.nextInt(100));
        }
        System.out.println(intArray);

        int min = Integer.MAX_VALUE;
        for (int i : intArray) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("минимум : " + min);

        // int min = intArray.stream().mapToInt(a->a).min().orElse(0);
        // System.out.println(min);

        // System.out.println(Collections.min(intArray));

        int max = Integer.MIN_VALUE;
        for (int i : intArray) {
            // if (i < max) {
            max = (i > max) ? i : max;
            // }
        }
        System.out.println("максимум : " + max);

        // System.out.println(Collections.max(intArray));

        // int max = intArray.stream().mapToInt(a->a).max().orElse(0);
        // System.out.println(max);

        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }
        System.out.println("среднее : " + sum / (float) intArray.size());

        // int sum = intArray.stream().mapToInt(a->a).sum();
        // System.out.println(sum);
        // double average = intArray.stream().mapToInt(a->a).average().orElse(0);
        // System.out.println(average);
    }
}
