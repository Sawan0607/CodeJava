package first;

public class ReverseNum {

	public static void main(String[] args) {
		int num = 23637 , reversed = 0;
		System.out.println(num);
		
		while(num !=0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			
			num /=10;
		}
		System.out.println(reversed);

	}

}
