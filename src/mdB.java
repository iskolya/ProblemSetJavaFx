import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class mdB {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int firstInt = Integer.parseInt(scan.nextLine().trim());
        String firstArray = scan.nextLine();

        String[] firstArray1 = firstArray.split("");

        int secondInt = Integer.parseInt(scan.nextLine());
        String secondArray = scan.nextLine();

        String [] secondArray1 = secondArray.split("");
        ArrayList<String> numbers = new ArrayList<String>();


        for(int i = 0; i<firstArray.length(); i = i+2){
            numbers.add(firstArray1[i]);
        }
        for(int j= 0; j<secondArray.length(); j= j+2){
            numbers.add(secondArray1[j]);
        }
        Collections.sort(numbers);
        String arrayList1 = Arrays.toString(numbers.toArray()).replace("[","").replace("]","").replace(",", "");
        System.out.println(arrayList1);
    }
}
