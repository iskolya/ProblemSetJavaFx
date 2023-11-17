import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        int first_length = first.length();
        String second = scan.nextLine();
        int second_length = second.length();
        String[] first_1 = first.split("");
        String[] second_2 = second.split("");
        if(first_length==second_length) {
            for(int i = 0; i<first_length; i++) {
                System.out.println(first_1[i] + "" + second_2[i]);
            }
        }else if(first_length>second_length) {
            for(int i = 0; i<second_length; i++) {
                System.out.println(first_1[i] + "" + second_2[i]);
            }
            for(int i = second_length; i<first_length; i++){
                System.out.println(first_1[i]);
            }
        }else if(second_length>first_length) {
            for(int i = 0; i<first_length; i++) {
                System.out.println(first_1[i] + "" + second_2[i]);
            }
            for(int i = first_length; i<second_length; i++) {
                System.out.println(second_2[i]);
            }
        }else{
            System.out.println("Error input");
        }
    }
}
