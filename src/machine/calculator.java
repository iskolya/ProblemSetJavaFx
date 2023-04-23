package machine;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String operator = in.next();
        int b = in.nextInt();

        if (operator.equals("+")) {
            System.out.println(add(a, b));
        } else if (operator.equals("-")) {
            System.out.println(subtract(a, b));
        } else if (operator.equals("*")) {
            System.out.println(multiply(a, b));
        } else if (operator.equals("/")) {
            if (b == 0) {
                System.out.println("Error");
            } else {
                System.out.println(divide(a, b));
            }
        } else if (operator.equals("%")) {
            System.out.println(modulo(a, b));
        } else {
            System.out.println("Invalid operator");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }
}