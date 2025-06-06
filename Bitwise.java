package first;

public class Bitwise {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);
		System.out.println(a<<1);
		System.out.println(a>>1);
		System.out.println(a>>>1);
		
		int num = 8;
		System.out.println((num&1)==0);


	}

}
