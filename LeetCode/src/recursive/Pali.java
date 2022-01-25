package recursive;

public class Pali {
     
	public static void main(String[] args) {
		int n=pali(12423);
		System.out.println(n);

	}
	public static int pali(int a) {
		if(a<=0) return 1;
		return (a%10)*10000+pali(a/10);
	}

}
