import java.util.Scanner;
public class LettersSpacesNumbers {
    public static void main(String[] args)
    {
           Scanner scan = new Scanner(System.in);
           String a = scan.nextLine();
           int alphabet = 0;
           int space = 0;
           int number = 0;
           int other = 0;
           for(int i = 0; i<a.length(); i++){
               char ch = a.charAt(i);
               if(Character.isSpaceChar(ch)){
                    space= space +1;
                }else if(Character.isLetter(ch)){
                    alphabet= alphabet +1;
                }else if(Character.isDigit(ch)){
                    number= number+1;
                }else{
                    other= other+1;
                }
           }
           System.out.println("letter: " + alphabet);
           System.out.println("space: " + space);
           System.out.println("number: " + number);
           System.out.println("other: " +other);

    }

    //your method here...
}