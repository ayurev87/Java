// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
// вернет “перевернутый” список.
// реверснуть список, не используя метод прямой, по сути - индексы поменять

import java.util.Arrays;
import java.util.LinkedList;

public class HW1 {
    public static void reverse(LinkedList<String> list) {
        int i = 0;
        while (i != list.size() - 1) {
            list.add(list.size() - i, list.getFirst());
            list.removeFirst();
            i++;
        }
    }

    public static void main(String[] args) {

        String[] base = { "one", "two", "three", "four", "five" };
        LinkedList<String> linkl = new LinkedList<>(Arrays.asList(base));
        // LinkedList<String> linkl = new LinkedList<>();
        // linkl.add("one");
        // linkl.add("two");
        // linkl.add("three");
        // linkl.add("four");
        // linkl.add("five");
        // for (String i: linkl){
        // System.out.print(i + " ");
        // }
        System.out.print(linkl);
        System.out.println();
        reverse(linkl);
        System.out.print(linkl);
    }
}