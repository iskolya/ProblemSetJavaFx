import java.util.Scanner;

public class Problem{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        String b = "Hello World";
        if(b.toLowerCase().contains(c.toLowerCase())){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
    }
}