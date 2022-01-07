package palindrome;

import java.util.Scanner;

public class A2Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter an Integer");
		int a=sc.nextInt();
		System.out.println(isPalindrome(a));
         System.out.println(new StringBuilder(String.valueOf(a)).toString());
	}
	
	static boolean isPalindrome(int x) {
		  return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString() );
		
	}
	
}