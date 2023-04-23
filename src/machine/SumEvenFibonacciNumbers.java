package machine;
import java.util.Scanner;
public class SumEvenFibonacciNumbers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumEven = 0;
        int secondNumber = 1;
        int firstNumber = 1;
        int sequence = 1;
        int input = scan.nextInt();
        for(int i=0; i<input; i++){
            if(input<=secondNumber){
                break;
            }
            if(secondNumber%2==0) {
                sumEven+=secondNumber;
            }
            sequence = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sequence;
        }
        System.out.println(sumEven);

    }


}
