package first;

public class IsAlphabet {

	public static void main(String[] args) {
		char c = 't';
		if (Character.isAlphabetic(c)) {
			System.out.println("Alphabet :" + c);
			
		}
		else {
			System.out.println("is not Alphabet :" + c);
		}
	}

}
