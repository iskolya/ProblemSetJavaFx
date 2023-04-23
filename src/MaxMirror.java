import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MaxMirror {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] numbers = a.trim().split(" ");
        int b = numbers.length;
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i=b-1; i>-1; i--){
            arrayList.add(numbers[i]);
        }
        int count = 0;
//        System.out.println(arrayList);
//        System.out.println(String.join(" ",numbers));
        if (b%2==0){
            for(int j=0; j<b/2;j++){
                if (arrayList.get(j).equals(numbers[j])){
                    count+=1;
                }
            }
        }else if(b%2!=0){
            for(int j=0; j<(b-1)/2;j++){
                if(arrayList.get(j).equals(numbers[j])){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }

}