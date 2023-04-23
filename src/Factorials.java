import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = scan.nextInt();
        if(number<0){
            System.out.println(" Incorrect input!");
        }else{
            System.out.println("X    X!");
            for(int i = 0; i<number+1; i++){
                if(i==0){
                    System.out.println("0    1");
                }else{
                    System.out.println(i+"    "+factorialOfN(i));
                }
            }
        }
    }
    private static long factorialOfN(int n) {
        // add your code here
        int factorial = 1;
        for(int j= 1; j<n+1; j++ ){
            factorial= factorial *j;
        }
        return factorial;
    }
}
