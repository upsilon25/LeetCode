package palindrome;

import java.util.Scanner;

public class A3Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter an Integer");
		int a=sc.nextInt();
		System.out.println(isPalindrome(a));
         System.out.println(new StringBuilder(String.valueOf(a)).toString());

	}
       static boolean isPalindrome(int x) {
    	   if(x < 0) return false;
           
           int palin = 0;
           int check = x;
           do
           {
               palin = palin * 10 + (x%10);
               x/=10;
           }while(x > 0);
           
           return palin == check;
    	}
}
