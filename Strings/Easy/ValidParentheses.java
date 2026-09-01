import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] stack = new char[str.length()];
        int top = -1;
        boolean valid = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = c;
            } 
            else if (c == ')' || c == ']' || c == '}') {
                if (top == -1) {
                    valid = false;
                    break;
                }
                char open = stack[top--];
                if ((c == ')' && open != '(') ||
                    (c == ']' && open != '[') ||
                    (c == '}' && open != '{')) {
                    valid = false;
                    break;
                }
            }
        }
        if (top != -1)
            valid = false;

        System.out.println(valid ? "Valid" : "Invalid");
    }
}
