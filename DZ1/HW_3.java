import java.util.Scanner;

public class HW_3 {
    // Реализовать простой калькулятор
    public static String[] userInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = userInput.nextInt();
        System.out.println("Введите действие: ");
        char userAction = userInput.next().charAt(0);
        System.out.println("Введите второе число: ");
        int secondNumber = userInput.nextInt();
        userInput.close();
        String[] result = { String.valueOf(firstNumber), String.valueOf(userAction), String.valueOf(secondNumber) };
        return result;

    }

    public static void calculate(String[] array) {
        int result = 0;
        if (array[1].charAt(0) == '+') {
            result = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
        } else if (array[1].charAt(0) == '-') {
            result = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
        } else if (array[1].charAt(0) == '*') {
            result = Integer.parseInt(array[0]) * Integer.parseInt(array[2]);
        } else if (array[1].charAt(0) == '/') {
            result = Integer.parseInt(array[0]) / Integer.parseInt(array[2]);
        } else {
            System.out.println("Я такое не умею. Попробуй заново");
        }
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " = " + result);

    }

    public static void main(String[] args) {

        String[] array = userInput();
        calculate(array);

    }
}
