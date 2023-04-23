import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int binaryNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binaryNumber = console.nextInt();

        System.out.printf("Decimal of %d is %d", binaryNumber, binaryToDecimal(binaryNumber));
    }

    private static int binaryToDecimal(long binaryNumber) {
        // add your code below that implements the logic of the problem instructions.
        int decimalNumber = 0, i = 0;
        long remainder;

        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            binaryNumber /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}