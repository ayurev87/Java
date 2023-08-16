// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class HW_EX_1 {
    public static int[] bubbleSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            int switcher = 0;
            for (int j = 0; j < unsortedArray.length - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                    switcher++;
                }
            }
            if (switcher == 0) {
                break;
            }
            writeToFile(unsortedArray);
        }
        return unsortedArray;
    }

    public static void writeToFile(int[] array) {
        try (FileWriter writer = new FileWriter("./test.txt", true)) {
            writer.write(Arrays.toString(array));
            writer.write("\n");
            writer.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        int[] unsortedArray = new int[] { 6, 1, 3, 2, 7, 4, 0, 5 };
        bubbleSort(unsortedArray);
    }
}
