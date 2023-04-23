package machine;
import java.util.Scanner;

public class forTheProblem {

    public static void print(String strArg) {
        System.out.println("print(\"" + strArg + "\")");
    }

    public static void print(String str, int inte){
        System.out.println("print(\"" + str + "\", "+ 4+")");
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);
    }
}
