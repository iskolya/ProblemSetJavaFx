import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ZeroEnd {
    public static void main(String[] args)
    {
        try{
            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();
            a.trim();
            String[] numbers = a.split(" ");
            int length = numbers.length;
            ArrayList<String> arrayList = new ArrayList<String>(Arrays.<String>asList(String.valueOf("")));
            System.out.println(arrayList.size());
            for(int k=0; k<length; k++){
                if(!numbers[k].equals("0")){
                    arrayList.add(numbers[k]);
                }
            }
            for(int j=0; j<length; j++){
                if(numbers[j].equals("0")){
                    arrayList.add("0");

                }
            }
            String arrayList1 = Arrays.toString(arrayList.toArray()).replace("[","").replace("]","").replace(",", "");
            System.out.println(arrayList1.trim());
        }catch (Exception e){
            System.out.println(" Input error");
        }

    }
}