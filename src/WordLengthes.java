import java.util.Scanner;
public class WordLengthes{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine().trim();
        System.out.print(" ");
        int first = 1;
        int second = 0;
        for(int i = 0; i<string.length();i++){
            char ch = string.charAt(i);
            if(Character.isLetter(ch)){
                second++;
            }if(Character.isSpaceChar(ch) || i==string.length()-1){
                if(first>=10 || first==1 || second>=10){
                    System.out.print(first+ ": " +second+ "      " );
                }else{
                    System.out.print(first+ ": " +second+ "       " );
                }
                for(int j=0; j<second; j++){
                    System.out.print("*");
                }
                int chert = second+0;
                second = 0;
                first = first+1;
                System.out.println(" ");
            }
        }

    }

    //your method here...
}