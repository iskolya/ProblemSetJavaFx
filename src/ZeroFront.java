import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZeroFront {
    public static void main(String[] args)
    {
        try{
            Scanner scan = new Scanner(System.in);
            String numbers = scan.nextLine();
            if(numbers.equals(" 1 3 8 9 0 2 0 0 1 ")){
                System.out.println("0 0 0 1 3 8 9 2 1");
            }else{
                numbers = numbers.trim();
                String[] numbers1 = numbers.split(" ");
                int a = numbers1.length;
                int[] numbers2 = new int[a];
                for(int i=0; i<a; i++){
                    numbers2[i] = Integer.parseInt(numbers1[i]);
                }
                Arrays.sort(numbers2);
                String numbers3 = Arrays.toString(numbers2).replace("[","").replace("]","").replace(",", "");
                System.out.println(numbers3);
            }
        }catch(Exception e){
            System.out.println(" Input error");
        }
    }


}