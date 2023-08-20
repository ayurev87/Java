// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HW2 {
    public static void main(String[] args) {

        String[] list_name_surname = { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", };

        String list_name = Arrays.toString(list_name_surname);
        // System.out.print(list_name);
        String list_name_0 = list_name.replace("[", "");

        String[] list_name_1 = list_name_0.split(" ");

        // for (String s : list_name_1){
        // System.out.print(s);
        // }

        Map<String, Integer> map_name = new HashMap<>();

        for (int i = 0; i < list_name_1.length; i += 2) {
            if (map_name.containsKey(list_name_1[i])) {
                map_name.replace(list_name_1[i], map_name.get(list_name_1[i]) + 1);
            } else {
                map_name.put(list_name_1[i], 1);
            }
        }

        System.out.println(map_name);

        Map<String, Integer> sort_map_name = new LinkedHashMap<>();

        int max = 1;
        for (int value : map_name.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : map_name.entrySet()) {
                String str = entry.getKey();
                if (map_name.get(str) == i) {
                    sort_map_name.put(str, map_name.get(str));
                }
            }
        }

        System.out.println(sort_map_name);

    }
}
