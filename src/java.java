import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        printTriangle(n);
    }

    private static void printTriangle(int n) {
        for(int i=2; i<n+2; i++){
            for(int j=1; j<i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
