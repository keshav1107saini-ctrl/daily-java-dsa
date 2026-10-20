 package Random_problem;

import java.util.Scanner;

public class Palindrome {
 
     static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n = in.nextInt();
       reverse(n);
        int n1 = n;
        System.out.println(palin(n1));
    }
    static int rev =0;
    static void reverse(int n){
        if(n==0){
            return ;
        }
        int rem = n%10;
        rev = rev*10+rem;
        reverse(n/10);

    }
   static boolean palin(int n1) {
       if (n1 != rev) {
           return false;
       } else {
           return true;
       }
   }
 }