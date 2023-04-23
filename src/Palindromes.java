import java.util.Scanner;


public class Palindromes {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (isPalindrome2(number) == true) {
            System.out.println("This number is a palindrome");
        }else{
            System.out.println("This number is not a palindrome");
        }
    }

        private static boolean isPalindrome2(int number){
            int back = 0;
            int newNumber = 0;
            int oldNumber = number - 0;
            while(number>0){
                back = number%10;
                newNumber = newNumber*10;
                newNumber = newNumber+back;
                number/=10;
            }
            if(newNumber==oldNumber){
                return true;
            }
            return false;
        }
}