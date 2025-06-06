package first;

public class AlphabetIfElse {
	public static void main(String[] args) {

	char c = 'a';
	
	if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
		System.out.println("Alphabet " + c);
	}
	else {
		System.out.println("Not Alphabet" + c);
	}

}
}