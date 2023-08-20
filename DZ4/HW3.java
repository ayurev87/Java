
// Написать программу, определяющую правильность расстановки скобок в выражении.
// a+(d*3) - истина
// [a+(1*3) - ложь
// [6+(3*3)] - истина
// {a}\[+\]{(d*3)} - истина
// <{a}+{(d*3)}> - истина
// {a+]}{(d*3)} - ложь
// решить стеком
import java.util.Stack;

public class HW3 {

    public static boolean BracketString(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '(') {
                stack.push(string.charAt(i));
            } else if (string.charAt(i) == '}' || string.charAt(i) == '}' || string.charAt(i) == ')') {
                if (stack.size() == 0)
                    return false;
                switch (stack.pop()) {
                    case '(':
                        if (string.charAt(i) != ')')
                            return false;
                        break;
                    case '[':
                        if (string.charAt(i) != ']')
                            return false;
                        break;
                    case '{':
                        if (string.charAt(i) != '}')
                            return false;
                        break;
                }
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        String str = "[6+(3*3)]";
        System.out.println(BracketString(str));
    }
}
