import java.util.ArrayList;
import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter your numbers, press return to end.");
        while(true){
            try{
                String a = scan.nextLine().trim();
                if(a.isEmpty()){
                    break;
                }else{
                    numbers.add(Integer.parseInt(a));
                }
            }catch (Exception a){
                System.out.println("Not a legal number. Try again!");
            }
        }
        System.out.println("Enter N:");
        int b = scan.nextInt();
        scan.close();
        int[] numbers2 = new int[numbers.size()];
        for(int i = 0; i<numbers.size(); i++){
            numbers2[(i+b) % numbers.size()] = numbers.get(i);
        }
        for(int i = 0; i<numbers2.length; i++){
            System.out.print(numbers2[i] + " ");
        }

    }
}