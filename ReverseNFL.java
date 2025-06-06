package first;

public class ReverseNFL {

	public static void main(String[] args) {
		
		int num = 12344;
		int reserved = 0;
		
		for(; num!= 0; num = num/10) {
			int digit = num % 10;
			reserved = reserved * 10 + digit;
			
		}
		
		System.out.println("Reversed NO: " + reserved);

	}

}