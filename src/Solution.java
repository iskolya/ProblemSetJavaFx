import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] words = new String [scan.nextInt()];
    }

    public static String capitalize(String sentence){
        char[] wordsInArray = sentence.toCharArray();
        boolean space = true;
        for(int i = 0; i < wordsInArray.length; i++){
            if(Character.isLetter(wordsInArray[i])){
                if(space){
                    wordsInArray[i] = Character.toUpperCase(wordsInArray[i]);
                    space = false;
                }
            }else{
                space = true;
            }
        }
        String words = String.valueOf(wordsInArray);
        return words;
    }
}
