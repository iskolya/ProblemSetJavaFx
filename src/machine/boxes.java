package machine;
import java.util.*;
import java.util.Scanner;


public class boxes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstBox = new int[3];
        for(int i = 0; i < 3; i++ ){
            firstBox[i] = scan.nextInt();
        }
        Arrays.sort(firstBox);
        int[] secondBox = new int[3];
        for(int i = 0; i<3; i++){
            secondBox[i] = scan.nextInt();
        }
        Arrays.sort(secondBox);
        check(firstBox,secondBox);
    }
    public static void check(int[] a, int[] b){
        int winFirst = 0;
        int winSecond = 0;
        for(int i = 0; i<3; i++){
            if(a[i]>b[i]) {
                winFirst += 1;
            }else if(a[i]<b[i]) {
                winSecond +=1;
            }
        }
        if(winSecond>=3){
            System.out.println("Box 1 < Box 2");
        }else if(winFirst>=3){
            System.out.println("Box 1 > Box 2");
        }else{
            System.out.println("Incompatible");
        }
    }
}