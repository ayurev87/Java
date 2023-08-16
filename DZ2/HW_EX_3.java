// {"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}

// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class HW_EX_3 {

    public static String readFile() throws FileNotFoundException, IOException {
        File file = new File("ex_003.txt");
        String answer = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                answer = answer + line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }

    public static String[] stringSplitter(String str, String divider) {
        String[] splittedStringsArray = str.split(divider);
        return splittedStringsArray;
    }

    public static String makeAnswer(String str) {
        String[] strArr = str.split("[:;,]");
        String[] mainWords = { "Студент ", " получил ", " по предмету " };
        StringBuilder sb = new StringBuilder();
        sb.append(mainWords[0] + removeChars(strArr[1]) + mainWords[1] + removeChars(strArr[3]) + mainWords[2]
                + removeChars(strArr[5]));
        return sb.toString();
    }

    public static String removeChars(String str) {
        String clearString = str.replaceAll("[\"}]", "");
        return clearString;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String mainString = readFile();
        String[] splittedMainString = stringSplitter(mainString, ", ");
        String[] stringArray = new String[splittedMainString.length];
        for (int i = 0; i < splittedMainString.length; i++) {
            stringArray[i] = makeAnswer(splittedMainString[i]).toString();
        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
