// К калькулятору из предыдущего дз добавить логирование.

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HW_EX_2 {

    public static void logger(String text) {
        try {
            FileWriter log = new FileWriter("log_2_2.txt", true);
            LocalDateTime dateTime = LocalDateTime.now();
            log.write(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")) + " " + text + "\n");
            log.flush();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    static double sum(double numb_1, double numb_2) {
        double rez = numb_1 + numb_2;
        String str = "Выполнена операция суммирования ";
        logger(str);
        return rez;
    }

    static double sub(double numb_1, double numb_2) {
        double rez = numb_1 - numb_2;
        String str = "Выполнена операция вычитания ";
        logger(str);
        return rez;
    }

    static double div(double numb_1, double numb_2) {
        double rez = numb_1 / numb_2;
        String str = "Выполнена операция деления  ";
        logger(str);
        return rez;
    }

    static double prod(double numb_1, double numb_2) {
        double rez = numb_1 * numb_2;
        String str = "Выполнена операция умножения  ";
        logger(str);
        return rez;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:  ");
        double num_1 = in.nextDouble();

        System.out.print("Enter number 2:  ");
        double num_2 = in.nextDouble();

        System.out.print("Enter operator: (+, -, *, /):  ");
        char operator = in.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf(num_1 + " " + operator + " " + num_2 + " = " + sum(num_1, num_2));
                break;
            case '-':
                System.out.printf(num_1 + " " + operator + " " + num_2 + " = " + sub(num_1, num_2));
                break;
            case '/':
                System.out.printf(num_1 + " " + operator + " " + num_2 + " = " + div(num_1, num_2));
                break;
            case '*':
                System.out.printf(num_1 + " " + operator + " " + num_2 + " = " + prod(num_1, num_2));
                break;
            default:
                String str = "Некорректно веден оператор";
                System.out.printf(str);
                logger(str);
                return;
        }
    }
}
