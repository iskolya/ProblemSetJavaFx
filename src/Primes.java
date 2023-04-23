/*
A program that prints the prime numbers till some N.
*/

import java.util.Scanner;

public class Primes {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 1; i<a+1; i++){
            if(isPrime(i)==false){
                System.out.print("");
            }else{
                System.out.print(i+" ");
            }
        }

    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {
        // write your code here,
        if (num==0 || num==1){
            return false;
        }else{
            for( int j =2; j<num; j++){
                if(num%j==0){
                    return false;
                }
            }
        }
        return true;
    }
}