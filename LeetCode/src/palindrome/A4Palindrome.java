package palindrome;

import java.util.Scanner;

public class A4Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter an Integer");
		int a=sc.nextInt();
		System.out.println(isPalindrome(a));
        

	}
       static boolean isPalindrome(int n ){
    	   int sum=0;
    	   int num=n;
    		while(n>0)
    		{
    		sum=sum*10+n%10;
    		n=n/10;
    		}
    		return (sum==num)?true:false;
    	}
	
}
