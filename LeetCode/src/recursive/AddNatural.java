package recursive;

public class AddNatural {

	public static void main(String[] args) {
		int n=sumn(5);
		System.out.println(n);
 
	}
	public static int sumn(int a) {
		if(a==0)
			return 0;
		return a+sumn(--a);
			
	}

}
