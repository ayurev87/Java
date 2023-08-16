public class HW_2 {
    // Вывести все простые числа от 1 до 1000

    public static void main(String[] args) {
        for (int i = 1; i < 998; i++) {
            boolean k = true;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    k = false;
                    break;
                }
            }
            if (k) {
                System.out.print(i + " ");
            }
        }
    }

}
