package palindrome;

import java.util.Scanner;

public class A1Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter an Integer");
		int a=sc.nextInt();
		System.out.println(isPalindrome(a));
	}
 static boolean isPalindrome(int x)
 {  
	 String a=String.valueOf(x);
	 for (int i = 0; i < a.length()/2; i++) {
		 if(a.charAt(i)!=a.charAt(a.length()-i-1)) {
			   return false;
		 }
	}
	 
	 return true;}
}
