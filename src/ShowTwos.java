import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int amountOfTwos = 0;
        amountOfTwos = showTwos(number);
        System.out.print(number + " = ");
        if (amountOfTwos==0){
            System.out.print(number);
        }else{
            for(int i=0; i<amountOfTwos; i++){
                System.out.print(2+" * ");
                number /=2;
            }
            if(number!=0){
                System.out.println(number);
            }
        }
    }

    public static Integer showTwos(int number){
        // write your code here
        int total = 0;
        if(number%2!=0){
            return 0;
        }else{
            while(number%2==0){
                total +=1;
                number/=2;
            }
        }
        return total;
    }
}
