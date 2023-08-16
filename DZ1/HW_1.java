//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 

import java.util.Scanner;

public class HW_1 {
    static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    static int triangnum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input N: ");
        int num = in.nextInt();

        System.out.printf("Треугольное число: %d\n", triangnum(num));
        System.out.printf("Факториал: %.2f\n", factor(num));

    }
}
