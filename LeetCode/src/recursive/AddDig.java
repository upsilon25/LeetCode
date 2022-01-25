package recursive;

public class AddDig {

	public static void main(String[] args) {
		int n=pali(12423);
		System.out.println(n);

	}
	public static int pali(int a) {
		if(a<=0) return 0;
		return (a%10)+pali(a/10);
	}
}
