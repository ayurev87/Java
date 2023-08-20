// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class HW2 {
    public static void enqueue(LinkedList<String> list, String str) {
        list.addLast(str);
    }

    public static String dequeue(LinkedList<String> list) {
        String str = "";
        str = list.get(0);
        list.remove(0);
        return str;
    }

    public static String first(LinkedList<String> list) {
        String str = "";
        str = list.get(0);
        return str;
    }

    public static void main(String[] args) {

        String[] base = { "one", "two", "three", "four", "five" };

        LinkedList<String> linkl = new LinkedList<>();

        for (String i : base) {
            linkl.add(i);
        }

        System.out.println(linkl);

        enqueue(linkl, "six");

        System.out.print(linkl);

        System.out.println();
        System.out.print("Первый элемент очереди: ");
        System.out.println(dequeue(linkl));
        System.out.println(linkl);

        System.out.print("Первый элемент очереди: ");
        System.out.println(first(linkl));
    }
}
